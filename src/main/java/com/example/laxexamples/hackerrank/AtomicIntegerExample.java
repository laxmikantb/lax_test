
 import java.util.concurrent.atomic.AtomicInteger;

 public class AtomicIntegerExample {
  private static AtomicInteger at = new AtomicInteger(0);
  static class MyRunnable implements Runnable {
      private int myCounter;
      private int myPrevCounter;
      private int myCounterPlusFive;
      private boolean isNine;
      private int myCurrentCounter;


      public void run() {
    	  for (int i=0; i < 10; i++) {
    	  myCurrentCounter = at.get();
          System.out.println("Thread " + Thread.currentThread().getId() + "  / myCurrentCounter : " + myCurrentCounter);
          
          myCounter = at.incrementAndGet();
          System.out.println("Thread " + Thread.currentThread().getId() + "  / Counter : " + myCounter);
          myPrevCounter = at.getAndIncrement();
          System.out.println("Thread " + Thread.currentThread().getId() + " / Previous : " + myPrevCounter); 
          myCounterPlusFive = at.addAndGet(5);        
          System.out.println("Thread " + Thread.currentThread().getId() + " / plus five : " + myCounterPlusFive);
          isNine = at.compareAndSet(9, 3);
          if (isNine) {
              System.out.println("Thread " + Thread.currentThread().getId() 
                      + " / Value was equal to 9, so it was updated to " + at.intValue());
          }
    	  }
      }
  }

  public static void main(String[] args) {
      Thread t1 = new Thread(new MyRunnable());
      Thread t2 = new Thread(new MyRunnable());
      t1.start();
      t2.start();
  }
}

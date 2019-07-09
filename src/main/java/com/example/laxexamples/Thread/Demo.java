import java.util.concurrent.*;
import java.util.concurrent.locks.*;
public class Demo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		ThreadGroup g = new ThreadGroup("grp1");
		System.out.println(g.getParent().getName());
		ThreadGroup g2 = new ThreadGroup(g, "secGroup");
		System.out.println(g2.getParent().getName());
		Thread t1 = new Thread(g2,"First Thread");
		Thread t2 = new Thread(g2,"Sec Thread");
		g2.setMaxPriority(3);
		Thread t3 = new Thread(g2,"Third Thread");
		System.out.println(t2.getPriority());
		System.out.println(t1.getPriority());
		System.out.println(t3.getPriority());
		g2.list();
		System.out.println(g2.activeCount());
		System.out.println(g2.activeGroupCount());
		
		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
		Thread[] t = new Thread[system.activeCount()];
		system.enumerate(t);
		for (Thread th : t) {
			System.out.println(th.getName() + "'------" + th.isDaemon());
			
		}
		
		final Lock reentrantLock = new ReentrantLock();
		reentrantLock.tryLock();

		
	}
	

}



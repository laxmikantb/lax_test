
public class FiniteStateMachine {
    
	static class FSM {
		private State[] states = { new A(), new B(), new C()};
		private int[][] transition = {{2,1,0},{0,2,1}, {1,2,2}};
		
		private int current = 0;
		private void next(int msgtype)
		{
			current = transition[current][msgtype];
		}
		
		public void on() {
			states[current].on();
			next(0);
		}
		
		public void off() {
			states[current].off();
			next(1);
		}
		
		public void ack() {
			states[current].ack();
			next(2);
		}
	}
	public static void main(String[] args) {
		FSM f= new FSM();
		int[] msgs = {2, 1, 2, 1, 0, 2, 0 ,0};
		for (int msg : msgs) {
			if (msg ==0)
				f.on();
			else
				if (msg == 1) {
					f.off();
				}
				else
						f.ack();
		}
	}

}


public class Packet {
	static volatile int runningseqno;
	
	private enumLab i;
	private int j;
	private int msgno;
	
	public int hashCode() {
		return i.hashCode() * 10 + j;
	}
	
	public boolean equals(Packet obj) {
		if (this.i == obj.i && this.j == obj.j && this.msgno == obj.msgno)
			return true;
		return false;
	}
	
	
}

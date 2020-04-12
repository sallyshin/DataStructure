package data_structure_2020;

public class Status {
	public int now;
	public int min;
	public int max;
	
	public Status(int now, int min, int max) {
		this.now = now;
		this.min = min;
		this.max = max;
	}
	
	@Override
	public String toString() {
		return now + " " + min + " " + max;
	}
}

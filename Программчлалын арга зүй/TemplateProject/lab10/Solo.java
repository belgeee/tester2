package lab10;

public class Solo {
	//Toog object bolgoh buyu utga butsaah//
	
	public Solo(int a) {
		num = a;
	}
	
	public int getFirst() {
		return num;
	}
	
	public void setFirst(int a) {
		num = a;
	}

	public String toString() {
		return "'"+num+"'";
	}
	
	
	private int num;

}
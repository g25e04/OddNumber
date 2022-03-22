package summer011;

public class isOddNumber {

	private int number;
	
	public isOddNumber() {
		// TODO Auto-generated constructor stub
	}

	public isOddNumber(int number) {
		setNum(number);
	}
	
	
	public int getNum() {
		return number;
	}
	
	public void setNum(int number) {
		this.number=number;;
	}
	
	public boolean Detection() {
		boolean status;
		if(getNum()%2 == 0 || getNum() == 1) {
			status = false;
			return status;
		}
		else {
			status = true;
			return status;
		}
	}
	
	public String toString() {
		if(Detection() == false)
			return "The number muse be an odd number and bigger than 1.\n";
		else
			return "";
	}
}

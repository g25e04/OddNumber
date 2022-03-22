package summer011;

public class Calculation {

	private int num;
	
	public Calculation() {
		// TODO Auto-generated constructor stub
	}

	public Calculation(int num) {
		setNum(num);
	}
	
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public int line() {
		int line = getNum() / 2 +1; //¨D¦æ¼Æ
		
		return line;
	}
	
	public int answer() {
		int first = 0;
		int a = (line()-1)*(line()-1); 
		first = a*2 +1 ;
		for(int i = 0;i<getNum()-1;i++)
			first += 2;
		first = first + (first-2) + (first-4);
		return first;
	}
	
	public String toString() {
		return "The answer is "+ answer();
	}
}

package summer011;
//§d²Ð¦w U10716012

import java.util.Scanner;

public class summer011 {

	public summer011() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input odd number :");
		

		while(sc.hasNext()) {
			String all = sc.nextLine();
			String [] temp = all.split("\\s+");
			for(int i = 0; i<temp.length;i++) {
			int number = Integer.parseInt(temp[i]);
		isOddNumber de = new isOddNumber(number);
		System.out.print(de.toString());
		if(de.Detection()==true) {
		Calculation C1 = new Calculation(number);
		System.out.println(C1.toString());
		}
			}
		System.out.print("Please input odd number :");
		}
	}

}

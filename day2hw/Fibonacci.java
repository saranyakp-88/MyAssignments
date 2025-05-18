package week1.day2hw;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = 0;
		int n2 = 1;
		System.out.println(+n1+"\n"+n2);
		for (int i = 2; i < 8; i++) {
			int n3 = n1 + n2;
			System.out.println(+n3);
			n1 = n2;
			n2 = n3;
		}
				

	}

}

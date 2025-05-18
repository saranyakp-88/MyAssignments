package week1.day2hw;

public class IsPrime {
	public static void main(String[] args) {
		int n = 6;
		//boolean isPrime = true;
		int count = 0;
		for (int i=2;i<=n-1;i++) 
		{
			if (n%i==0)
			{
				count++;
			}
		}
		//if (isPrime) {
		if (count > 0)	{
		System.out.println("the number is not Prime number:"+n);
		} 
		else { 
			System.out.println("the number is Prime number:"+n);
		}
	}
}
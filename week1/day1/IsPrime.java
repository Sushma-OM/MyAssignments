package week1.day1;


public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=13;
		boolean prime=true;
		for (int i = 2; i<num; i++) {
		if (num%i==0)	{
			System.out.println(num+" Is Not Prime");
		prime=false;
		break;
		}
		}
		 if(prime==true) {
		 System.out.println(num+" Is  Prime");
		 }
	}

}

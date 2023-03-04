package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0;
		int j=1;
		int p=0;

		System.out.println(k);
		//System.out.println(j);
		for (int i = 1; i <11;i++) {
		     
			p=k+j;
			k=j;
			j=p;
			
			System.out.println(p);
			
			
			}
		}

	}



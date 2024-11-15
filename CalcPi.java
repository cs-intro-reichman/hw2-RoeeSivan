// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int terms = Integer.parseInt(args[0]);
		int sign=0;
		int denominator=1; //מכנה
		int counter=1;//up
		double proxy=0;//pi approximated
		for(int i =0;i<terms;terms--)
		{
			if(terms%2==0)
			{
				proxy+=(double)counter/denominator;
				denominator+=2;
			}
			if(terms%2!=0)
			{
			 proxy-=(double)counter/denominator;
			 denominator+=2;
			}
		}
		System.out.println("pi according to Java:     "+Math.PI);
		System.out.println("pi, approximated:     "+proxy*4);
		
	}
}

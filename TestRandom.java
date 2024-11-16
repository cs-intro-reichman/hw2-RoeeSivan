// 
public class TestRandom {
	public static void main(String[] args) {
	// Replace this comment with your code
		int number = Integer.parseInt(args[0]);
		int count1=0,count0=0;
		double ratio=0.0;
		boolean t;
		for(int i =0;i<=number;i++)
		{
			if(Math.random()<0.5)
			{
					count0++;
			}
			else
			{
					count1++;
			}
		}
		t = ((count0==0)||(count1==0));
		if ((count0>count1) &&(!t))
		{
			ratio = (double)count1/count0;
		}
		if((count1>count0) && (!t))
		{
			ratio = (double)count0/count1;
		}
		if(t)
		{
				System.out.println("> 0.5: "+count0+" times");
				System.out.println("<= 0.5: "+count1+" times");
		}
		else
		{
		System.out.println("> 0.5: "+count0+" times");
		System.out.println("<= 0.5: "+count1+" times");
		System.out.println("Ratio: "+ratio);
		}
	}
}
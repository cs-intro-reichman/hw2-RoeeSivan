public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int terms = Integer.parseInt(args[0]);
		double proxy=0.0;//pi approximated
		if(terms==1)//special case
		{
			proxy=1.0;
			System.out.println("pi according to Java: " + Math.PI);
			System.out.println("pi, approximated:     " + (proxy * 4)); 
		}
		for(int i =1;i<=terms;i++)// i will be the index of the series as i go on
		{
			proxy+=Math.pow(-1,i+1)/(2*i-1);
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + (proxy * 4.0)); 
	}
}

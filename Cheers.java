// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
            int number = Integer.parseInt(args[0]);
            int count1,count0;
            for(int i =0;i<number;i++)
            {
                if(Math.random()<0.5)
                {
                        count0++;
                }
                else{
                        count1++;
                }
            }

        }
}

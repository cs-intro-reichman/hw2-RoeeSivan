// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) 
        {
	    // Replace this comment with your code
            String word = args[0];
            word = word.toUpperCase();
            String change = "AEFHILMNORSX";
            int numPrint = Integer.parseInt(args[1]);
            char ch;
            //Check for change
            for(int i=0;i<word.length();i++)
            {
                ch=word.charAt(i);
                if (change.indexOf(ch)==-1)
                {
                  System.out.println("Give me a  "+ch+": "+ch+"!"); 
                }
                if(change.indexOf(ch)!=-1)
                {
                        System.out.println("Give me an "+ch+": "+ch+"!"); 
                }
            } 
            System.out.println("What does that spell?");
            for(int j=0;j<numPrint;j++)
            {
                System.out.println(word + "!!!");
            }
            
        }
}

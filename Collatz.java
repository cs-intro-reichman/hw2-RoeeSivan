public class Collatz {
    public static void main(String args[]) {
        int first = Integer.parseInt(args[0]);
        String mode = args[1]; // "v" for verbose or "c" for concise

        for (int n = 1; n <= first; n++) { // Outer loop: iterate from 1 to first
            int current = n;
            int steps = 1;

            if (mode.equals("v")) { // Verbose mode
                System.out.print(current + " ");
            }
            do {
                steps++;
                if (current % 2 == 0) {
                    current = current / 2;
                } 
				else
				{
                    current = current * 3 + 1;
                }
                if (mode.equals("v")) 
				{
                    System.out.print(current + " ");
                }
            } 
			while (current != 1);

            if (mode.equals("v")) {
                System.out.println("(" + steps +")");
            }
        }
			// Concise mode
           System.out.println("Every one of the first " + first + " hailstone sequences reached 1.");
    }
}

public class CountDownFromArgs {
    public static void main ( String[] args) { 
        try {
            int inputArg = Integer.parseInt ( args[0]);
            if (inputArg < 0)
                 System.out.println("Error: you have a negative number");
            else {
                for (int i = inputArg; i >=0; i--) {
                    System.out.println(i);
                        }
                }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No argument provided");
        } catch (NumberFormatException e2) {
            System.out.println("Please only insert integers!");
        }
         
    } 
}

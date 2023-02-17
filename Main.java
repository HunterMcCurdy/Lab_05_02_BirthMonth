public class Main {
    public static void main(String[] args) {
        // declares birth month
        int birthMonth = 14;
        // asks if birth month is in between 1 and 12
        if((birthMonth >=1) && (birthMonth <13))
        {
            // prints birth month
            System.out.println("Your birth month is " + birthMonth);
        }
        // if birth month is not in between 1 and 12
        else
        {
            // prints error and gives input
            System.out.println("You enter an incorrect value: " + birthMonth);
        }





    }
}
import java.util.Scanner;

public class team {
    
    public static void main(String[] args) {
        
        /*
         * add team member
         * view team member
         * view all team members
         * delete team member by position
         * delete all team memebers
         */

         String[] team = new String[5];
         Scanner scan = new Scanner(System.in);
         int decision = 0;

         while(decision != -1){
            displayMenu();
            decision = scan.nextInt();
         }
    }

    private static void displayMenu() {
        System.out.println("Please pick an option or enter -1 to exit.");
        System.out.println("(1) show team");
        System.out.println("(2) show a team member");
        System.out.println("(3) add a team member");
        System.out.println("(4) delete a team member");
        System.out.println("(5) delete ALL team member");

    }
}
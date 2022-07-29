import java.util.Scanner;

public class team {
    
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        /*
         * add team member
         * view team member
         * view all team members
         * delete team member by position
         * delete all team memebers
         */
        
         String[] team = new String[5];
         
         int decision = 0;

         while(decision != 6){
            displayMenu();
            decision = scan.nextInt();
            if(decision < 1 || decision > 6){
                System.out.println("Please pick a valid option");
            } else if(decision == 1){
                //show team
                showTeam(team);
            } else if(decision == 2){
                // show a team member
                showATeamMemeber(team);
            } else if(decision == 3){
                //add a team member
               // addTeamMember(team);
            } else if(decision == 4){
                //delete a team member
                //deleteATeamMember(team);
            } else {
                //delete all team members
                //deleteAllTeamMemebers();
            }
         }
    }

    //show all team members
    private static void showTeam(String[] team) {
        System.out.println("Team:");
        for(int i = 0; i < team.length; i++){
            System.out.println(i + ": " + team[i]);
        }
    }

    //show a team member by position
    private static void showATeamMemeber(String[] team) {
        System.out.println("Which team member would you like to see?");
        int teamMember = scan.nextInt();
        if(teamMember < 0 && teamMember > team.length - 1){
            System.out.println(teamMember + ": " + team[teamMember]);
        } else {
            System.out.println("invalid player");
        }
    }

    private static void displayMenu() {
        System.out.println("Please pick an option or enter 6 to exit.");
        System.out.println("(1) show team");
        System.out.println("(2) show a team member");
        System.out.println("(3) add a team member");
        System.out.println("(4) delete a team member");
        System.out.println("(5) delete ALL team members");

    }
}
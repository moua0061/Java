import java.util.Scanner;

public class team {
    
    static Scanner scan = new Scanner(System.in);
    static int addingIndex = 0;
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
               addTeamMember(team);
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
        int teamNumber = scan.nextInt();
        if(validateInput(teamNumber)){
            System.out.println(teamNumber + ": " + team[teamNumber]);
        }
    }

    //add a team member
    public static void addTeamMember(String[] team) {
        System.out.println("Enter new member name: ");
        String newMember = scan.next();
        if(validateInput(addingIndex)){
            team[addingIndex++] = newMember;
            //addingIndex++;
        }
    }

    //to check if the input is valid between 0-5
    public static boolean validateInput(int input){
        if(input >= 0 && input < 5){
            return true;
        } else {
            System.out.println("invalid entry");
            return false;
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
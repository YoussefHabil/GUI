package Classes;

import java.util.Scanner;
import java.time.LocalDate;

public class main {
    static UsersManager UM = new UsersManager();
    static User currentUser = null;
    static BooksManager BM = new BooksManager();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n ------------------------   Welcome to Library Management System   ------------------------\n");
            LocalDate dt = LocalDate.now();
			dt = LocalDate.now();
		    System.out.println("				 Date:	" + dt );
            System.out.println("				 Select From The Following Options:              ");
            System.out.println("----------------------------------------------------------------------------------------------------------");
            System.out.println("Press 1 to Sign up");
            System.out.println("Press 2 to login");
            System.out.println("Press 0 to Exit .");
            System.out.println("----------------------------------------------------------------------------------------------------------");

            Scanner input = new Scanner(System.in);
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    UM.Register();
                    break;
                case 2:
                    UM.LoginView();
                    break;
                default:
                    System.out.println("Exit Successful");
            }
        } while (choice != 0);
    }
}

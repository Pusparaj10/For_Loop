import java.util.Scanner;

//WAP tp print Login System (Give 3 chance)
public class Login_system {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Username = "Binayak";
        String Password = "apple_0000";
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        for (int i = 1; i < 3 ; i++) {
            if (username.equals(Username) && password.equals(Password)) {
                System.out.println( "Login successful!");
            } else {
                System.out.println("Wrong entry try again Enter Username:");
                String user_name = scanner.nextLine();

                System.out.println("Password:");
                String pass_word = scanner.nextLine();
            }
        }

    }
}

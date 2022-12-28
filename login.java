import java.util.Scanner;
public class login {
    public static void main(String[] args) {

        String password, username, newLogin, newPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Username :");
        username = input.nextLine();

        System.out.print("Please Enter Password :");
        password = input.nextLine();

        if (username.equals("tugcee") && password.equals("84212421")) {
            System.out.print("Login Successful");
        } else {
            System.out.println("Failed to login.");
            System.out.println("Would you like to reset your password? (Yes or No) :");
        }
        newLogin = input.nextLine();
        if (newLogin.equals("yes")) {
            System.out.print("Please Enter New Password :");
        }if (newLogin.equals("no")){
            System.out.println("Try Again");
        }
        newPassword = input.nextLine();

        if (newPassword.equals("84212421")) {
            System.out.println("You entered incorrectly.");
            System.out.println("Your new password cannot be the same as the old one.\nPlease try again.");
        } else {
            System.out.println("Password changed successfully.");
        }

        }



    }


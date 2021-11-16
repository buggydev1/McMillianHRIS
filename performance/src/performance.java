import java.util.Scanner;

public class performance
{
    static String firstName;
    static String lastName;
    static int userIDReported;
    static String report;
    private static Object String;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean validLetter;
        String gradeLetter;

        do {
            System.out.println("Enter your employee ID: ");
            userIDReported = scanner.nextInt();
            System.out.println();
            System.out.println("Enter letter grade for your report: ");
            gradeLetter = scanner.next().toUpperCase();
            System.out.println();
            if(gradeLetter.equals("A") || gradeLetter.equals("B") || gradeLetter.equals("C") || gradeLetter.equals("D") || gradeLetter.equals("F"))
            {
                System.out.println("Enter your report: ");
                report = scanner.next();
                validLetter = true;
            }
            else
            {
                System.out.println("Enter a valid letter to grade employee performance");
                validLetter = false;
            }

            /*switch (gradeLetter) {
                case "A":
                    System.out.println("Enter your report: ");
                    report = scanner.nextLine();
                    break;

                case "B":
                    System.out.println("Enter your report: ");
                    report = scanner.nextLine();
                    break;

                case "C":
                    System.out.println("Enter your report: ");
                    report = scanner.nextLine();
                    break;

                case "D":
                    System.out.println("Enter your report: ");
                    report = scanner.nextLine();
                    break;

                case "F":
                    System.out.println("Enter your report: ");
                    report = scanner.nextLine();
                    break;

                default:
                    System.out.println("Enter valid letter to grade employee's performance.");
                    break;
            }*/

        } while (validLetter) ;
        //System.out.println("You must pick a letter between A and F.");

    }
}


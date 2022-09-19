import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        /*To be a leap year, the year must be divisible by 4
        except for end of century years, 1600, 1700, 1800, 1900, 2000
        which must be divisible by 400*/

        System.out.println("Welcome to The Leap Year Calculator !!!");

        System.out.println("Type a year:");

        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();

        if(year>0) {

            if (year % 100 == 0) {        // Calculate for end of century year (1700,1800,1900)

                if (year % 400 == 0) {    // nested if Condition
                    System.out.println(year + " is a leap year !!!");
                }
                else {
                    System.out.println(year + " is not a leap year !!!");
                }
            }
            else if(year % 4 == 0){     // Calculate for normal year
                System.out.println(year + " is a leap year !!!");
            }
            else{
                System.out.println(year + " is not a leap year !!!");
            }

        }

        else{
            System.out.println("Wrong input !!!");
        }

    }
}

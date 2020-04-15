import java.util.Scanner;

/*
The program gets three numbers from the user and prints out the smallest and largest number.
 */
public class SmallestLargestNumber {

    public static void main(String[] args) {

        // variable declaration.
        int num1;
        int num2;
        int num3;
        int min;
        int max;

        // prompt and receive three numbers from user
        Scanner input = new Scanner(System.in);
        System.out.print("Input the 1st number: ");
        num1 = input.nextInt();

        System.out.print("Input the 2nd number: ");
        num2 = input.nextInt();

        System.out.print("Input the 3rd number: ");
        num3 = input.nextInt();

        if(num1 == num2){
            if(num2 == num3){
                // condition where num1 = num2 = num3
                System.out.println("\nAll the three numbers are equal to: " + num1);
                min = max = num1;

            }
            else if(num2 > num3){
                // condition where num1 = num2 > num3
                min = num3;
                max = num2;
            }
            else{
                //condition where num3 > num1 = num2
                min = num2;
                max = num3;
            }
        }
        else if(num1 > num2){
            if(num1 >= num3){
                if(num2 >= num3){
                    // condition where num1 > num2 >= num3
                    min = num3;
                    max = num1;
                }
                else{
                    // condition where num1 > num3 > num2
                    min = num2;
                    max = num1;
                }
            }
            else{
                // condition where num3 > num1 > num2
                min = num2;
                max = num3;
            }

        }
        else if(num2 > num3){
            if(num1 < num3){
                // condition where num2 > num3 > num1
                min = num1;
                max = num2;
            }
            else{
                // condition where num2 > num1 > num3
                min = num3;
                max = num2;
            }
        }
        else{
            //condition where num3 > num2 > num1
            min = num1;
            max = num3;
        }

        System.out.println("\nThe Smallest number: " + min);
        System.out.println("The largest number: " + max);

    }
}

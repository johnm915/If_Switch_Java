import java.util.Scanner;


   //Take 3 numbers from user and print the greatest number
public class task_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter 1st number ");
        int input1 = scan.nextInt();

        System.out.println("Please enter 2nd number ");
        int input2 = scan.nextInt();

        System.out.println("Please enter 3rd number ");
        int input3 = scan.nextInt();

        if(input1 > input2 && input1 > input3) {
                System.out.println(input1 + " Is a larger number");
        }
        else if(input2 > input1 && input2 > input3) {
            System.out.println(input2 + " Is a larger number");
        }
        else {
            System.out.println(input3 + " Is a larger number");
        }


    }
}

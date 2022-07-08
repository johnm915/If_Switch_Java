import java.util.Scanner;

public class Project1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number to see if it is positive or negative");
         int input= scan.nextInt();

         if(input > 0){
             System.out.println(input + "" + " " + "is positive");
         }else {
             System.out.println(input + " " + "the number is negative");
         }


    }
}

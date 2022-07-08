import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);
             System.out.println("pick a month by number: (example 1 = January)");
             int days = scanner.nextInt();
             String month = "unknown";
             int day = 0;

            switch (days) {
                case 1:
                   // System.out.println("January ");
                    month = "January";
                    day =  31;
                    System.out.println(month + " " + "it has" +" " + day + " "+ "days in it");
                    // System.out.print(month);
                   // System.out.println(day + " "  +month);
                   // System.out.println("January has 31 days");
                    break;

                case 2:
                    System.out.println("February");
                    System.out.println("February has 28 days");

                    break;
                case 3:
                    System.out.println("March");
                    System.out.println("March has 31 days");
                    break;

                case 4:
                    System.out.println("April");
                    System.out.println("April has 30 days");
                    break;

                case 5:
                    System.out.println("May");
                    System.out.println("May has 31 days");
                    break;

                case 6:
                    System.out.println("June");
                    System.out.println("June has 30 days");
                    break;

                case 7:
                    System.out.println("July");
                    System.out.println("July has 31 days");
                    break;

                case 8:
                    System.out.println("August");
                    System.out.println("August has 31 days");
                    break;

                case 9:
                    System.out.println("September");
                    System.out.println("September has 30 days");
                    break;

                case 10:
                    System.out.println("October");
                    System.out.println("October has 31 days");
                    break;

                case 11:
                    System.out.println("November");
                    System.out.println("November has 30 days");
                    break;

                case 12:
                    System.out.println("December");
                    System.out.println("December has 31 days");
                    break;
                default:
                    System.out.println("Please select a month 1-12");
            }






    }
}

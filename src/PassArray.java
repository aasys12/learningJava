import java.util.Scanner; //Needed for Scanner Class
/*The program stores in an array hours worked by five employees
* who all make same hourly wage*/
public class PassArray {
    public static void main(String[] args) {


        final int EMPLOYEES = 5; //number of employees
        double payRate;
        double grossPay;

        //Create an array to hold hours
        int[] hours = new int[EMPLOYEES];

        Scanner input = new Scanner(System.in);

        //Get the hours Worked by Employees

        System.out.println("Enter the number of hours worked: ");
        for (int i = 0; i < EMPLOYEES; i++) {
            hours[i] = input.nextInt();
        }
            //Get the hourly rate

            System.out.println("Enter the hourly Rate: ");
            payRate=input.nextDouble();

            //Display the results

            System.out.println("The gross pay of the Employees are: ");
            for (int i = 0; i<EMPLOYEES ; i++) {
                grossPay=hours[i]*payRate;
                System.out.println("Employees "+(i+1)+" Earn "+grossPay);
            }




    }

}

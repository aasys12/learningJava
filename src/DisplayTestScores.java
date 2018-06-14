import java.util.Scanner;
public class DisplayTestScores {
    public static void main(String[] args) {
        int numTests = 0;

        System.out.println("How many test do you have: ");
        Scanner input=new Scanner(System.in);
        numTests=input.nextInt();
         int test[]= new int[numTests];
        for (int i = 0; i < test.length; i++) {
            System.out.println("Enter the number of Scores "+(i+1)+"=");
            test[i]=input.nextInt();

        }
        //Display the result

        System.out.println("Here are the test Score you entered ");
        for (int i = 0; i <test.length ; i++) {
            System.out.println(test[i]);

        }
    }
}

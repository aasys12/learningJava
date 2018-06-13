public class testVoidMethod {
    public static void Grade(double Score) {
        if (Score >= 90) {
            System.out.println("A");
        }
        else if (Score >= 80) {
            System.out.println(" B");
        } else
            System.out.println("F");


    }

    public static void main(String[] args) {
        System.out.print("The grade is ");
        Grade(92.0);
    }
}


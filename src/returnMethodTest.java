public class returnMethodTest {
    public static void main(String[] args) {
        System.out.println("The grade is "+grade(93.0));
    }
    public static char grade(double Score){
        if(Score>=90){
            return 'A';
        }
        else  if(Score>=80){
            return 'B';
        }
        else return 'F';
    }
}

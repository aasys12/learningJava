public class sum {
    public static int add(int i1, int i2){

        int result=0;
        for (int i = i1; i <i2 ; i++) {
            result += i;
        }
        return result;
        }

    public static void main(String[] args) {
        System.out.println("Sum from 1 to 10 is "+ add(1,10));
        System.out.print("Sum from 1 to 10 is "+ add(20,30));
    }
}

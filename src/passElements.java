
/*This Program demonstrates passing individual array elements as arguments
 * to a method*/
public class passElements {
    public static void showValue(int n){
        System.out.println(n+" ");
    }

    public static void main(String[] args) {
        int [] numbers={5,10,15,15,30};
        for (int i = 0; i < numbers.length; i++) {
            showValue(numbers[i]);

        }
    }


}

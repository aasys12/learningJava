
//The program demonstrates that two variable reference the same array
//You cannot copy the array by merely assigning one variable to another
//To copy the array we should copy individual element by using a loop
public class sameArray {
    public static void main(String[] args) {
        int[] array1={2,4,6,8,10};
        int[] array2=array1;

        //Change the values

        array1[0]=300;

        array2[3]=1000;

        //display the result
        System.out.println("The contents of the first Array ");
        for (int value : array1) {
            System.out.println(value);
        }

        System.out.println("The contents of the second Array ");
        for (int value:array2) {
            System.out.println(value);
        }
    }
}

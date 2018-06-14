public class testPassArray {
    public static void main(String[] args) {
        int [] a={1,2};
        System.out.println("Before invoking the swap ");
        swap(a[0],a[1]);
        System.out.println("Answer"+a[0]+"&&"+a[1]);
        System.out.println("After invoking the swap ");
        swapInArrays(a);
        System.out.println("Answer"+a[0]+"&&"+a[1]);
    }


    public static void swap(int n1, int n2){
       int temp=n1;
        n1=n2;
        n2=temp;

    }
    public static void swapInArrays(int[]array){
        int temp=array[0];
        array[0]=array[1];
        temp=array[1];
    }
}

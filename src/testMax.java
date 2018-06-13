public class testMax {
    public static int max(int i1,int i2){
        int result;


        if(i1>i2){
           result=i1;
        }
        else
            result=i2;

        return result;

    }

    public static void main(String[] args) {
        int a=5;
        int b=6;
        int c=max(a,b);
        System.out.println("The max is "+ c);
    }
}

public class testMethodOverloading {
    public static int max(int i, int j){
        if(i>j){
            return i;
        }
        else return j;
    }
    public static double max(double i, double j){
        if(i>j){
            return i;
        }
        else return j;
    }
    public static double max(double i, double j, double k){
        return  max(max(i,j),k);
    }

    public static void main(String[] args) {
        System.out.println("The max is "+max(5,10));
        System.out.println("The max is "+max(5.0,10.0));
        System.out.println("The max is "+max(5.0,10.0,4.0));
    }
}

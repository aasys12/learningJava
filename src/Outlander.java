public class Outlander extends car1 {
    private int roadserviceMonths;

    public Outlander( int roadserviceMonths) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadserviceMonths = roadserviceMonths;
    }
    public void accelerate(int rate){
        int newVelocity=getCurrentVelocity()+rate;
        if (newVelocity==0){
            stop();
            changeGears(1);
        }
        else if(newVelocity>0&&newVelocity<=10){
            changeGears(1);
        }
        else if(newVelocity>10&&newVelocity<=20) {
            changeGears(2);
        }
        else if(newVelocity>20&&newVelocity<=30) {
            changeGears(4);
        }
        if(newVelocity>0){
            changeVelocity(newVelocity,getCurrentDirection());

        }


    }
}

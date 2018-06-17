public class Car {
    private int doors;
    private int wheels;
    private String models;
    private String Engine;

    public void setModels(String models){
        String validModel=models.toLowerCase();
        if(validModel.equals("carrera")||validModel.equals("commodor")) {
            this.models = models;
        }
        else
            this.models="unknown";
    }

    public String getModels() {
        return this.models;
    }
}

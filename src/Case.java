public class Case {
    private String model;
    private String manufacturer;
    private String powersupply;
    private Dimenssion dimenssion;

    public Case(String model, String manufacturer, String powersupply, Dimenssion dimenssion) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powersupply = powersupply;
        this.dimenssion = dimenssion;
    }
    public void Presspowebutton(){
        System.out.println(" Power Button Pressed ");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowersupply() {
        return powersupply;
    }

    public Dimenssion getDimenssion() {
        return dimenssion;
    }
}

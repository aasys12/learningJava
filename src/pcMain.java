public class pcMain {
    public static void main(String[] args) {
        Dimenssion dimenssion =new Dimenssion(10,20,30);
        Case theCase=new Case("3000","DEll","2",dimenssion);
        Monitor monitor=new Monitor("rtx200","HP",20,new Resolution(40,50));
        Motherboard motherboard=new Motherboard("Asus","Dell",5,3,"v2.0");
        PersonalComputer personalComputer=new PersonalComputer(theCase,monitor,motherboard);
        personalComputer.getMonitor().drawPixelAt(2,3,"Red");
        personalComputer.getMotherboard().loadProgram("Windows 1.0");
        personalComputer.getTheCase().Presspowebutton();

    }
}

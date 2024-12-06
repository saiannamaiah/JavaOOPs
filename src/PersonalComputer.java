public class PersonalComputer extends Product{
    private ComputerCase computerCase;
    private Montitor monitor;
    private Motherboard motherboard;

    public PersonalComputer(String model, String manufacture,
                            ComputerCase computerCase,
                            Montitor monitor, Motherboard motherboard) {
        super(model, manufacture);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//
//    public Montitor getMonitor() {
//        return monitor;
//    }
//
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }

    private void drawLogo(){
        monitor.drawPixelAt(10,10,"yellow");
    }
    public void powerUp(){
        computerCase.pressPowerButton();
        drawLogo();
    }


}

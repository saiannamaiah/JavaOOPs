public class Motherboard extends Product {
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacture) {
        super(model, manufacture);
    }

    public Motherboard(String model, String manufacture, int ramSlots, int cardSlots, String bios) {
        super(model, manufacture);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }
    public void loadProgram(String programName){
        System.out.println("Program " + programName +" is Loadind....");
    }
}

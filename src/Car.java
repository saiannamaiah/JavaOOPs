public class Car {
    private String make;
    private String model;
    private String colour;
    private int doors;

    private boolean convertible;


    public String getMake () {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void describeCar() {

        System.out.println("My car is " +make + " name of model " +model + " which has a colour of " + colour + "and number of doors " + doors +" is " + (convertible ? "Convertible" : "not a Convertible"));
    }



}

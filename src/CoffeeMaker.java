public class CoffeeMaker {
    private boolean hasWorkToD;

    public void setHasWorkToD(boolean hasWorkToD) {
        this.hasWorkToD = hasWorkToD;
    }

    public void brewCofee() {
        if(hasWorkToD) {
            System.out.println("Making Hot Hot Coffee");
            hasWorkToD = false;
        }
    }
}

public class Montitor extends Product{
    private int size;
    private String resolution;

    public Montitor(String model, String manufacture) {
        super(model, manufacture);
    }

    public Montitor(String model, String manufacture, int size, String resolution) {
        super(model, manufacture);
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixelAt(int x, int y,String color){
        System.out.println(String.format("Drawing Pixel at points %d,%d in color %s  ", x,y,color));
    }
}

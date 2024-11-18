import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//
//Customer customer = new Customer("Sai", 1000.00, "saisaisai@gmail.com");
//        System.out.println(customer.getName());
//        System.out.println(customer.getCreditLimit());
//        System.out.println(customer.getEmailAddress());
//
//        Customer secondCustomer = new Customer();
//        System.out.println(secondCustomer.getName());
//        System.out.println(secondCustomer.getCreditLimit());
//        System.out.println(secondCustomer.getEmailAddress());
//
//Customer thirdCustomer =  new Customer("Joe", "joe@gmail.com");
//        System.out.println(thirdCustomer.getName());
//        System.out.println(thirdCustomer.getCreditLimit());
//        System.out.println(thirdCustomer.getEmailAddress());
//        Animal animal = new Animal("Mammal","Huge",400.00);
//        doAnimalStuff(animal,"fast");

//        Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");
//        var dim = new SalariedEmployee("Tim", "11/11/1985", "01/01/2020", 56000);
//
//        System.out.println(tim);
//        System.out.println(dim);
//
//
//        System.out.println("Age " + tim.getAge());
//        System.out.println("pay " + tim.collectPay());
//        System.out.println("Collect Pay" + dim.collectPay());
//        dim.retired();
//        System.out.println("Pension is" + dim.collectPay());
//
//        var computerCase = new ComputerCase("2208", "Dell", "240");
//        var montitor = new Montitor("27 inch Beast", "Acer", 27, "2540 x 1440");
//        var motherBoard = new Motherboard("Bg-200", "Asus", 4, 6, "v2.045");
//
//        var thePc = new PersonalComputer("2205","Dell",computerCase,montitor,motherBoard);
//
////        thePc.getMonitor().drawPixelAt(1,2,"red");
////        thePc.getMotherboard().loadProgram("Netflix");
////        thePc.getComputerCase().pressPowerButton();
//
//        thePc.powerUp();
//
        var newKitchen = new SmartKitchen();


//        newKitchen.getBrewMaster().setHasWorkToD(true);
//        newKitchen.getBrewMaster().brewCofee();
//        newKitchen.getDishwasher().setHasWorkToDo(true);
//        newKitchen.getDishwasher().doDishes();
//        newKitchen.getIceBox().setHasWorkToDo(true);
//        newKitchen.getIceBox().orderFood();

//        newKitchen.setKitchenState(true,true,false);
//        newKitchen.doKitchenWork();

//        var printer = new Printer(50,false);
//        System.out.println("Initial Page Count = "+ printer.getPagesPrinted());
//
//        int printPages = printer.printPages(10);
//        System.out.println("Pages Print = "+         printPages);
//        System.out.println("Total Page Count = "+ printer.getPagesPrinted());
//        printPages = printer.printPages(20);
//        System.out.println("Pages Print = "+         printPages);
//        System.out.println("Total Page Count = "+ printer.getPagesPrinted());
//
//        int[] myIntArray = new int[10];
//        myIntArray[5] = 69;
//
//        double[] myDoubleArray = new double[20];
//        myDoubleArray[2] = 6.9;

//        int[] myArrayIntitilaizer = new int[]{1,2,3,4,5,6,8,9};
//        int[] myIntilizerSeconfType = {1,2,3,4,5,6,7,8,9,};
//
//        System.out.println(myIntArray[5]);



    int[] unsortedArray = getRandomInteger(5);
        System.out.println(Arrays.toString(unsortedArray));




    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move("fast");
        System.out.println(animal);
    }

    public static int[] getRandomInteger(int len){
        Random random = new Random();

        int[] randomArray = new int[len];

        for (int i =0; i < len; i++){
            randomArray[i] = random.nextInt(1000);
        }
        return randomArray;
    }

    public static int[] sortIntegers(int[] array){
        int[] sortedArrays = Arrays.copyOf(array,array.length);

        boolean flag = true;
        int temp;

        while(flag) {
            flag = false;

            for(int i = 0; i < sortedArrays.length; i++) {
                if (sortedArrays[i] < sortedArrays[i + 1]) {
                    temp = sortedArrays[i];
                    sortedArrays[i] = sortedArrays[i + 1];
                    sortedArrays[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArrays;

    }

}
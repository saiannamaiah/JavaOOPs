public class SmartKitchen {
        private CoffeeMaker brewMaster;
        private Refrigerator iceBox;
        private Dishwasher dishwasher;

        public SmartKitchen(){
                brewMaster = new CoffeeMaker();
                iceBox = new Refrigerator();
                dishwasher = new Dishwasher();
        }

        public CoffeeMaker getBrewMaster() {
                return brewMaster;
        }

        public Refrigerator getIceBox() {
                return iceBox;
        }

        public Dishwasher getDishwasher() {
                return dishwasher;
        }

        public void setKitchenState(boolean coffeFlag,boolean fridgeFlag, boolean dishWasherFlag) {
                brewMaster.setHasWorkToD(coffeFlag);
                iceBox.setHasWorkToDo(fridgeFlag);
                dishwasher.setHasWorkToDo(dishWasherFlag);
        }

        public void doKitchenWork() {
                brewMaster.brewCofee();
                iceBox.orderFood();
                dishwasher.doDishes();
        }
}

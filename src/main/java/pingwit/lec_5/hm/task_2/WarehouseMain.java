package pingwit.lec_5.hm.task_2;

public class WarehouseMain {
    public static void main(String[] args) {

//        @Override
//        public boolean carsLeftInTheWarehouse() {
//            return Car.super.carsLeftInTheWarehouse();
//        }
        Car firstCar = new Car() {
        };

        if (firstCar.carsLeftInTheWarehouse()) {
            System.out.println("Test");
        }


    }
}

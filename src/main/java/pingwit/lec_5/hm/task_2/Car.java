package pingwit.lec_5.hm.task_2;

public interface Car {
    String manufacturer = null;
    String model = null;
    String modification = null;
    Integer id = 0;

    Car(String manufacturer, String model, String modification, Integer id) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.modification = modification;
        this.id = id;

    }

    default boolean carsLeftInTheWarehouse() {
        System.out.println("Some cars are available for now");
        return true;
    }


}

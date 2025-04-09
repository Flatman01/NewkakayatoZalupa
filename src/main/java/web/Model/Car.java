package web.Model;

public class Car {

    public String name;
    public String model;
    public String equipment;

    public Car(String name, String model, String equipment) {

        this.name = name;
        this.model = model;
        this.equipment = equipment;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

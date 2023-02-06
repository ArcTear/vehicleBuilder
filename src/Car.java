// Класс машины
public class Car {
    private int doors;
    private int wheels;
    private String name;

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", doors=" + doors +
                ", wheels=" + wheels +
                '}';
    }
}

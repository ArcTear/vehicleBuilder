// Строитель для фуры
public class TruckBuilder implements CarBuilder{
    private final Car truck = new Car();

    // Методы создания
    @Override
    public void buildWheels() {
        truck.setWheels(8);
    }

    @Override
    public void buildDoors() {
        truck.setDoors(2);
    }

    @Override
    public void setName() {
        truck.setName("Truck");
    }

    // Получение результата сборки
    @Override
    public Car getResultCar() {
        return truck;
    }
}

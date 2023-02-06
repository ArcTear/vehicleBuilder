// Строитель для машины купе
public class CoupeCarBuilder implements CarBuilder {
    private final Car coupe = new Car();

    // Методы сборки
    @Override
    public void buildWheels() {
        coupe.setWheels(4);
    }

    @Override
    public void buildDoors() {
        coupe.setDoors(2);
    }

    @Override
    public void setName() {
        coupe.setName("Coupe");
    }

    // Получение результата
    @Override
    public Car getResultCar() {
        return coupe;
    }
}

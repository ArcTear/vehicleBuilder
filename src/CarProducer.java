// Класс для управления строителями
public class CarProducer {
    CarBuilder carBuilder;

    public CarProducer(CarBuilder carBuilder){
        this.carBuilder = carBuilder;
    }

    public void CreateCar(){
        carBuilder.buildDoors();
        carBuilder.buildWheels();
        carBuilder.setName();
    }
}

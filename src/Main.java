public class Main {
    public static void main(String[] args) {
        // Создание купе
        CarBuilder coupeCarBuilder = new CoupeCarBuilder();
        CarProducer coupeProducer = new CarProducer(coupeCarBuilder);
        coupeProducer.CreateCar();
        System.out.println(coupeCarBuilder.getResultCar());

        // Создание фуры
        CarBuilder truckBuilder = new TruckBuilder();
        CarProducer truckProducer = new CarProducer(truckBuilder);
        truckProducer.CreateCar();
        System.out.println(truckBuilder.getResultCar());
    }
}

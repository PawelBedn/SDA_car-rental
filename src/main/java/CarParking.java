public class CarParking {
    private Car[] cars;

    public CarParking(int size) {
        cars = new Car[size];
    }

    public void add(Car toAdd) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == null) {
                cars[i] = toAdd;
                return;
            }
        }
    }


}

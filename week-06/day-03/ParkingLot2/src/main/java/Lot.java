public class Lot {
    public static void main(String[] args) {
       RandomEnum<Car> rCar = new RandomEnum<Car>(Car.class);
       RandomEnum<Color> rColor = new RandomEnum<Color>(Color.class);
       System.out.println(rCar.randomValue());
       System.out.println(rColor.randomValue());



    }
}


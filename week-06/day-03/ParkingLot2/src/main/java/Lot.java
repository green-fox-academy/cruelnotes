import java.util.ArrayList;

//        Count and Print the number of same vehicles for each type
//        Count and Print the number of same vehicles for each color
//        Print the most frequently occurring vehicle

public class Lot {
    public static void main(String[] args) {
        RandomEnum<Car> rCar = new RandomEnum<Car>(Car.class);
        RandomEnum<Color> rColor = new RandomEnum<Color>(Color.class);
        ArrayList<String> carList = new ArrayList<String>();

        for (int i =1; i <= 256 ; i++) {
            carList.add(rColor.randomValue() + "_" + rCar.randomValue());
        }

        for(String item : carList){
            if (item.contains())
            System.out.println(item);
        }


    }
}


package AsynchronousExercises;

public class ArrayAndArrayBack {
    public static void main(String[] args) {
        String[] cars = {"Accord", "Del Sol", "Civic", "CRV", "HRV"};

        System.out.println("Car names: ");

        for(int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }
        System.out.println("");
        System.out.println("Car names backward: ");
        for(int i = cars.length - 1; i >= 0; i--){
            StringBuffer car = new StringBuffer(cars[i]);
            car.reverse();
            System.out.println(car);
        }



    }


}

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorsGroup {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Audi");
        cars.add("Honda");
        cars.add("BMW");
        cars.add("Tesla");

        Iterator<String> it = cars.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        cars.remove(0);
        cars.add("Nissan");
        System.out.println(cars);


    }
}

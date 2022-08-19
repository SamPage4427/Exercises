package ClassObjectsCars;

public class CarDealer {
    public static void main(String[] args) {
        Cars car1 = new Cars("Audi", "i8", 2015, "Coupe");
        Cars car2 = new Cars("Nissan", "GTR R34", 1999, "Coupe");
        Cars car3 = new Cars("BMW", "E90", 2005, "Sedan");
        Cars car4 = new Cars("Audi", 50000, "Coupe");
        Cars car5 = new Cars("Mercedes", "AMG C-Class", 2014, "Sedan");
        Cars car6 = new Cars("Nissan", "GTR R36", "Coupe");

        String carDealer = car1.toString();
        int total1 = car1.totalCost(90000,20000);
        int payment1 = car1.paymentOption(90000,20000, 15);
        System.out.println(carDealer);
        System.out.println("The total price for this car with Add-ons is: $" + total1);
        System.out.println("The total down payment needed for this car is: $" + payment1);

        String carDealer2 = car2.toString();
        int total2 = car2.totalCost(25000,15000);
        int payment2 = car2.paymentOption(25000,15000, 13);
        System.out.println(carDealer2);
        System.out.println("The total price for this car with Add-ons is: $" + total2);
        System.out.println("The total down payment needed for this car is: $" + payment2);

        String carDealer3 = car3.toString();
        int total3 = car3.totalCost(35000,15000);
        int payment3 = car3.paymentOption(35000,15000, 13);
        System.out.println(carDealer3);
        System.out.println("The total price for this car with Add-ons is: $" + total3);
        System.out.println("The total down payment needed for this car is: $" + payment3);

        String carDealer4 = car4.toString();
        int total4 = car4.totalCost(25000,6000);
        int payment4 = car4.paymentOption(25000,6000, 5);
        System.out.println(carDealer4);
        System.out.println("The total price for this car with Add-ons is: $" + total4);
        System.out.println("The total down payment needed for this car is: $" + payment4);

        String carDealer5 = car5.toString();
        int total5 = car5.totalCost(50000,20000);
        int payment5 = car5.paymentOption(50000,20000, 10);
        System.out.println(carDealer5);
        System.out.println("The total price for this car with Add-ons is: $" + total5);
        System.out.println("The total down payment needed for this car is: $" + payment5);

        String carDealer6 = car6.toString();
        int total6 = car6.totalCost(90000, 30000);
        int payment6 = car6.paymentOption(90000,30000, 15);
        System.out.println(carDealer6);
        System.out.println("The total price for this car with Add-ons is: $" + total6);
        System.out.println("The total down payment needed for this car is: $" + payment6);



    }

}

package ClassObjectsCars;

public class Cars {
    //car facts
    String name;
    String model;
    int year;
    int mileage;
    String type;

    //cost of car
    int priceBase;
    int addOns;
    int percentage;


    public Cars(String model, String name, int year, String type) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.type = type;
    }

    public Cars(String model, int mileage, String type) {
        this.model = model;
        this.mileage = mileage;
        this.name = "Unknown";
        this.year = 2000;
        this.type = type;
    }
    public Cars(String model, String name, String type){
        this.model = model;
        this.name = name;
        this.year = 2022;
        this.mileage= 0;
        this.type = type;
    }

    @Override
    public String toString(){
        String returnValue = "";

        returnValue += "The model of the Car is: " + this.model + ". ";
        returnValue += "The make of the Car is: " + this.name + ". ";
        returnValue += "The year of " + this.model + " " + this.name + ": " + this.year + ". ";
        returnValue += "This car is a " + this.type + ".";
        return returnValue;
    }

    public int totalCost(int priceBase, int addOns) {
        int total = priceBase + addOns;
        return total;

    }

    int paymentOption(int priceBase, int addOns, int percentage) {
        int payment = (priceBase + addOns) / percentage;
        return payment;
    }
}
package InheritancePolymorphEncapsulationExercise;

public class Games {
    String game;
    String gameType;
    String type;

    int price;
    double sales;
    int salePrice;



    public Games(String game, String gameType, String type, int price){
        this.game = game;
        this.gameType = gameType;
        this.type = type;
        this.price = price;
        this.sales = 10000000;


    }
    public Games(String game, String gameType, String type, int price, int salePrice){
        this.game = game;
        this.gameType = gameType;
        this.type = type;
        this.price = price;
        this.sales = 10000000;
        this.salePrice = salePrice;


    }

    public Games(String game, String gameType, String type, double sales){
        this.game = game;
        this.gameType = gameType;
        this.type = type;
        this.price = 60;
        this.sales = sales;


    }


    @Override
    public String toString(){
        String returnValue = "";

        returnValue += "The name of the game is " + this.game + ". ";
        returnValue += "The type of game is " + this.gameType + ". ";
        returnValue += "This game is a " + this.type + ". ";
        returnValue += "The market price of the game is $" + this.price + ". ";
        returnValue += "This game sold " + this.sales + " copies. ";
        returnValue += "This game is on sale for $" + this.salePrice;
        return returnValue;
    }



}

package InheritancePolymorphEncapsulationExercise;

public class GameSales {

    private double sales;
    private String game;

    public GameSales(){

    }
    public GameSales(int sales, String game){
        this.sales = sales;
        this.game = game;
    }

    public double getSales(){
        return this.sales;
    }
    public void setSales(double sales){
        if (sales < 900000) {
            this.sales = sales;
            System.out.println("This game has a specific audience");
        } else if(sales > 1000000) {
            this.sales = sales;
            System.out.println("This game is very popular");
        }
    }

    public String getGame(){
        return this.game;
    }
    public void setGame(String game){
        this.game = game;
    }
    @Override
    public String toString(){
        return "Game Sales{" +
                "Game Name: " + game + " " +
                "Number of copies sold: " + sales
                +"}";
    }
}

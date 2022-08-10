package InheritancePolymorphEncapsulationExercise;

public class VideoGames extends Games {

    int salePrice;

    public VideoGames(String game, String gameType, String type, double sales, int salePrice){
        super(game, gameType, type, sales);
        this.salePrice = salePrice;

    }
    // Not all Video Games are games

    public void vg_only(){
        System.out.println("This method only applies to Video Games.");
        System.out.println(super.type);
    }



}

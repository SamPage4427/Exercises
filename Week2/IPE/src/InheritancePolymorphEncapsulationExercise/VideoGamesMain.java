package InheritancePolymorphEncapsulationExercise;

public class VideoGamesMain {
    public static void main(String[] args) {
        //Games:
        Games skyrim = new Games("Skyrim", "RPG", "Video Game", 60, 30);
        Games dAndD = new Games("Dungeons & Dragons", "RPG", "Board Game", 20);

        String game = skyrim.toString();
        System.out.println(game);
        String game2 = dAndD.toString();
        System.out.println(game2);
        System.out.println("");

        //Video Games:

        VideoGames mw = new VideoGames("Modern Warfare","FPS", "Video Game", 30000000.0, 15);
        mw.vg_only();
        System.out.println("");

        //Game Sales:

        GameSales sales1 = new GameSales();
        sales1.setSales(30000000);
        sales1.setGame("Skyrim");

        System.out.println(sales1.toString());
        System.out.println(sales1.getSales());

        GameSales sales2 = new GameSales();
        sales2.setSales(800000);
        sales2.setGame("No Man's Sky");

        System.out.println(sales2.toString());
        System.out.println(sales2.getSales());

    }
}

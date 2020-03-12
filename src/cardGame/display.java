package cardGame;

public class display {
    public display(String[]array){
        int x=0;
        for (x = 0; x < 13; x++) {
            System.out.print(array[x] + "|");
        }
        System.out.println(" ");

    }
}

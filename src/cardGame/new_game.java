package cardGame;




public class new_game {
    public static void main(String[] args) {
        int a, b, c, d, k;
        int a1, b1, c1, d1;
        a1 = b1 = c1 = d1 = 0;
        int temp;
        String[] card = new String[52];
        String[] player1 = new String[13];
        String[] player2 = new String[13];
        String[] player3 = new String[13];
        String[] player4 = new String[13];
        card = createCard.createCard(card);

        for (a = 0; a < 52; a++) {
            if (a >= 0 && a < 13) {
                player1[a1] = card[a];
                a1++;
            }
            if (a >= 13 && a < 26) {
                player2[b1] = card[a];
                b1++;
            }
            if (a >= 26 && a < 39) {
                player3[c1] = card[a];
                c1++;
            }
            if (a >= 39 && a < 52) {
                player4[d1] = card[a];
                d1++;
            }

        }

        System.out.println("player1");
        new display(player1);

        System.out.println("player2");
        new display(player2);

        System.out.println("player3");
        new display(player3);

        System.out.println("player4");
        new display(player4);



    }
}

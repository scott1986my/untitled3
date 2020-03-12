package cardGame;

import java.util.Random;

public class createCard {

    public static void shuffle( String[] array) {
        Random random = new Random();
        int length = array.length;
        for (int i = length; i > 1; i--) {
            // 把随机位置交换到当前位置，既然是随机，就应该保证位置可能不变的情况，因此 random.nextInt 取 i
            // 谢谢 [virtualspider](https://www.jianshu.com/u/cfb9abcf0c97) 的提醒

            swap(array, i - 1, random.nextInt(i));
        }
    }

    private static void swap(String[] array, int i, int j) {
        if (i != j) {
            String temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public static String[] createCard (String[] array) {


        int i, j, k;
        int temp1, temp2;

        String [] card = new String[52];

        for (i = 0; i < 52; i++) {
            temp1 = i % 4;
            if (temp1 == 0) {
                card[i] = "♠";
            }
            if (temp1 == 1) {
                card[i] = "♥";
            }
            if (temp1 == 2) {
                card[i] = "♣";
            }
            if (temp1 == 3) {
                card[i] = "♦";
            }
            temp2 = i % 13;
            if (temp2 == 0) {
                card[i] = card[i] + " K";
            } else if (temp2 == 1) {
                card[i] = card[i] + " A";
            } else if (temp2 == 11) {
                card[i] = card[i] + " J";
            } else if (temp2 == 12) {
                card[i] = card[i] + " Q";
            } else
                card[i] = card[i] + " " + String.valueOf(temp2);
        }
        shuffle(card);
//        for (k = 0; k < 52; k++) {
//            System.out.println(card[k]);
//        }
        return card;
    }



}
package chapter01;

public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word;

        while (beerNum >= 0) {
            if (beerNum % 10 == 1 && beerNum != 11) {
                word = "бутылка";
            } else {
                word = "бутылок (бутылки)";
            }
            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " пива на стене");
                System.out.println(beerNum + " " + word + " пива.");
                System.out.println("Возьми одну.");
                System.out.println("Пусти по кругу.");
                beerNum--;
            } else {
                System.out.println("Нет бутылок пива на стене!");
                beerNum--; // or break?
            }
        }
    }
}

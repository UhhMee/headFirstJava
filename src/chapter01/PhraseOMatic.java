package chapter01;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"ListOne1", "ListOne2", "ListOne3"};
        String[] wordListTwo = {"ListTwo1", "ListTwo2", "ListTwo3"};
        String[] wordListThree = {"ListThree1", "ListThree2", "ListThree3"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("Итог: " + phrase);
    }
}

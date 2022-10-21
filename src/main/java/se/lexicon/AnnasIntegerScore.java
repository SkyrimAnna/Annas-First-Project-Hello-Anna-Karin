package se.lexicon;

public class AnnasIntegerScore {
    public static void main(String[] args) {
        int testScore = 65;
        if (testScore >= 65) {
            System.out.println("Hurray, you past!");
        } else if (testScore <= 64 && testScore >= 55) {
            System.out.println("You are almost there");
        } else {
            System.out.println("Sorry you did not pass");
        }


    }
}


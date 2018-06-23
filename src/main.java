import counting.LetterCount;

public class main {

    public static void main(String[] args){
        String note = "Im coming to get you";
        String newsPaper = "Im coming to get you";

        LetterCount p = new LetterCount(note);
        p.canMakeNote(newsPaper);
    }
}

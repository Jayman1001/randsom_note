package counting;

import java.util.HashMap;
import java.util.Map;

public class LetterCount {


    private Map<Character, Integer> noteCountMap;


    public LetterCount(String note) {
        int numOf;
        noteCountMap = new HashMap<>();
        for (int i = 0; i < note.length(); i++) {
            char c = note.charAt(i);

            if (c == ' ') {
                continue;
            }

            if (!noteCountMap.containsKey(c)) {
                noteCountMap.put(c, 1);

            } else {
                numOf = noteCountMap.get(c);
                numOf++;
                noteCountMap.put(c, numOf);

            }
        }
    }

    public void canMakeNote(String newsPaper) {
        for (int i = 0; i < newsPaper.length(); i++) {

            char c = newsPaper.charAt(i);
            if (c == ' ') {
                continue;
            }

            if (noteCountMap.containsKey(c)) {
                int numOf = noteCountMap.get(c);
                int newVal = numOf - 1;
                if (newVal == 0){
                    noteCountMap.remove(c);
                } else {
                    noteCountMap.put(c, newVal);
                }
            }


            }
        if (noteCountMap.isEmpty()) {
            System.out.println("Congratulations! your kidnapping wasn't all for nothing as you can now begin your highly illegal capitalist venture, good luck!");
            System.exit(0);
        } else {
            System.out.println("There are not enough letters within this newspaper for your note");
            System.exit(0);
        }
        }
    }


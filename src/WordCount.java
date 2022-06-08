import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class WordCount {

    private class Element {

        String word;
        Integer count;

        Element(String word, Integer count) {
            this.word = word;
            this.count = count;
        }
    }


    ArrayList<Element> getTopWords(String input) {

        String[] text = input.split(" ");

        HashMap<String, Integer> wordList = countWords(text);
        ArrayList<Element> topWords = sortWords(wordList);

        return topWords;

    }

    HashMap<String, Integer> countWords(String[] text) {

        HashMap<String, Integer> wordMap = new HashMap<String, Integer>();

        for (String s : text) {
            if (wordMap.containsKey(s)) {
                wordMap.put(s, wordMap.get(s) + 1);
            } else
                wordMap.put(s, 1);
        }

        return wordMap;

    }

    ArrayList<Element> sortWords(HashMap wordMap) {

        ArrayList<Element> topWords = new ArrayList<Element>();


        Iterator<Map.Entry<String, Integer>> iterator = wordMap.entrySet().iterator();


        while (iterator.hasNext()) {

            Map.Entry<String, Integer> entry = iterator.next();

            if (topWords.size() == 0) {
                topWords.add(new Element(entry.getKey(), entry.getValue()));
            }

            for (int j = 0; j < topWords.size(); j++) {
                if (!(entry.getKey().equals(topWords.get(j).word))) {

                    if (entry.getValue() > topWords.get(j).count) {
                        topWords.add(j, new Element(entry.getKey(), entry.getValue()));
                        break;
                    } else if (j == topWords.size() - 1 &&
                            (topWords.size() < 10 || ((topWords.size() < wordMap.size()) && (wordMap.size() < 10)))) {
                        topWords.add(new Element(entry.getKey(), entry.getValue()));

                    }
                }

            }
            if (topWords.size() > 10) {
                topWords.remove(topWords.size() - 1);
            }
        }
        return topWords;
    }


}


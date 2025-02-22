package lesson20241210;

import java.util.*;

public class Dictionary {

    public static void main(String[] args) {
        String text = "It is a truth universally acknowledged, that a single man in possession of a good fortune, must be in want of a wife. However little known the feelings or views of such a man may be on his first entering a neighbourhood, this truth is so well fixed in the minds of the surrounding families, that he is considered the rightful property of some one or other of their daughters. \"My dear Mr. Bennet,\" said his lady to him one day, \"have you heard that Netherfield Park is let at last?\" Mr. Bennet replied that he had not. \"But it is,\" returned she; \"for Mrs. Long has just been here, and she told me all about it.\" Mr. Bennet made no answer. \"Do you not want to know who has taken it?\" cried his wife impatiently. \"YOU want to tell me, and I have no objection to hearing it.\" This was invitation enough. \"Why, my dear, you must know, Mrs. Long says that Netherfield is taken by a young man of large fortune from the north of England; that he came down on Monday in a chaise and four to see the place, and was so much delighted with it, that he agreed with Mr. Morris immediately; that he is to take possession before Michaelmas, and some of his servants are to be in the house by the end of next week.\" \"What is his name?\" \"Bingley.\" \"Is he married or single?\" \"Oh! Single, my dear, to be sure! A single man of large fortune; four or five thousand a year. What a fine thing for our girls!\" \"How so? How can it affect them?";
        String[] words = text.split("\\W+");
        System.out.println(Arrays.toString(words));

        Map<String, Integer> dictionary = new TreeMap<>();
        for (String word : words) {
            String lowerCase = word.toLowerCase();
            int wordCount = dictionary.getOrDefault(lowerCase, 0) + 1;
            dictionary.put(lowerCase, wordCount);
        }

        List<Word> wordList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : dictionary.entrySet()) {
            wordList.add(new Word(entry.getKey(), entry.getValue()));
        }
        wordList.sort((word1, word2) -> word2.getWordCount() - word1.getWordCount());

        for (Word word : wordList) {
            System.out.println(word);
        }

    }


    static class Word {
        String text;
        Integer wordCount;

        public Word(String text, Integer wordCount) {
            this.text = text;
            this.wordCount = wordCount;
        }

        public Integer getWordCount() {
            return wordCount;
        }

        @Override
        public String toString() {
            return "Word{" +
                    "text='" + text + '\'' +
                    ", wordCount=" + wordCount +
                    '}';
        }
    }


}

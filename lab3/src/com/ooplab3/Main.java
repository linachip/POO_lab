package com.ooplab3;

public class Main {

    static int sentencesCount(String string) {
        int sentences = 0;
        String[] sentenceList = string.split("[!?.:]+");
        sentences += sentenceList.length;
        return sentences;
    }

    static int wordsCount(String string) {
        int words = 0;
        char[] ch = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            ch[i] = string.charAt(i);
            if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0)))
                words++;
        }
        return words;
    }

    static int lettersCount(String string) {
        int letters = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i)))
                letters++;
        }
        return letters;
    }



    public static void main(String[] args) {

        String str = "Holmes was certainly not a difficult man to live with. He was quiet in his ways, and his habits"+
                "were regular. It was rare for him to be up after ten at night, and he had invariably breakfasted"+
                "and gone out before I rose in the morning. Sometimes he spent his day at the chemical laboratory,"+
                "sometimes in the dissecting rooms, and occasionally in long walks, which appeared to take him into"+
                "the lowest portions of the City. Nothing could exceed his energy when the working fit was upon him,"+
                "but now and again a reaction would seize him, and for days on end he would lie upon the sofa in the"+
                "sitting room, hardly uttering a word or moving a muscle from morning to night. On these occasions"+
                "I have noticed such a dreamy, vacant expression in his eyes, that I might have suspected him being"+
                "addicted to the use of come narcotic, had not the temperance and cleanliness of his whole life"+
                "forbidden such a notion.";

        int vowels = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            ch = Character.toLowerCase(ch);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
        }

        int consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch >= 'a' && ch <= 'z')) {
                consonants++;
            }
        }

        int spaces = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                spaces++;
            }

            System.out.println("Words:" + wordsCount(str));
            System.out.println("Letters: " + lettersCount(str));
            System.out.println("Sentences: " + sentencesCount(str));
            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
            System.out.println("Spaces: " + spaces);


        }
    }
}

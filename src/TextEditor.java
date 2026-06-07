/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class TextEditor {

    private String text;

    public TextEditor() {
        text = "";
    }

    public void setText(String text) {
        this.text = text;
    }

    public void showText() {
        System.out.println("\nCurrent Text:");
        System.out.println(text);
    }

    public void searchKeyword(String keyword) {

        int count = 0;
        int index = text.indexOf(keyword);

        System.out.println("\nSearch Result:");

        while (index != -1) {
            count++;
            System.out.println("Found at index: " + index);
            index = text.indexOf(keyword, index + keyword.length());
        }

        System.out.println("Total occurrences: " + count);
    }

    public void replaceText(String oldWord, String newWord) {

        text = text.replace(oldWord, newWord);

        System.out.println("\nReplace completed.");
        System.out.println("Updated Text:");
        System.out.println(text);
    }

    public void autoWrap(int width) {

        System.out.println("\nAuto Wrap Preview:");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            sb.append(text.charAt(i));

            if ((i + 1) % width == 0) {
                sb.append("\n");
            }
        }

        System.out.println(sb.toString());
    }

    public void showStatistics() {

        int totalChars = text.length();

        int words;

        if (text.trim().isEmpty()) {
            words = 0;
        } else {
            words = text.trim().split("\\s+").length;
        }

        System.out.println("\nText Statistics:");
        System.out.println("Total characters: " + totalChars);
        System.out.println("Total words: " + words);
    }
}
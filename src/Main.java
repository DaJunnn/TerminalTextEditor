/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TextEditor editor = new TextEditor();

        int choice;

        do {
            System.out.println("\n================================");
            System.out.println("        Terminal Text Editor");
            System.out.println("================================");
            System.out.println("1. Input / Edit Text");
            System.out.println("2. Search Keyword and Count");
            System.out.println("3. Replace Text");
            System.out.println("4. Auto Wrap Preview");
            System.out.println("5. Text Statistics");
            System.out.println("6. Show Current Text");
            System.out.println("0. Exit");
            System.out.print("Please enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("\nPlease enter text:");
                    String text = scanner.nextLine();
                    editor.setText(text);
                    System.out.println("Text has been updated.");
                    break;

                case 2:
                    System.out.print("\nPlease enter keyword: ");
                    String keyword = scanner.nextLine();
                    editor.searchKeyword(keyword);
                    break;

                case 3:
                    System.out.print("\nPlease enter the text to replace: ");
                    String oldWord = scanner.nextLine();

                    System.out.print("Please enter the new text: ");
                    String newWord = scanner.nextLine();

                    editor.replaceText(oldWord, newWord);
                    break;

                case 4:
                    System.out.print("\nPlease enter line width: ");
                    int width = scanner.nextInt();
                    scanner.nextLine();

                    editor.autoWrap(width);
                    break;

                case 5:
                    editor.showStatistics();
                    break;

                case 6:
                    editor.showText();
                    break;

                case 0:
                    System.out.println("\nThank you for using this program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        scanner.close();
    }
}
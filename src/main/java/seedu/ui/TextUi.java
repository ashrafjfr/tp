package seedu.ui;

import java.util.Scanner;

public class TextUi {
    private static final String LOGO =
            "   _____         _______        _     \n" +
            "  / ____|       |__   __|      | |    \n" +
            " | |     ___  _ __ | | ___  ___| |__  \n" +
            " | |    / _ \\| '_ \\| |/ _ \\/ __| '_ \\ \n" +
            " | |___| (_) | | | | |  __/ (__| | | |\n" +
            "  \\_____\\___/|_| |_|_|\\___|\\___|_| |_|\n" +
            "                                      \n";

    private static final String LINE =
            "____________________________________________________________\n";

    private final Scanner scanner;

    public TextUi() {
        scanner = new Scanner(System.in);
        initMessage();
    }

    public String getUserInput() {
        return scanner.nextLine();
    }

    // Used for print messages after user inputs
    private static void printDoubleLineMessage(String message) {
        System.out.println(
                LINE + message + "\n" + LINE
        );
    }

    // Used for system messages without user inputs
    private static void printBottomLineMessage(String message) {
        System.out.println(
                message + "\n" + LINE
        );
    }

    private static void initMessage() {
        printDoubleLineMessage(LOGO);
        System.out.println("Welcome to ConTech, your personal contact tracker.\n" + LINE);
    }

    public static void createNewContactFileMessage(String contactFilePath) {
        String message = "As ConTech is unable to find your saved data, \n" +
                " it has created a new one for you at: \n" + contactFilePath;
        printBottomLineMessage(message);
    }

    public static void fileErrorMessage(String contactFilePath) {
        String message = "ConTech is unfortunately unable to create a file for your\n" +
                " save file at " + contactFilePath + ".\n" +
                "Please relocate the file and try again.";
        printBottomLineMessage(message);
    }

    public static void addContactMessage(String contactName, int listSize) {
        String message = "ConTech has added the specified contact: " + contactName + "\n" +
                "You now have " + listSize + " contact(s).";
        printDoubleLineMessage(message);
    }

    public static void exitMessage() {
        String message = "ConTech will now shutdown.\n" +
                "We hope you have enjoyed using it.";
        printDoubleLineMessage(message);
    }
}

package ua.GoIT.JavaCore.Mobule09.HomeTask;

import java.util.Scanner;
import java.util.regex.Pattern;

import static ua.GoIT.JavaCore.Mobule09.HomeTask.Constants.*;

public class CesarAlgorithm {
    static Scanner scanner = new Scanner(System.in);
    private static String inputMessage;
    private static Integer inputOffset = 0;

    public static void main(String[] args) {
        System.out.println("--- Welcome to \"CESAR\" algorithm ---");
        while (true) {
            System.out.println("Please enter:");
            System.out.println("\'1\' if you want encrypt message");
            System.out.println("\'2\' if you want decrypt message");
            System.out.println("\'exit\' if you want exit from program");
            String inputModeUser = scanner.next();
            if (inputModeUser.equals("exit")) {
                System.out.println("--- Thank you for your time :) ---");
                break;
            } else if (inputModeUser.equals(ENCRYPT_MODE)) {
                encryptUserMassage();
            } else if (inputModeUser.equals(DECRYPT_MODE)) {
                decryptUserMassage();
            }
        }
    }

    public static void encryptUserMassage() {
        System.out.println("\n--- You have encrypt message ---------------");
        StringBuilder sb = new StringBuilder();
        while (true) {
            System.out.println("Please enter you message:");
            //if (scanner.hasNextLine()) {
                //.append();
            //}
            Pattern p = Pattern.compile("[\n]");
            inputMessage = scanner.useDelimiter(p).next();
            System.out.println("Please enter offset algorithm (integer from 1 to 26):");
            inputOffset = scanner.nextInt();
            if (inputMessage.isEmpty() || !(inputOffset >= 1 && inputOffset <= 26)) {
                System.out.println("\nYou have entered the wrong data, please re-enter data.");
            } else {
                break;
            }
        }
        System.out.println("--- Finished input message -----------------");
        System.out.println("You message: \"" + inputMessage + "\" with offset: " + inputOffset);
        String encryptedMessage = new Encrypt().encryptMessage(inputMessage, inputOffset);
        if (encryptedMessage != null) {
            System.out.println("Encrypted message: " + encryptedMessage);
        } else {
            System.out.println("Internal error (null), please will send this message to developer.");
        }
        System.out.println("--- The message is encrypted successfuly ---\n");
    }

    public static void decryptUserMassage() {
        System.out.println("\n--- You have decrypt message ---------------");
        while (true) {
            System.out.println("Please enter decrypt message:");
            inputMessage = scanner.next();
            System.out.println("Please enter offset algorithm (integer from 1 to 26):");
            inputOffset = scanner.nextInt();
            if (inputMessage.isEmpty() || !(inputOffset >= 1 && inputOffset <= 26)) {
                System.out.println("\nYou have entered the wrong data, please re-enter data.");
            } else {
                break;
            }
        }
        System.out.println("--- Finished input message -----------------");
        System.out.println("You message: \"" + inputMessage + "\" with offset: " + inputOffset);
        String decryptedMessage = new Decrypt().decryptMessage(inputMessage, inputOffset);
        if (decryptedMessage != null) {
            System.out.println("Decrypted message: " + decryptedMessage);
        } else {
            System.out.println("Internal error (null), please will send this message to developer.");
        }
        System.out.println("--- The message is decrypted successfuly ---\n");
    }
}

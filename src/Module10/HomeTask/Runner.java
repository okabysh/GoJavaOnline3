package Module10.HomeTask;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

import static Module10.HomeTask.Constants.*;

public class Runner {
    static Scanner scanner = new Scanner(System.in);
    private static String inputMessage;
    private static Integer inputOffset = 0;

    public static void main(String[] args) throws IOException {
        System.out.println("--- Welcome to \"CESAR\" algorithm with new function: save/load encrypted message into file EncryptedMessage.txt ---");
        while (true) {
            System.out.println("Please enter:");
            System.out.println("\'1\' if you want encrypt message and save to file");
            System.out.println("\'2\' if you want load from file and decrypt message");
            System.out.println("\'exit\' if you want exit from program");
            String inputModeUser = scanner.next();
            if (inputModeUser.equals("exit")) {
                System.out.println("--- Thank you for your time :) ---");
                break;
            } else if (inputModeUser.equals(ENCRYPT_MODE)) {
                encryptUserMassageAndSave();
            } else if (inputModeUser.equals(DECRYPT_MODE)) {
                decryptUserMassageAndLoad();
            }
        }
    }

    public static void encryptUserMassageAndSave() throws IOException {
        System.out.println("\n--- You have encrypt message and save to file ---------------");
        while (true) {
            System.out.println("Please enter you message:");
            Pattern p = Pattern.compile("\n");
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
        System.out.println("--- The message was encrypted successfully ---");

        Boolean resultOfWrite = new FileWrite().writeToFile(FILE_NAME, encryptedMessage);
        if (resultOfWrite) {
            System.out.println("--- The encrypted message was saved to file successfully ---\n");
        } else {
            System.out.println("--- The encrypted message don't save to file. Please try again. ---\n");
        }
    }

    public static void decryptUserMassageAndLoad() throws IOException {
        String messageFromFile = null;
        System.out.println("\n--- You have decrypt message ---------------");
        while (true) {
            try {
                messageFromFile = new FileRead().readFromFile(FILE_NAME);
            } catch (Exception e) {
                e.printStackTrace();
            }

            if (messageFromFile != null) {
                System.out.println("--- The encrypted message was loaded from file successfully ---");
            }
            System.out.println("Please enter offset algorithm (integer from 1 to 26):");
            inputOffset = scanner.nextInt();
            if (inputMessage.isEmpty() || !(inputOffset >= 1 && inputOffset <= 26)) {
                System.out.println("\nYou have entered the wrong data, please re-enter data.");
            } else {
                break;
            }
        }
        System.out.println("--- Finished input message -----------------");
        System.out.println("You encrypted message: \"" + messageFromFile + "\" with offset: " + inputOffset);
        String decryptedMessage = new Decrypt().decryptMessage(messageFromFile, inputOffset);
        if (decryptedMessage != null) {
            System.out.println("Decrypted message: " + decryptedMessage);
        } else {
            System.out.println("Internal error (null), please will send this message to developer.");
        }
        System.out.println("--- The message was loaded and decrypted successfully ---\n");
    }
}

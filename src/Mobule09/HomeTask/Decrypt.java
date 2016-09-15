package Mobule09.HomeTask;

import static Mobule09.HomeTask.Constants.*;

public class Decrypt {

    public String decryptMessage(String inputMessage, int inputOffset) {
        StringBuilder messageDecrypt = new StringBuilder();

        if (!inputMessage.isEmpty()) {
            char charArray[] = inputMessage.toCharArray();
            int nDecrypt;
            for (int i = 0; i < charArray.length; i++) {
                int symbolInt = (int) charArray[i];
                char symbolChar = charArray[i];
                // Nencrypt = (Nsymbol + 97(65) + Offset)%26 - 97(65) (Number of encrypted symbol)
                if (symbolInt >= 97 && symbolInt <= 122) {
                    // small symbols
                    if (symbolInt - OFFSET_SMALL_SYMBOLS - inputOffset >= 0) {
                        nDecrypt = (symbolInt - OFFSET_SMALL_SYMBOLS - inputOffset) % 26 + OFFSET_SMALL_SYMBOLS;
                    } else {
                        nDecrypt = (symbolInt - OFFSET_SMALL_SYMBOLS + 26 - inputOffset)%26 + OFFSET_SMALL_SYMBOLS;
                    }
                    messageDecrypt.append((char) nDecrypt);
                } else if (symbolInt >= 65 && symbolInt <= 90) {
                    // lange symbols
                    if (symbolInt - OFFSET_LARGE_SYMBOLS - inputOffset >= 0) {
                        nDecrypt = (symbolInt - OFFSET_LARGE_SYMBOLS - inputOffset) % 26 + OFFSET_LARGE_SYMBOLS;
                    } else {
                        nDecrypt = (symbolInt - OFFSET_LARGE_SYMBOLS + 26 - inputOffset)%26 + OFFSET_LARGE_SYMBOLS;
                    }
                    messageDecrypt.append((char) nDecrypt);
                } else {
                    // other symbols
                    messageDecrypt.append(symbolChar);
                }
            }
            return messageDecrypt.toString();
        } else {
            return null;
        }
    }
}

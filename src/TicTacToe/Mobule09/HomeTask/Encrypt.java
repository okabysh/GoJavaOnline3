package Mobule09.HomeTask;

import static Mobule09.HomeTask.Constants.*;

public class Encrypt {
    private StringBuilder messageEncrypt = new StringBuilder();

    public String EncryptMessage(String inputMessage, int inputOffset) {
        if (!inputMessage.isEmpty()) {
            char charArray[] = inputMessage.toCharArray();
            int nEncrypt;
            for (int i = 0; i < charArray.length; i++) {
                int symbolInt = (int) charArray[i];
                char symbolChar = charArray[i];
                // Nencrypt = (Nsymbol - 97(65) + Offset)%26 + 97(65) (Number of encrypted symbol)
                if (symbolInt >= 97 && symbolInt <= 122) {
                    // small symbols
                    nEncrypt = (symbolInt - OFFSET_SMALL_SYMBOLS + inputOffset)%26 + OFFSET_SMALL_SYMBOLS;
                    messageEncrypt.append((char) nEncrypt);
                } else if (symbolInt >= 65 && symbolInt <= 90) {
                    // lange symbols
                    nEncrypt = (symbolInt - OFFSET_LARGE_SYMBOLS + inputOffset)%26 + OFFSET_LARGE_SYMBOLS;
                    messageEncrypt.append((char) nEncrypt);
                } else {
                    // other symbols
                    messageEncrypt.append(symbolChar);
                }
            }
            return messageEncrypt.toString();
        } else {
            return null;
        }
    }
}

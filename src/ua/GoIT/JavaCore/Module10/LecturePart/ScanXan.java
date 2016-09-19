package ua.GoIT.JavaCore.Module10.LecturePart;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class ScanXan {
    public static void main(String[] args) throws IOException{
        Scanner scanner = null;

        try {
                scanner = new Scanner(new BufferedReader(new FileReader("Hello.txt")));
            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}

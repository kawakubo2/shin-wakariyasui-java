package chapter22.review;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Pass2 {
    public static void main(String[] args) {
        Path path = Path.of("data.txt");
        try(BufferedReader in = Files.newBufferedReader(path);) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = in.readLine()) != null) {
                sb.append(line).append("\n");
            }
            System.out.println(sb.toString());
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}

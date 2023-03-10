package chapter22;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class StringConstructor {
    public static void main(String[] args) throws IOException {
        byte[] bytes = Files.readAllBytes(Path.of("sample.html"));
        String str = new String(bytes, "UTF-8");
        System.out.println(str);
    }
}

package utils;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class FileReader {

    public static List<String> readAllLines(String path) {

        File file = new File(path);
        try {
            return Files.readLines(new File(path), Charsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException("Cannot read the file. Please check if you file exist? " + path);
        }
    }
}

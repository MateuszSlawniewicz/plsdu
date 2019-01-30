package day8;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileOperations {

    private static final String PATH_TO_FILE = "C:\\Users\\mateu\\Desktop\\wiersz.txt";


    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader(PATH_TO_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            List<String> lines = new ArrayList<>();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }

            for (String s : lines) {
                StringUtils.capitalize(s);

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }


}

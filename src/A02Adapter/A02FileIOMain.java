package A02Adapter;

import java.io.File;
import java.io.IOException;

public class A02FileIOMain {

    public static void main(String[] args) {
        File readFile = new File("C:\\Users\\A\\Documents\\text.txt");
        File writerFile = new File("C:\\Users\\A\\Documents\\newText.txt");
        A02FileIO f = new A02FileProperties();
        try {
            f.readFromFile(String.valueOf(readFile));
            f.setValue("width", "1024");
            f.setValue("height", "512");
            f.setValue("depth", "32");
            f.writeToFile(String.valueOf(writerFile));
            System.out.println("l~ newfile.txt is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

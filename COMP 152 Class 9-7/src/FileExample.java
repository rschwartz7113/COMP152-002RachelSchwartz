import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileExample {
    public static void main(String[] args) throws IOException{
        var filename = "student.txt";
        var allLines = Files.readString(Paths.get(filename));
        var listOfNames = allLines.split("\n");
        for (String name : listOfNames){
            System.out.println(name);
        }
    }
}

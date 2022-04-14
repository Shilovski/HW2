import java.io.FileReader;
import com.opencsv.CSVReader;

public class ClasRead {

    public static void main(String[] args) throws Exception {

        //ch2: ex 13
        CSVReader reader = new CSVReader(new FileReader("file.csv"));
        String[] nextLine;
        while ((nextLine = reader.readNext()) != null)
            for (String e : nextLine)
                System.out.format("%s ", e);

    }
}
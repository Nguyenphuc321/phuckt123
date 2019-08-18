package totalSourceJavaAdvantage;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SubThreadReadFile extends Thread{
    private int ele;

    public static void readFileContainsCustomer() {
        File fileOblject = new File("F:/CodeGym/document/day15Theard.txt");
        try {
            System.out.println("Read  File.");
            FileReader fileReader = new FileReader(fileOblject);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void run() {
        File fileOblject = new File("F:/CodeGym/document/day15Theard.txt");
        try {
            System.out.println("Read  File.");
            FileReader fileReader = new FileReader(fileOblject);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

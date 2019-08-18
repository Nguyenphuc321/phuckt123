package totalSourceJavaAdvantage;

//public class SubThreadTime {
//}
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SubThreadTime {

    private int numberTime = 0;

    public int getNumberTime() {
        return numberTime;
    }

    public void setNumberTime(int numberTime) {
        this.numberTime = numberTime;
    }

    public synchronized void showTime(int time) {
        int element = time;
        while (element <= 24) {
            try {
                System.out.println("It's " + element + " oclock");
                if (element == 9) {
                    wait();
                }
            } catch (InterruptedException e) {
                System.out.println(e.toString());
            }
            element++;
        }
        System.exit(0);
    }

    public synchronized void showDataAFile() {
        try {
            System.out.println("---------------------");
            System.out.println("Read  File.");
            FileReader fileReader = new FileReader(new File("F:/CodeGym/document/day15Theard.txt"));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                System.out.println("---------------------");
            }
            fileReader.close();
            bufferedReader.close();
            notify();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package totalSourceJavaAdvantage;

//public class Day14File {
//}
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day14File {

    public static void main(String[] args) {
        Customer customer1 = new Customer("Nguyen Van A", 20);
        Customer customer2 = new Customer("Nguyen Van B", 20);
        Customer customer3 = new Customer("Nguyen Van C", 20);
        Customer customer4 = new Customer("Nguyen Van D", 20);
        List<Customer> arrayListCustomer = new ArrayList<>();
        arrayListCustomer.add(customer1);
        arrayListCustomer.add(customer2);
        arrayListCustomer.add(customer3);
        arrayListCustomer.add(customer4);
        writeFileContainsCustomer(arrayListCustomer);
        readFileContainsCustomer();
    }

    public static void writeFileContainsCustomer(List<Customer> arrayListCustomer) {
        File fileOblject = new File("F:/CodeGym/document/testFile.txt");
        try {
            FileWriter fileWriter = new FileWriter(fileOblject);
            for (Customer element : arrayListCustomer) {
                System.out.print(element);
                fileWriter.write(element.getNameCustomer().toString()+"\r\n");
            }
            System.out.println("save success.");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error File Address...");
            e.printStackTrace();
        }
    }

    public static void readFileContainsCustomer() {
        File fileOblject = new File("F:/CodeGym/document/testFile.txt");
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

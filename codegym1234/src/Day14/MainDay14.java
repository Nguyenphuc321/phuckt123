package Day14;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

import javax.management.Query;

import runningApplication.ApplicationRunningInterface;
import totalSourceJavaAdvantage.Customer;

public class MainDay14 implements ApplicationRunningInterface{

    public static void main(String[] args) {
        MainDay14 mainDay14 = new MainDay14();
        mainDay14.run();
    }

    public static void runningRequestDay14() {
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
        //You can change link folder content file
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
        //You can change link folder content file
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

    @Override
    public void run() {
        runningRequestDay14();

    }

}
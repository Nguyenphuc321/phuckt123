package totalSourceJavaAdvantage;

//public class ResortManager {
//}
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class ResortManager {

    public static void main(String[] args) {
        System.out.println("---------------Day 8-----------------");
        Employees employeesJhon = new Employees(001, "John", 14, "12NY, USA");
        Employees employeesJihoon = new Employees(002, "Jihoon", 1, "09NY, Vietnam");
        Employees employeesLux = new Employees(003, "Lux", 2, "09NY, Thailand");
        Map<Integer, Employees> employeesManagerHashMap = new HashMap<>();
        employeesManagerHashMap.put(employeesJhon.getIdEmployees(), employeesJhon);
        employeesManagerHashMap.put(employeesJihoon.getIdEmployees(), employeesJihoon);
        employeesManagerHashMap.put(employeesLux.getIdEmployees(), employeesLux);
        showElementHashMap(employeesManagerHashMap);
    }

    public static void showElementHashMap(Map<Integer, Employees> employeesManagerHashMap) {
        Set<Integer> keySet = employeesManagerHashMap.keySet();
        for (Integer key : keySet) {
            System.out.println(key + ": \t "+employeesManagerHashMap.get(key));

        }
    }

}

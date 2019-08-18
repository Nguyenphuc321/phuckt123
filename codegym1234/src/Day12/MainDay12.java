package Day12;



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
import totalSourceJavaAdvantage.Employees;

public class MainDay12 implements ApplicationRunningInterface{

    public static void main(String[] args) {
        MainDay12 mainDay12 = new MainDay12();
        mainDay12.run();
    }

    public static void runningRequestDay12() {
        Employees employeesJhon = new Employees(001, "John", 14, "12NY, USA");
        Employees employeesJihoon = new Employees(002, "Jihoon", 1, "09NY, Vietnam");
        Employees employeesLux = new Employees(003, "Lux", 2, "09NY, Thailand");
        System.out.println("-----------------Day 12: Sort -----------------\n");
        List<Employees> listSortEmployees = new ArrayList<>();
        listSortEmployees.add(employeesJhon);
        listSortEmployees.add(employeesJihoon);
        listSortEmployees.add(employeesLux);
        sortArrayList(listSortEmployees);
    }

    public static void  sortArrayList(List<Employees> listSortEmployees) {
        Collections.sort(listSortEmployees, new Comparator<Employees>() {
            @Override
            public int compare(Employees o1, Employees o2) {
                return o1.getAgeEmployees() - o2.getAgeEmployees();
            }
        });
        listSortEmployees.forEach(e -> System.out.println(e));
    }

    @Override
    public void run() {
        runningRequestDay12();

    }

}

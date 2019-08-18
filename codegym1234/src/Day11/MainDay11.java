package Day11;

//public class MainDay11 {
//}
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

import javax.management.Query;

import runningApplication .ApplicationRunningInterface;

public class MainDay11 implements ApplicationRunningInterface{

    public static void main(String[] args) {
        MainDay11 mainDay11 = new MainDay11();
        mainDay11.run();
    }

    public static void runningRequestDay11() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------Day 11: Stack -----------------");
        System.out.println("Nhap ten nhan vien can tim: (vi du: Quang Tuan 1)");
        Stack<EmployeesProfile> stackEmployeeProfile = new Stack<>();
        EmployeesProfile employeesProfile01 = new EmployeesProfile("Quang Tuan 1");
        EmployeesProfile employeesProfile02 = new EmployeesProfile("Quang Tuan 2");
        EmployeesProfile employeesProfile03 = new EmployeesProfile("Quang Tuan 3");
        showPush(stackEmployeeProfile, employeesProfile01);
        showPush(stackEmployeeProfile, employeesProfile02);
        showPush(stackEmployeeProfile, employeesProfile03);
        String resultSearchStack = scanner.nextLine();
        printStack(stackEmployeeProfile, resultSearchStack);
    }

    public static void printStack(Stack<EmployeesProfile> stackEmployeeProfile, String resultSearchStack) {
        while (!stackEmployeeProfile.empty()) {
            String nameElement = stackEmployeeProfile.pop().toString();
            if (nameElement.equals(resultSearchStack)) {
                System.out.println(resultSearchStack+" exited.");
            }
        }
    }

    public static void  showPush(Stack stackName, EmployeesProfile nameEmployee) {
        stackName.push(nameEmployee);
    }


    @Override
    public void run() {
        runningRequestDay11();

    }

}

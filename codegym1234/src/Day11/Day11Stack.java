package Day11;

//import java.util.Scanner;
//import java.util.Stack;
//
//public class Day11Stack {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("-------Day 11: Stack-------");
//        System.out.println("nhap ten nhan vien can tim: (vi du : Quang van 1)");
//        Stack<EmployeesProfile> employeesProfiles = new Stack<>();
//        EmployeesProfile employeesProfile1 = new EmployeesProfile("Quang van 1");
//        EmployeesProfile employeesProfile2 = new EmployeesProfile("Quang van 2");
//        EmployeesProfile employeesProfile3 = new EmployeesProfile("Quang van 3");
//        showPush(stackEmployeeProfile,employeesProfile1);
//        showPush(stackEmployeeProfile,employeesProfile2);
//        showPush(stackEmployeeProfile,employeesProfile3);
//        String resultSearchStack = scanner.nextLine();
//        printStack(stackEmployeeProfile,resultSearchStack);
//    }
//
//    public static void printStack(Stack<EmployeesProfile> stackEmployeeProfile, String resultSearchStack) {
//        while (!stackEmployeeProfile.empty()) {
//            String nameElement = stackEmployeeProfile.pop().toString();
//            if (nameElement.equals(resultSearchStack)) {
//                System.out.println(resultSearchStack+"exited.");
//            }
//        }
//    }
//
//    public static void showPush(Stack stackname, EmployeesProfile employeesProfile) {
//        stackname.push(nameEmployee)
//
//    }
//}
import java.util.Scanner;
import java.util.Stack;

public class Day11Stack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------Day 11: Stack -----------------");
        System.out.println("Nhap ten nhan vien can tim: (vi du: Quang Van 1)");
        Stack<EmployeesProfile> stackEmployeeProfile = new Stack<>();
        EmployeesProfile employeesProfile01 = new EmployeesProfile("Quang Van 1");
        EmployeesProfile employeesProfile02 = new EmployeesProfile("Quang Van 2");
        EmployeesProfile employeesProfile03 = new EmployeesProfile("Quang Van 3");
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

}

package Day09;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Garage {
    static Scanner sc = new Scanner(System.in);
    static Set<Vehicle> garaSet = new HashSet<Vehicle>();

    public static void main(String[] args) {
        Vehicle Black = new Vehicle("43k1-65789","ABlackk","honda");
        addVehicle(Black);
        Vehicle Siri = new Vehicle("43k1-76890","sirius","honda");
        addVehicle(Siri);
        Vehicle Toyota = new Vehicle("43X1-33333","oto","toyota");
        addVehicle(Toyota);
        System.out.println("so xe vao gara trong ngay do"+garaSet.size());
        displayVehicle();
    }
    public static void addVehicle(){
        Vehicle vehicle = new Vehicle();
        System.out.println("nhap vao loai xe");
        vehicle.setLoaixe(sc.nextLine());
        System.out.println("nhap vao ten xe");
        vehicle.setTenxe(sc.nextLine());
        System.out.println("nhap vao bien so xe");
        vehicle.setBienso(sc.nextLine());
    }
    public static void addVehicle(Vehicle v){
        garaSet.add(v);
    }
    public static void displayVehicle(){
        System.out.println("cac xe da vao bai do");
        for (Vehicle vehicle : garaSet){
            System.out.println(vehicle);
        }
    }
}

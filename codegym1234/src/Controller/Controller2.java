package Controller;

import service.HouseService;
import service.HouseServiceImpl;
import service.VillaService;
import service.VillaServiceImpl;

import java.util.Scanner;

public class Controller2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VillaService villaService = new VillaServiceImpl();
        HouseService houseService = new HouseServiceImpl();
        System.out.println("công việc mà bạn muốn thực hiện là:");
        System.out.println("1:hiển thị danh sách villa");
        System.out.println("2:hiển thị danh sách house");
        System.out.println("----------");
        int temp;
        do {
            System.out.println("mời bạn nhập công việc:");
            temp = scanner.nextInt();
            switch (temp){
                case 1: {
                    villaService.displayVilla();
                    break;
                }
                case 2:{
                    houseService.displayHouse();
                    break;
                }
                default:
                    System.exit(0);
            }
        }while (temp !=0);
    }
}

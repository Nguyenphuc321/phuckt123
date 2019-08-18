package Controller;

import model.Customer;
import service.CustomerService;
import service.CustomerServiceImpl;
import service.SwimmingService;
import service.SwimmingServiceImpl;

import java.util.Scanner;

public class Controller1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Controller1 controller1 = new Controller1();
        CustomerService customerService = new CustomerServiceImpl();
        SwimmingService swimmingService = new SwimmingServiceImpl();
        Customer customer = new Customer(1, "nguyen van B", 20, "thang binh");
        System.out.println("công việc mà bạn muốn thực hiện là:");
        System.out.println("1:tính tiền khách hàng");
        System.out.println("2:hiển thị giờ mở cửa hồ bơi");
        System.out.println("3:đã đến giờ mở cửa hay chưa");
        System.out.println("-------");
        int temp;
        do {
            System.out.println("mời bạn nhập công việc:");
            temp = scanner.nextInt();
            switch (temp) {
                case 1: {
                    customerService.charge(customer);
                    break;
                }
                case 2: {
                    swimmingService.displayOpeningHours();
                    break;
                }
                case 3: {
                    swimmingService.swim();
                }
                default:
                    System.exit(0);
            }
        } while (temp != 0);
    }
}


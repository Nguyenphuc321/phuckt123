package Controller;

import service.MasterCardServiceImpl;
import service.PaymentService;
import service.VisaCardServiceImpl;

import java.util.Scanner;

public class Controller5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentService visacard = new VisaCardServiceImpl();
        PaymentService mastercard = new MasterCardServiceImpl();
        System.out.println("phương thức thanh toán là");
        System.out.println("1: visacard");
        System.out.println("2:mastercard");
        System.out.println("----------");
        int temp;
        do {
            System.out.println("nhập phương thức thanh toán của bạn:");
            temp = scanner.nextInt();
            switch (temp){
                case 1:{
                    visacard.pay();
                    break;
                }
                case 2:{
                    mastercard.pay();
                    break;
                }
                default:
                    System.exit(0);
            }
        }while (temp !=0);
    }
}

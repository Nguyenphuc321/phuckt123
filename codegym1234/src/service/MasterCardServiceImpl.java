package service;

public class MasterCardServiceImpl implements PaymentService {
    @Override
    public void pay(){
        System.out.println("bạn đã chọn phương thức thanh toán là mastercar");
    }
}

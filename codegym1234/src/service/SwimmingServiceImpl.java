package service;

import java.time.LocalDateTime;

public class SwimmingServiceImpl implements SwimmingService {


    @Override
    public void displayOpeningHours() {
        System.out.println("giờ mở cửa là 8h, xin quý khách vui lòng chờ đợi");
    }
    @Override
    public void swim() {
        LocalDateTime localDate = LocalDateTime.now();
        if(localDate.getHour()<9){
            System.out.println("hồ bơi mở cửa lúc 9h xin bạn vui lòng đợi đến 9h");
        }else{
            System.out.println("Hồ bơi đã mở cửa chúc mọi người một ngày vui chơi thú vị");
        }
    }
}

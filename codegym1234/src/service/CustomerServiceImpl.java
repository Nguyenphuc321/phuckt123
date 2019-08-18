package service;

import model.Customer;
import model.Villa;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    @Override
    public void charge(Customer customer){
        System.out.println("khach hang"+customer.getName()+"tuoi:"+customer.getAge()+"đã thuê cái villa trong 4 ngày và tổng số tiền phải trả là:"+ Villa.getPrice()*4+"USD");
    }
    @Override
    public void displayCustomer(List list){
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}

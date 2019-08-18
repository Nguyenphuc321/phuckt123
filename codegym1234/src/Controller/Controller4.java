package Controller;

import model.Customer;
import service.CustomerService;
import service.CustomerServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Controller4 {
    static List<Customer>customers=new ArrayList<>();
    static {
        customers.add(new Customer(1,"tuan",21,"thang binh"));
        customers.add(new Customer(2,"van",23,"thang binh"));
        customers.add(new Customer(3,"phong",22,"thang binh"));
        customers.add(new Customer(4,"anh",24,"quang ninh"));
        customers.add(new Customer(5,"ly",25,"thai binh"));
        customers.add(new Customer(6,"long",20,"thang binh"));
        customers.add(new Customer(7,"Quang",26,"Đà nẵng"));
        customers.add(new Customer(8,"lam",22,"thang binh"));
        customers.add(new Customer(9,"bay",24,"tam ky"));
        customers.add(new Customer(10,"vuong",22,"tam ky"));
    }

    public static void main(String[] args) {
        CustomerService customerService = new CustomerServiceImpl();
        customerService.displayCustomer(customers);
    }
}

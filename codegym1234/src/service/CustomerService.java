package service;

import model.Customer;

import java.util.List;

public interface CustomerService {
    void charge(Customer customer);
    void displayCustomer(List list);
}

package Controller;

import service.EmployeesService;
import service.EmployeesServiceImpl;

public class Controller8 {
    public static void main(String[] args) {
        EmployeesService employeesService = new EmployeesServiceImpl();
        employeesService.display();
    }
}
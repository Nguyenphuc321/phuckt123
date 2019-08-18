package service;

import model.Employees;

import java.util.HashMap;
import java.util.Map;

public class EmployeesServiceImpl implements EmployeesService {
    static Map<Integer, Employees>employees= new HashMap<>();
    static {
        employees.put(1,new Employees("toan",20,"nhan vien"));
        employees.put(2,new Employees("lam",22,"giam doc"));
        employees.put(3,new Employees("tuan",25,"giam doc"));
        employees.put(3,new Employees("long",23,"giam doc"));
        employees.put(4,new Employees("anh",22,"giam doc"));
        employees.put(5,new Employees("quang",24,"giam doc"));
        employees.put(6,new Employees("nguyen",26,"giam doc"));
        employees.put(7,new Employees("ngoc",27,"giam doc"));
        employees.put(8,new Employees("van",26,"giam doc"));
        employees.put(9,new Employees("giang",21,"giam doc"));
        employees.put(10,new Employees("phuc",22,"giam doc"));

    }
    @Override
    public void display() {
        for (Integer id : employees.keySet()){
            Employees employee = employees.get(id);
            System.out.println(employee);


        }
    }
}

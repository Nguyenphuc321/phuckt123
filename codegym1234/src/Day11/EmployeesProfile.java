package Day11;

import model.Employees;

public class EmployeesProfile {
    private int idEmployee;
    private String nameEmployee;
    public int getIdEmployee() {
        return idEmployee;
    }
    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }
    public String getNameEmployee() {
        return nameEmployee;
    }
    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public EmployeesProfile(String nameEmployee) {
        this.setNameEmployee(nameEmployee);
    }

    @Override
    public String toString() {
        return nameEmployee;
    }
}

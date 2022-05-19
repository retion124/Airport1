package Enteti;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Workers {

    @Id
    private int WorkersId;
    private String WorkersName;
    private String Position;
    private double Salary;
    private int Age;
    private int Phone;

    public int getWorkersId(){return WorkersId;}

    public void setWorkersId(int workersId){WorkersId = workersId;}

    public String getWorkersName() {
        return WorkersName;
    }

    public void setWorkersName(String workersName) {
        WorkersName = workersName;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }
}
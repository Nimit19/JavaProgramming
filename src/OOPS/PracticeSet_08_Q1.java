package OOPS;

class Employee{
    String Name ;
    int Salary ;

    public void setName(String name) {
        Name = name;
    }

    public String getName(){
        return Name;
    }

    public int getSalary(){
        return Salary;
    }
}

public class PracticeSet_08_Q1 {
    public static void main(String[] args) {

        Employee nimit = new Employee();
        nimit.setName("Nimit Patel");
        nimit.Salary = 1000000;
        System.out.println("Employee Name : " + nimit.getName());
        System.out.println("Employee Salary : " + nimit.getSalary());
    }
}

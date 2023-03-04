public class Employee {

    private String fio;
    private int departament;
    private int salary;
    public static int counter = 0;
    public int id;

    public Employee(String fio, int departament, int salary) {
        this.fio = fio;
        this.departament = departament;
        this.salary = salary;
        id = ++counter;
    }

    public String getFio() {
        return fio;
    }

    @Override
    public String toString() {
        return "ФИО: " + fio + ", отдел=" + departament + ", зарплата =" + salary + ", id=" + id;
    }

    public int getDepartament() {
        return departament;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int d) {
        this.departament = d;
    }

    public void setSalary(int s) {
        this.salary = s;
    }

    public int getId() {
        return id;
    }
}

















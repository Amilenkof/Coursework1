public class Employee {

    private String fio;
    private int departament;
    private int salary;
    private static int counter = 0;
    private int id;

    public Employee(String fio, int departament, int salary) {
        this.fio = fio;
        this.departament = departament;
        this.salary = salary;
        counter += 1;
        id = counter;
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

    public int getSalary() {
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



















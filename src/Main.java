import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static int generateRandomDepartament(int bound) {
        java.util.Random random = new java.util.Random();
        int department = 1 + random.nextInt(bound);
        return department;
    }

    public static int generateRandomSalary(int bound) {
        java.util.Random random = new java.util.Random();
        int salary = random.nextInt(bound);
        return salary;
    }

    public static void printEmployee(Employee[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());

        }
    }

    public static int calculateSalaryOfMonth(Employee[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = (int) (sum + arr[i].getSalary());
        }
        return sum;
    }

    public static int calculateAverageSalary(Employee[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = (int) (sum + arr[i].getSalary());
        }
        return sum / arr.length;

    }

    public static String findEmployeeMinSalary(Employee[] arr) {
        int salary = 100_000;
        int idMinSalaryEmployee = 0;

        for (int i = 0; i < arr.length; i++) {
            if (salary > arr[i].getSalary()) {
                salary = (int) arr[i].getSalary();
                idMinSalaryEmployee = arr[i].getId() - 1;
            }
        }
        return "Сотрудник с самой минимальной зарплатой " + arr[idMinSalaryEmployee].toString();
    }

    public static String findEmployeeMaxSalary(Employee[] arr) {
        int salary = 0;
        int idMaxSalaryEmployee = 0;
        for (int i = 0; i < arr.length; i++) {
            if (salary < arr[i].getSalary()) {
                salary = (int) arr[i].getSalary();
                idMaxSalaryEmployee = arr[i].getId() - 1;
            }
        }
        return "Самая высокая зарплата у сотрудника - " + arr[idMaxSalaryEmployee].toString();
    }

    public static void getAllFio(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("ФИО " + arr[i].getFio());
        }
    }

    java.util.Random random = new java.util.Random();

    public static void main(String[] args) {
        Employee employeeArr[] = new Employee[10];
        System.out.println("Курсовая работа 1.");

        employeeArr[0] = new Employee("Ivanov I.I.", generateRandomDepartament(5), generateRandomSalary(100000));
        employeeArr[1] = new Employee("Petrov V.V.", generateRandomDepartament(5), generateRandomSalary(100000));
        employeeArr[2] = new Employee("Stepanov V.N.", generateRandomDepartament(5), generateRandomSalary(100000));
        employeeArr[3] = new Employee("Fokin K.A.", generateRandomDepartament(5), generateRandomSalary(100000));
        employeeArr[4] = new Employee("Vasilkin V.P.", generateRandomDepartament(5), generateRandomSalary(100000));
        employeeArr[5] = new Employee("Kormishina L.N", generateRandomDepartament(5), generateRandomSalary(100000));
        employeeArr[6] = new Employee("Korma A.N", generateRandomDepartament(5), generateRandomSalary(100000));
        employeeArr[7] = new Employee("Stal A.P", generateRandomDepartament(5), generateRandomSalary(100000));
        employeeArr[8] = new Employee("Ulyanov L.I.", generateRandomDepartament(5), generateRandomSalary(100000));
        employeeArr[9] = new Employee("Romanov P.A", generateRandomDepartament(5), generateRandomSalary(100000));


        System.out.println("Выполнение пункта 1.");//вывод данных по всем сотрудникам
        printEmployee(employeeArr);

        System.out.println("Выполнение пункта 2.");//расчет суммы зарплат за месяц
        System.out.println("Сумма затрат на зарплаты за месяц составила = " + calculateSalaryOfMonth(employeeArr));

        System.out.println("Выполнение пункта 3.");//найти самую сотрудника с самой низкой зарплатой
        System.out.println(findEmployeeMinSalary(employeeArr));

        System.out.println("Выполнение пункта 4.");//найти сотрудника с самой высокой зарплатой
        System.out.println(findEmployeeMaxSalary(employeeArr));

        System.out.println("Выполнение пункта 5.");//расчет среднего значения зарплаты
        System.out.println("Среднее значение зарплаты составило " + calculateAverageSalary(employeeArr));
        System.out.println("Выполнение пункта 6.");//получение фио всех сотрудников
        getAllFio(employeeArr);

    }

}

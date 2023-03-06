import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static Employee employeeArr[] = new Employee[10];

    public static int generateRandomInt(int bound) {
        java.util.Random random = new java.util.Random();
        int randomInt = random.nextInt(bound);
        return randomInt;
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
        int salary = employeeArr[0].getSalary();
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

    public static void indexSalary(Employee[] employees, int indexPercent) {
        double indexRatio = (double) (100 + indexPercent) / 100;
        for (int i = 0; i < employees.length; i++) {
            double salaryNow = employees[i].getSalary();
            salaryNow = salaryNow * indexRatio;
            employees[i].setSalary((int) salaryNow);
        }

    }

    public static Employee minSalaryEmployee(int department) {

        int minSalary = Integer.MAX_VALUE;
        Employee employee = null;
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i].getDepartament() == department && minSalary > employeeArr[i].getSalary()) {
                minSalary =  employeeArr[i].getSalary();
                employee = employeeArr[i];
            }
        }
        return employee;

    }
    public static Employee maxSalaryEmployee(int department) {

        int minSalary = Integer.MIN_VALUE;
        Employee employee = null;
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i].getDepartament() == department && minSalary < employeeArr[i].getSalary()) {
                minSalary =  employeeArr[i].getSalary();
                employee = employeeArr[i];
            }
        }
        return employee;

    }

    public static int sumSalaryDepartament(int departament) {
        int sum = 0;
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i].getDepartament()==departament)
                sum = sum + employeeArr[i].getSalary();

        }
        return sum;
    }
    public static void indexSalaryDept (int department,int indexRatioPercent) {
        double ratio = (double) (100 + indexRatioPercent) / 100;
        for (int i = 0; i < employeeArr.length; i++) {
            if (department==employeeArr[i].getDepartament()){
                double s =employeeArr[i].getSalary()*ratio;
                employeeArr[i].setSalary((int) s);
            }
        }
    }
    public static int middleSalaryDepartament(int departament) {
        int sum = 0;
        int k = 0;
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i].getDepartament()==departament) {
                sum = sum + employeeArr[i].getSalary();
                k++;

        }}
        return sum/k;
    }
    public static void printWithoutDept () {
        for (int i = 0; i < employeeArr.length; i++) {
            System.out.println("ФИО: " + employeeArr[i].getFio() + ", зарплата =" + employeeArr[i].getSalary() + ", id=" + employeeArr[i].getId());

        }
    }
    public static void findSalaryLessThan (int salaryBound) {
        System.out.println("\n"+"Зарплата меньше " +salaryBound+" руб у сотрудников :");
        for (int i = 0; i <employeeArr.length;  i++) {
            if (employeeArr[i].getSalary()<salaryBound) {
                System.out.println("Id "+employeeArr[i].getId()+" , Ф.И.О "+employeeArr[i].getFio()+" ,зарплата "+employeeArr[i].getSalary());
            }
        }
    }
    public static void findSalaryMoreThan (int salaryBound) {
        System.out.println("\n"+"Зарплата больше  " +salaryBound+" руб у сотрудников :");
        for (int i = 0; i <employeeArr.length;  i++) {
            if (employeeArr[i].getSalary()>salaryBound) {
                System.out.println("Id "+employeeArr[i].getId()+" , Ф.И.О "+employeeArr[i].getFio()+" ,зарплата "+employeeArr[i].getSalary());
            }
        }
    }
    java.util.Random random = new java.util.Random();

    public static void main(String[] args) {
        System.out.println("Курсовая работа 1.");

        employeeArr[0] = new Employee("Ivanov I.I.", generateRandomInt(5), generateRandomInt(100000));
        employeeArr[1] = new Employee("Petrov V.V.", generateRandomInt(5), generateRandomInt(100000));
        employeeArr[2] = new Employee("Stepanov V.N.", generateRandomInt(5), generateRandomInt(100000));
        employeeArr[3] = new Employee("Fokin K.A.", generateRandomInt(5), generateRandomInt(100000));
        employeeArr[4] = new Employee("Vasilkin V.P.", generateRandomInt(5), generateRandomInt(100000));
        employeeArr[5] = new Employee("Kormishina L.N", generateRandomInt(5), generateRandomInt(100000));
        employeeArr[6] = new Employee("Korma A.N", generateRandomInt(5), generateRandomInt(100000));
        employeeArr[7] = new Employee("Stal A.P", generateRandomInt(5), generateRandomInt(100000));
        employeeArr[8] = new Employee("Ulyanov L.I.", generateRandomInt(5), generateRandomInt(100000));
        employeeArr[9] = new Employee("Romanov P.A", generateRandomInt(5), generateRandomInt(100000));


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
            System.out.println("Повышенная сложность");
            int indexSalaryPercent = 20;//% изменения ЗП
            indexSalary(employeeArr, indexSalaryPercent);
            printEmployee(employeeArr);
            System.out.println();
            System.out.println("Повышенная сложность");

            System.out.println("Сотрудник с самой минимальной зарплатой  в отделе "+ minSalaryEmployee(2));//0
            System.out.println("Сотрудник с самой максимальной зарплатой в отделе " +maxSalaryEmployee(3));//1
            System.out.println("Общие затраты на зарплату по отделу "+ sumSalaryDepartament(4));//2
            System.out.println("Средняя зарплата по отделу " + middleSalaryDepartament(3));//3
            indexSalaryDept(2,10);//4
            System.out.println();
            printWithoutDept();//5
            findSalaryLessThan(80000);//3-0
            findSalaryMoreThan(20000);//3-1

    }

}

public class EmployeeBook {
    private Employee[] employeeArr = new Employee[10];
    private int maxDept = 5;

    public void write() {
        employeeArr[0] = new Employee("Ivanov I.I.", generateRandomInt(5), generateRandomInt(100000));
        employeeArr[1] = new Employee("Petrov V.V.", generateRandomInt(5), generateRandomInt(100000));
        employeeArr[2] = new Employee("Stepanov V.N.", generateRandomInt(5), generateRandomInt(100000));
        employeeArr[3] = new Employee("Fokin K.A.", generateRandomInt(5), generateRandomInt(100000));
        employeeArr[4] = new Employee("Vasilkin V.P.", generateRandomInt(5), generateRandomInt(100000));
        employeeArr[5] = new Employee("Kormishina L.N", generateRandomInt(5), generateRandomInt(100000));
        employeeArr[6] = new Employee("Korma A.N", generateRandomInt(5), generateRandomInt(100000));
        employeeArr[7] = new Employee("Stal A.P", generateRandomInt(5), generateRandomInt(100000));
        employeeArr[8] = new Employee("Ulyanov L.I.", generateRandomInt(5), generateRandomInt(100000));
        employeeArr[9] = null;
//      employeeArr[9] = new Employee("Romanov P.A", generateRandomInt(5), generateRandomInt(100000));
    }

    public int generateRandomInt(int bound) {
        java.util.Random random = new java.util.Random();
        int randomInt = random.nextInt(bound);
        return randomInt;
    }

    public void printEmployee() {
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i] == null) {
                continue;
            }
            System.out.println(employeeArr[i].toString());
        }
    }

    public int calculateSalaryOfMonth() {
        int sum = 0;
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i] != null)
                sum = (int) (sum + employeeArr[i].getSalary());
        }
        return sum;
    }

    public int calculateAverageSalary() {
        int sum = 0;
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i] != null) {
                sum = (int) (sum + employeeArr[i].getSalary());
            }
        }
        return sum / employeeArr.length;
    }

    public Employee findEmployeeMinSalary() {
        int salary = this.employeeArr[0].getSalary();
        int idMinSalaryEmployee = 0;

        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i] != null && salary > employeeArr[i].getSalary()) {
                salary = (int) employeeArr[i].getSalary();
                idMinSalaryEmployee = employeeArr[i].getId() - 1;
            } else continue;
        }
        return employeeArr[idMinSalaryEmployee];
    }

    public Employee findEmployeeMaxSalary() {
        int salary = 0;
        int idMaxSalaryEmployee = 0;
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i] != null && salary < employeeArr[i].getSalary()) {
                salary = (int) employeeArr[i].getSalary();
                idMaxSalaryEmployee = employeeArr[i].getId() - 1;
            }
        }
        return employeeArr[idMaxSalaryEmployee];
    }

    public void getAllFio() {
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i] != null)
                System.out.println("ФИО " + employeeArr[i].getFio());
        }
    }

    public void indexSalary(int indexPercent) {
        double indexRatio = (double) (100 + indexPercent) / 100;
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i] != null) {
                double salaryNow = employeeArr[i].getSalary();
                salaryNow = salaryNow * indexRatio;
                employeeArr[i].setSalary((int) salaryNow);
            }
        }
    }

    public Employee minSalaryEmployee(int department) {

        int minSalary = Integer.MAX_VALUE;
        Employee employee = null;
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i] != null && employeeArr[i].getDepartament() == department && minSalary > employeeArr[i].getSalary()) {
                minSalary = employeeArr[i].getSalary();
                employee = employeeArr[i];
            }
        }
        return employee;
    }

    public Employee maxSalaryEmployee(int department) {

        int minSalary = Integer.MIN_VALUE;
        Employee employee = null;
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i] != null && employeeArr[i].getDepartament() == department && minSalary < employeeArr[i].getSalary()) {
                minSalary = employeeArr[i].getSalary();
                employee = employeeArr[i];
            }
        }
        return employee;
    }

    public int sumSalaryDepartament(int departament) {
        int sum = 0;
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i] != null && employeeArr[i].getDepartament() == departament)
                sum = sum + employeeArr[i].getSalary();
        }
        return sum;
    }

    public void indexSalaryDept(int department, int indexRatioPercent) {
        double ratio = (double) (100 + indexRatioPercent) / 100;
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i] != null && department == employeeArr[i].getDepartament()) {
                double s = employeeArr[i].getSalary() * ratio;
                employeeArr[i].setSalary((int) s);
            }
        }
    }

    public int middleSalaryDepartament(int departament) {
        int sum = 0;
        int k = 0;
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i] != null && employeeArr[i].getDepartament() == departament) {
                sum = sum + employeeArr[i].getSalary();
                k++;


            }

        }
        if (k == 0) {
            System.out.println("В указанном отделе нет сотрудников ");
            throw new RuntimeException();
        }
        return sum / k;
    }

    public void printWithoutDept() {
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i] != null)
                System.out.println("ФИО: " + employeeArr[i].getFio() + ", зарплата =" + employeeArr[i].getSalary() + ", id=" + employeeArr[i].getId());

        }
    }

    public void printSalaryLessThan(int salaryBound) {
        System.out.println("\n" + "Зарплата меньше " + salaryBound + " руб у сотрудников :");
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i] != null && employeeArr[i].getSalary() < salaryBound) {
                System.out.println("Id " + employeeArr[i].getId() + " , Ф.И.О " + employeeArr[i].getFio() + " ,зарплата " + employeeArr[i].getSalary());
            }
        }
    }

    public void greateEmployee(String fio, int departament, int salary) {
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i] == null) {
                employeeArr[i] = new Employee(fio, departament, salary);
                System.out.println("Создан новый сотрудник " + employeeArr[i].toString());
                break;
            }

        }
    }

    public void deleteEmployee(String fio) {
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i].getFio().equals(fio) && employeeArr[i] != null) {
                employeeArr[i] = null;
                System.out.println("Сотрудник удален.");
                break;
            }
        }
    }

    public void deleteEmployee(int id) {
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i].getId() == id && employeeArr[i] != null) {
                employeeArr[i] = null;
                System.out.println("Сотрудник удален.");
                break;
            }
        }
    }

    public void findSalaryMoreThan(int salaryBound) {
        System.out.println("\n" + "Зарплата больше  " + salaryBound + " руб у сотрудников :");
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i] != null && employeeArr[i].getSalary() > salaryBound) {
                System.out.println("Id " + employeeArr[i].getId() + " , Ф.И.О " + employeeArr[i].getFio() + " ,зарплата " + employeeArr[i].getSalary());
            }
        }
    }

    public void changeSalaryEmployee(int id, int salaryNew) {
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i] != null && employeeArr[i].getId() == id) {
                employeeArr[i].setSalary(salaryNew);
                System.out.println("Уровень зарплаты изменен");
            }

        }
    }

    public void changeSalaryEmployee(String fio, int salaryNew) {
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i] != null && employeeArr[i].getFio().equals(fio)) {
                employeeArr[i].setSalary(salaryNew);
                System.out.println("Уровень зарплаты изменен");
            }

        }
    }

    public void printFioForDept() {
        int k = -1;
        for (int j = 0; j < maxDept; j++) {
            k++;
            System.out.println("Сотрудники отдела № " + k);
            for (int i = 0; i < employeeArr.length; i++) {
                if (employeeArr[i] != null && employeeArr[i].getDepartament() == k) {
                    System.out.println(employeeArr[i].toString());
                }
            }
        }


    }
}







public class Main {
        public static void main(String[] args) {
        System.out.println("Курсовая работа 1.");
        System.out.println("Уровень 3");
        EmployeeBook emp = new EmployeeBook();
        emp.write();
        emp.printEmployee();
        System.out.println("Сумма зарплат за месяц составила " + emp.calculateSalaryOfMonth());
        System.out.println("Средная зарплата равна " + emp.calculateAverageSalary());
        System.out.println("Сотрудник с самой минимальной зарплатой " + emp.findEmployeeMinSalary());
        System.out.println("Сотрудник с самой максимальной зарплатой "+ emp.findEmployeeMaxSalary());
        emp.getAllFio();
        emp.indexSalary(2);
        System.out.println("Во 2 отделе  самая минимальная зарплата у "+emp.minSalaryEmployee(2));
        System.out.println("Во 2 отделе  самая максимальная зарплата у " +emp.maxSalaryEmployee(2));
        System.out.println("Затраты на зарпату 2 отдела " + emp.sumSalaryDepartament(2));
        emp.indexSalaryDept(2,20);
        System.out.println("Средняя зарплата во втором отделе " +emp.middleSalaryDepartament(2));
        emp.printWithoutDept();
        emp.printSalaryLessThan(50000);
        System.out.println("проверка");
        emp.printEmployee();
        emp.greateEmployee("Zaykin",1,20000);
        emp.deleteEmployee(10);
        emp.findSalaryMoreThan(20000);
        emp.changeSalaryEmployee(6, 10000);
        emp.printFioForDept();
    }
}


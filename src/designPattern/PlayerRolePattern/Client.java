package designPattern.PlayerRolePattern;

import java.util.ArrayList;

public class Client {
    private static ArrayList<EmployeeCore> employeeList() {
        ArrayList<EmployeeCore> employeeList = new ArrayList<EmployeeCore>();
        employeeList.add(new EmployeeCore("James", "1"));
        employeeList.add(new EmployeeCore("Ben", "2"));
        employeeList.add(new EmployeeCore("Tom", "3"));

        Developer d = new Developer(employeeList.get(0));
        employeeList.get(0).addRole("developer", d);

        Tester t = new Tester(employeeList.get(1));
        employeeList.get(1).addRole("tester", t);

        Tester t2 = new Tester(employeeList.get(2));
        employeeList.get(2).addRole("tester", t2);

        Developer d2 = new Developer(employeeList.get(2));
        employeeList.get(2).addRole("developer", d2);

        return employeeList;
    }

    public static void main(String[] args) {
        ArrayList<EmployeeCore> employeeList = employeeList();

        for (Employee emp : employeeList) {
            if (emp.hasRole("developer")) {
                Developer developer = (Developer) emp.getRole("developer");
                developer.doCoding();
            }

            if (emp.hasRole("tester")) {
                Tester tester = (Tester) emp.getRole("tester");
                tester.doTesting();
            }
        }
    }
}

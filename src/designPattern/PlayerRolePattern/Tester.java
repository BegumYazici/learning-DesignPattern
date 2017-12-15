package designPattern.PlayerRolePattern;

public class Tester extends EmployeeRole {

    Tester(EmployeeCore employee){
        this.empCore = employee;
    }

    public void doTesting(){
        System.out.println(empCore.getName()+": I am Testing");
    }
}

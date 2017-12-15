package designPattern.PlayerRolePattern;

public class Developer extends EmployeeRole {

    Developer(EmployeeCore employee){
        this.empCore=employee;
    }

    public void doCoding(){
        System.out.println(empCore.getName()+": I am Coding");
    }
}

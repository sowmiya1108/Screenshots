package com.company;
import java.util.*;

public class Employeecoll {

    public static void main(String[] args){
        System.out.println("Choose any of the option");
        String options;
        Scanner sc = new Scanner(System.in);
        System.out.println("1 id");
        System.out.println("2 Name");
        System.out.println("3 Department");
        System.out.println("4 Salary");
        int menuOption = sc.nextInt();
        switch (menuOption){
            case 1:
                options = "(a) ID";
                HashSet<employeeDetails> idcomp=new HashSet<>();
                idcomp.add(new employeeDetails(101,"sowmi","A",20000));
                idcomp.add(new employeeDetails(102,"abi","A",60000));
                idcomp.add(new employeeDetails(105,"susi","A",40000));
                idcomp.add(new employeeDetails(104,"jinz","A",30000));
                idcomp.add(new employeeDetails(103,"janz","A",10000));
                for(employeeDetails e:idcomp){
                    System.out.println(e);
                }
                break;
            case 2:
                options = "(b) Name";
                TreeSet<employeeDetails> namecomp = new TreeSet<>(new FirstComparator());
                namecomp.add(new employeeDetails(101,"sowmi","A",20000));
                namecomp.add(new employeeDetails(102,"abi","A",60000));
                namecomp.add(new employeeDetails(105,"susi","A",40000));
                namecomp.add(new employeeDetails(104,"jinz","A",30000));
                namecomp.add(new employeeDetails(103,"janz","A",10000));
                for (employeeDetails e : namecomp)
                {
                    System.out.println(e);
                }
                break;
            case 3:
                options = "(c) Department";
                break;
            case 4:
                options = "(d) Salary";
                break;
        }
        sc.close();
    }
    static class Namecomp implements Comparator<employeeDetails>{

        @Override
        public int compare(employeeDetails e1, employeeDetails e2) {
            {
                return e1.getName().compareTo(e2.getName());
            }
        }
    }
}



class FirstComparator implements Comparator<employeeDetails>
{
    public int compare(employeeDetails e1, employeeDetails e2)
    {
        return((e1.name).compareTo(e2.name));
    }
}
class employeeDetails implements Comparable<employeeDetails>
{
    public int id;
    public String name;
    public String department;
    public double salary;


   public employeeDetails(int id, String name, String department, double salary)
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public String toString()
    {
        return " "+this.id+" "+this.name+" "+this.department+" "+this.salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode(){
       return Objects.hash(department,id,name,salary);
}

@Override
    public boolean equals(Object obj){
       if(this==obj)
           return true;
       if(obj==null)
           return false;
       if(getClass()!=obj.getClass())
           return false;
       employeeDetails other=(employeeDetails) obj;
    return Objects.equals(department, other.department) && id == other.id && Objects.equals(name, other.name)
            && salary == other.salary;
}

public int compareTo(employeeDetails o){
       if(this.id>o.id)
           return 1;
       else if(this.id<o.id)
           return -1;
       else return 0;
}

}




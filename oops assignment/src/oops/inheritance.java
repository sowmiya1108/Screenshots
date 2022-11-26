package oops;

 class Employee {
    int salary = 6000;

}
    class Manager extends Employee {
        int incentive = salary + 2000;
    }
    class Labour extends Employee{
    int overtime=salary+1000;
    }
    public class inheritance
    {
        public static void main(String[] args){
            Manager manager=new Manager();
            Labour labour=new Labour();

            System.out.println("manager salary is: "+manager.salary);
            System.out.println("salary with incentive:"+manager.incentive);
            System.out.println("Labour salary is:" +labour.salary);
            System.out.println("salary with overtime:"+labour.overtime);
        }
}

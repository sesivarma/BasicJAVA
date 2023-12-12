import javax.annotation.processing.SupportedSourceVersion;

public class Employee {
    static String companyName = "Girus";
    double mtech;
    String name;
    double salary;
    String designation;
    String shift;

    public Employee(String name,double salary,String designation,String shift){
    this.name= name;
    this.salary= salary;
    this.designation= designation;
    this.shift= shift;

    }
    public Employee(String name,double salary,String designation,String shift,double mtech){
        this(name, salary, designation, shift);
        this.mtech=mtech;
    }
    public void EmployeeDetails(){
        System.out.println("name :"+name);
        System.out.println("salary"+salary);
        System.out.println("designation :"+designation);
        System.out.println("shift :"+shift);
        if(salary>100000)
        System.out.println("metch"+mtech);
        System.out.println("******************");
        

    }
}

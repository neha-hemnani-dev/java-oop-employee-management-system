import java.util.Scanner;
class Employee {
    private String name;
    private int id;
    private double salary;

  Employee(String name,int id,double salary){
      this.name=name;
      this.id=id;
      this.salary=salary;
  }

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getName(){
      return name;
    }
    public void setName(String name) {
        this.name=name;
    }

    public double getSalary() {
      return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }


    public void displayDetails() {
        System.out.println("Employee name is : " + getName());
        System.out.println("Employee id is : " + getId());
        System.out.println("Employee salary is : " + getSalary());
    }
}

    class Company {
    int size;
    Company(){

    }
    Employee[] arr;

        public void addEmployee(Scanner sc,int size) {
            this.size=size;
            arr = new Employee[size];
            for (int i = 0; i < size; i++) {

                System.out.println("Enter employee name : ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.println("Enter employee id : ");
                int id = sc.nextInt();
                System.out.println("Enter your salary : ");
                double salary = sc.nextDouble();
                arr[i] = new Employee(name,id,salary);
            }

        }

        public void searchEmployee(int fx) {
            boolean found=false;
            for (int i = 0; i < size; i++) {
                if (arr[i].getId() == fx) {
                    System.out.println("Employee found ");
                    arr[i].displayDetails();
                    found=true;
                    break;
                }
            }
            if(! found){
                System.out.println("Employee with id : "+fx+" not found");
            }
            }

        public void displayAll() {
            if(arr == null || size == 0){
                System.out.println("No employee to display!");
                return;
            }
            System.out.println("list of all employees : ");
            for (int i = 0; i < size; i++) {
                System.out.println("Employee "+(1+i));
                arr[i].displayDetails();
                System.out.println("----------------------");
            }
        }
        }
public class TheEmployeeRecordKeeper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Company company=new Company();

        while (true){
        System.out.println("1 : Add new employees");
        System.out.println("2 : Search for an employee");
        System.out.println("3 : Display all employees");
            System.out.println("4 : Exit");
        int choice= sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("How much employee do you want to add ?");
                int size= sc.nextInt();
                company.addEmployee(sc,size);
                break;
            case 2:
                System.out.println("Enter employee id to search :");
                int fx= sc.nextInt();
                company.searchEmployee(fx);
                break;
            case 3:
                company.displayAll();
                break;
            case 4:
                System.out.println("===========Thank you==========");
                return;
            default:
                System.out.println("Invalid choice");
        }


        }

    }
}
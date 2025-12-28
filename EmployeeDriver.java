import java.util.Arrays;
class Employee implements Comparable<Employee>
{
    int empId ;
    String ename ;
    String dept ;
    double sal ;
    

    public Employee(int empId, String ename, String dept, double sal) {
        super();
        this.empId  = empId;
        this.ename = ename;
        this.dept = dept;
        this.sal = sal;
    }
    
    @Override
    public String toString() 
    {
        return "Employee [empId= " + empId + ", ename=" + ename + ", depart=" + dept + ", salary=" + sal + "]";
    }

    @Override
    //asce for empid
    public int compareTo(Employee emp)
    {
        return this.empId-emp.empId;
    }

        // //desc for emp id
    public int compareTo(Employee emp)
    {
        return emp.empId-this.empId;
    }
    // //ascfor ename
    // public int compareTo(Employee emp)
    // {
    //     return this.ename-emp.ename;
    // }

    // //desc for ename
    // public int compareTo(Employee emp)
    // {
    //     return emp.ename-this.ename;
    // }

    // //asc fro salary
    // public int compareTo(Employee emp)
    // {
    //     return this.sal-emp.sal;
    // }

    // //desc for salary
    // public int compareTo(Employee emp)
    // {
    //     return emp.sal-this.sal;
    // }


    public class EmployeeDriver 
    {
        public static void main(String[] args)
        {
    
            Employee[] employeeList = new Employee[5];

            employeeList[0] = new Employee(1234, "RAMESH", "HR", 50000);
            employeeList[1] = new Employee(1232, "SURESH", "TESTER", 40000);
            employeeList[2] = new Employee(1235, "GANESH", "DEVELOPER", 60000);
            employeeList[3] = new Employee(1231, "RAJESH", "FRONT END DEVELOPER", 45000);
            employeeList[4] = new Employee(1233, "MAHESH", "FM", 55000);

            for (Employee employee : employeeList){
                System.out.println(employee);
            }

            Arrays.sort(employeeList);
            System.out.println("________________________________________________");
            for (Employee employee : employeeList){
                System.out.println(employee);
            }
        }
    }
}

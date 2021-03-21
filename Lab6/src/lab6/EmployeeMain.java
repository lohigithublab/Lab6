package lab6;

public class EmployeeMain 
{   
    public static void main(String[] args) 
    {
        //Main Method Starts.
        System.out.print("    Name      "); 
        System.out.print("      ID Number     "); 
        System.out.print("     Department      "); 
        System.out.println("   Position       "); 

        // Creating Instance of Employee Class with Constructor Of (id,name,department,position) parameters.
        Employee obj_Susan_Employee = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        System.out.println(obj_Susan_Employee.getName()+ "         "+ obj_Susan_Employee.getId() + "            "+ obj_Susan_Employee.getDepartment() + "       "+ obj_Susan_Employee.getPosition());
        
        // Creating Instance of Employee Class with Constructor Of (id,name,department,position) parameters.
        Employee obj_Mark_Employee = new Employee("Mark Jones", 39119, "IT", "Programmer");
        System.out.println(obj_Mark_Employee.getName()+ "           "+ obj_Mark_Employee.getId() + "                "+ obj_Mark_Employee.getDepartment() + "             "+ obj_Mark_Employee.getPosition());
        
        // Creating Instance of Employee Class with Constructor Of 4(id,name,department,position) parameters.
        Employee obj_Joy_Employee = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
        System.out.println(obj_Joy_Employee.getName()+ "           "+ obj_Joy_Employee.getId() + "           "+ obj_Joy_Employee.getDepartment() + "       "+ obj_Joy_Employee.getPosition());
        
        // Creating Instance of Employee Class with Default Constructor.
        Employee obj_Default_Constructor_Employee = new Employee();
        System.out.println(obj_Default_Constructor_Employee.getName()+ "                     "+ obj_Default_Constructor_Employee.getId() + "      "+ obj_Default_Constructor_Employee.getDepartment() + "    "+ obj_Default_Constructor_Employee.getPosition());
        
        // Creating Instance of Employee Class with 2(Id & Name) parameters Constructor.
        Employee obj_With_2Parameter_Constructor_Employee = new Employee("Lohi",20);
        System.out.println(obj_With_2Parameter_Constructor_Employee.getName()+ "                 "+ obj_With_2Parameter_Constructor_Employee.getId() + "      "+ obj_With_2Parameter_Constructor_Employee.getDepartment() + "    "+ obj_With_2Parameter_Constructor_Employee.getPosition());
        
        System.out.println("Consider this code for Extra Credit implemented toString Overriding by using above created 3 objects.");
        System.out.println("   Name              ID Number           Department          Position     "); 
        System.out.println(obj_Susan_Employee.toString());
        System.out.println(obj_Mark_Employee.toString());
        System.out.println(obj_Joy_Employee.toString());
        //Main method Ends.
    }
}

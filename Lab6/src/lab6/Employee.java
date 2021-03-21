package lab6;

public class Employee 
{
    private int id;
    private String name;
    private String department;
    private String position;
    
    // 4 Parameterized Constructor 
    public Employee(String name, int id, String department, String position)
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.position = position;
    }
    
    // 2 Parameterized Constructor 
    public Employee(String name, int id )
    {
        this.id = id;
        this.name = name;
        this.department = "";
        this.position = "";
    }
    
    // Default Constructor 
    public Employee()
    {
        this.id = 0;
        this.name = "";
        this.department = "";
        this.position = "";
    }
    
   // Getter for employee name
   public String getName() 
   {
     return name;
   }
   
   // Getter for employee department
   public String getDepartment() 
   {
     return department;
   }
   
   // Getter for employee position
   public String getPosition() 
   {
     return position;
   }
   
   // Getter for employee id
   public int getId() 
   {
     return id;
   }

    // Setter  for employee name
    public void setName(String newName) 
    {
     this.name = newName;
    }
   
    // Setter  for employee name
    public void setDepartment(String newDepartment) 
    {
        this.department = newDepartment;
    }
    
    // Setter  for employee name
    public void setPosition(String newPosition) 
    {
        this.position = newPosition;
    }
    
    // Setter  for employee name
    public void setId(int newID) 
    {
        this.id = newID;
    }
    
    // toString Method overriding to get Values in one shot.
    @Override
    public String toString()
    {
        return this.name + "         "+this.id+"          "+this.department+"           "+this.position;
    }
}

package com.hexaware.MLP204.model;

import com.hexaware.MLP204.persistence.DbConnection;
import com.hexaware.MLP204.persistence.EmployeeDAO;
import com.hexaware.MLP204.util.CliMain;

import java.util.Objects;
import java.util.List;

import java.util.Date;

/**
 * Employee class to store employee personal details.
 * @author hexware
 */
public class Employee {

  /**
   * empId to store employee id.
   */
  private int empId;
  private String First_name;
    private String Second_name;
    private int Contact_no;
    private String Address;
    private String Designation;
    private String Blood_group;
    private int Manager_id;
    private String user_name;
    private String password;
    private String emailid;
    private Date date_of_joining;
  /**
  //  * empId to store employee id.
  //  */
  // private int empId;
  // private String First_name;
  //   private String Second_name;
  //   private int Contact_no;
  //   private String Address;
  //   private String Designation;
  //   private String Blood_group;
  //   private String Manager_id;
  //   private String user_name;
  //   private String password;

  @Override
  public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Employee emp = (Employee) obj;
    if (Objects.equals(empId, emp.empId) && 
    Objects.equals( First_name, emp.First_name) &&
     Objects.equals(Second_name, emp.Second_name) && 
     Objects.equals(Contact_no, emp.Contact_no) && 
     Objects.equals( Address ,emp.Address)&&
      Objects.equals( Designation, emp.Designation) && 
      Objects.equals( Blood_group,emp. Blood_group)&& 
    Objects.equals( Manager_id,emp.Manager_id)&&
    Objects.equals( user_name,emp.user_name) && 
    Objects.equals(password,emp.password) ) {
      return true;
    }
    return false;
  }

  // @Override
  // public String toString() {
    
  //   return "employee id" + empId +
  //   "first name" +  First_name+
  //   "second name"+ Second_name+
  //   "contact"+ Contact_no +
  //   "address" + Address+
  //   "designation"  + Designation +
  //   "blood group" + Blood_group +
  //   "manager id"+ Manager_id +
  //   "user name"+ user_name +
  //   "password" + password;
  // }

  @Override
  public final int hashCode() {
    return Objects.hash(empId);
  }
  
  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return "empid"+empId+"Firstname"+First_name+
    "Secondname"+Second_name+"Contactno"+Contact_no+
    "Address"+Address+"Designation"+Designation+
    "Bloodgroup"+Blood_group+"Managerid"+Manager_id+
    "username"+user_name+"password"+password+"emailid"+emailid+"date of joining"+date_of_joining;
  }
  /**
   * @param argEmpId to initialize employee id.
   */
  public Employee(final int argEmpId,final int empId,final String First_name,final String Second_name,final int Contact_no,
  final String Address,final String Designation,final String Blood_group,final int Manager_id,final String user_name,
  final String password)  {
    this.empId = argEmpId;
    this.First_name=First_name;
    this.Second_name= Second_name;
    this.Contact_no= Contact_no;
    this.Address= Address;
    this.Designation=Designation;
    this.Blood_group=Blood_group;
    this.Manager_id=Manager_id ;
    this.user_name=user_name ;
    this.password=password ;

  }


//   /**
//    * Gets the EmployeeId.
//    * @return this Employee's ID.
//    */
  public final int getEmpId() {
    return empId;
  }
  public final String getFirst_name()
        {
            return First_name;
        }
  public final String getSecond_name()
        {
            return Second_name;
        }
  public final int getContact_no()
        {
            return Contact_no;
        }
  public final String getAddress()
        {
            return Address;
        }
  public final String getDesignation()
        {
            return Designation;
        }
  public final String getBlood_group()
        {
            return Blood_group;
        }
  public final int getManager_id()
        {
            return Manager_id;
        }
  public final String getuser_name()
        {
            return user_name;
        }
  public final String getpassword()
        {
            return password;
        }
  public final String getEmailid()
        {
            return emailid;
        }
  public final Date getDate_of_joining()
        {
            return date_of_joining;
        }

//   /**
//    *
//    * @param argEmpId to set employee id.
//    */
//   public final void setEmpId(final int argEmpId) {
//     this.empId = argEmpId;
//   }
//   public final void setFirst_name (String First_name){
//     this.First_name = First_name;
// }
// public final void setSecond_name (String Second_name){
//     this.Second_name = Second_name;
// }
// public final void setContact_no (int Contact_no){
//     this.Contact_no = Contact_no;
// }
// public final void setAddress (String Address){
//     this.Address = Address;
// }
// public final void setDesignation (String Designation){
//     this.Designation = Designation;
// }
// public final void setBlood_group (String Blood_group){
//     this.Blood_group = Blood_group;
// }
// public final void setManager_id (int Manager_id){
//     this.Manager_id = Manager_id;
// }
// public final void setUser_name (String User_name){
//   this.user_name = User_name;
// }
// public final void setPassword (String Password){
//   this.password = Password;
// }
// public final void setEmailid (String Emailid){
//   this.emailid = Emailid;
// }
// public final void setDate_of_joining (Date Date_of_joining){
//   this.date_of_joining = Date_of_joining;
// }


  static Employee[] arr = new Employee[10];

  static  addEmployee() {
    Employee e = new Employee();
    e.setEmpId(50969);
    e.setFirst_name("harshitha");
    e.setSecond_name("kadipaka");
    e.setContact_no(789345);
    e.setAddress("padur");
    e.setDesignation("it");
    e.setBlood_group("b-");
    e.setManager_id(50600);
    e.setUser_name("50969");
    e.setPassword("123");
    e.setEmailid("harshitha.kadipaka@gmail.com");
    // e.setDate_of_joining(06 - 03 - 2020);

//   }

//   static void display() {
//     Employee em = new Employee();

//     for (int i = 0; i < 10; i++) {
//       addEmployee();
//     }
//     System.out.println("list of employees");
//     for (int i = 0; i < 10; i++) {
//       System.out.println(arr[i].empId + "    " + arr[i].First_name);
//     }
//   }

//   public final String getFirst_name()
//   {
//       return First_name;
//   }

//   public final void setFirst_name (String argFirst_name){
//     this.First_name = argFirst_name;
// }
// public final String getSecond_name()

//   {
//       return Second_name;}

// public final void setSecond_name (String argSecond_name){
//     this.Second_name = argSecond_name;
// }

//  public final int getContact_no(){

//    return Contact_no;
//         }

// public final void setContact_no (int argContact_no){
//   this.Contact_no = argContact_no;
// }

// public final String getAddress()
//         {
//             return Address;
//         }

// public final void setAddress (String argAddress){
//   this.Address = argAddress;
// }


// public final String getDesignation()
// {
//     return Designation;
// }

// public final void setDesignation (String argDesignation){
//   this.Designation = argDesignation;
// }

// public final String Blood_group()
// {
//     return Blood_group;
// }

// public final void setBlood_group (String argBlood_group){
//   this.Blood_group = argBlood_group;
// }

// public final String Manager_id()
// {
//     return Manager_id;
// }

// public final void setManager_id (String argManager_id){
//   this.Manager_id = argManager_id;
// }

// public final String user_name()
// {
//     return user_name;
// }
// public final void setuser_name (String arguser_name) {
//   this.user_name = arguser_name;
// }
// public final String password()
// {
//     return password;
// }
// public final void setpassword (String argpassword) {
//   this.password = argpassword;}





  /**
   * The dao for employee.
   */
  private static EmployeeDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(EmployeeDAO.class);
  }

  /**
   * list all employee details.
   * 
   * @return all employees' details
   */
  public static Employee[] listAll() {

    List<Employee> es = dao().list();
    return es.toArray(new Employee[es.size()]);
  }


  public static void insertEmployee(int empId, String First_name, String Second_name, 
  int Contact_no, String Address, String Designation, String Blood_group, String Manager_id,
   String username, String password, String emailid, Date Date_of_joining){
    dao().insertEmployee(empId, First_name, Second_name, Contact_no,
     Address,Designation, Blood_group, Manager_id, username, password, emailid, Date_of_joining);
  }

  public static void deleteEmployee(String Blood_group){
    dao().deleteEmployee(Blood_group);
  }

  public static void updateEmployee(String Address){
    dao().updateEmployee(Address);
  }

  /**
   * list employee details by id.
   * 
   * @param empID id to get employee details.
   * @return Employee
   */
  public static Employee listById(final int empID) {
    return dao().find(empID);
  }

public static void main(String[] args) {
    display();

}
}
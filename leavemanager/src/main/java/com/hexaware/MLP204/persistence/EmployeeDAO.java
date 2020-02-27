package com.hexaware.MLP204.persistence;

import com.hexaware.MLP204.model.Employee;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

import java.sql.Date;
import java.util.List;

/**
 * The DAO class for employee.
 */
public interface EmployeeDAO  {
  /**
   * return all the details of all the employees.
   * @return the employee array
   */
  
    // insert into table
    @SqlUpdate("insert into employee info(:empId, :First_name,:Second_name ,:Contact_no, :Address, :Designation, :Blood_group,:Manager_id, :user_name, :password, :emailid, :Date_of_joining)")
    void insertEmployee(@Bind("empId")int empId,
    @Bind("First_name") String First_name,
    @Bind("Second_name") String Second_name,
    @Bind("Contact_no") int Contact_no,
    @Bind("Address") String Address,
    @Bind("Designation") String Designation,
    @Bind("Blood_group") String Blood_group,
    @Bind("Manager_id") int Manager_id,
    @Bind("username") String username,
    @Bind("password") String password,
    @Bind("emailid") String emailid,
    @Bind("Date_of_joining") Date Date_of_joining);   

  @SqlQuery("SELECT * FROM EMPLOYEE")
  @Mapper(EmployeeMapper.class)
  List<Employee> list();



  /**
   * return all the details of the selected employee.
   * @param empID the id of the employee
   * @return the employee object
   */
  @SqlQuery("SELECT * FROM EMPLOYEE WHERE EMP_ID = :empID")
  @Mapper(EmployeeMapper.class)
  Employee find(@Bind("empID") int empID);

  @sqlUpdate("Update from Employee where ADDRESS = :Address")
  void updateEmployee(@Bind("Address") String Address) ;

  @SqlQuery("delete from Employee where BLood_group= :Blood_group")
  void deleteEmployee(@Bind("Blood_group") String Blood_group);

  /**
  * close with no args is used to close the connection.
  */
  void close();
}

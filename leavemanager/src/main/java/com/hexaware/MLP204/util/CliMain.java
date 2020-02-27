package com.hexaware.MLP204.util;
import java.util.Scanner;

import com.hexaware.MLP204.model.Employee;

/**
 * Class CliMain provides the command line interface to the leavemanagement
 * application.
 */
public class CliMain {
  private Scanner option = new Scanner(System.in, "UTF-8");

  // employee menu
  private void mainMenu() {
    System.out.println("Leave Management System");
    System.out.println("-----------------------");
    System.out.println("1.Employees menu");
    System.out.println("2.Leaves menu");
    System.out.println("3.Exit");
    System.out.println("Enter your choice:");
    int ch = option.nextInt();

    switch(ch){

    case 1:
    System.out.println("1. Add employee");
    System.out.println("2. List All Employees Info");
    System.out.println("3. Display Employee Info");
    System.out.println("4. Update Employee Details");
    System.out.println("5. Delete Employee Details");
    System.out.println("6. Back to main menu");
    int menuOption = option.nextInt(); 
    mainMenuDetails(menuOption);
    break;

    case 2:
    System.out.println("1.Apply for Leave");
    System.out.println("2.Check Leave Status");
    System.out.println("3.Edit Leave");
    System.out.println("4.Cancel Leave");
    System.out.println("5.List Reportees Leave");
    System.out.println("6.List my Leaves");
    System.out.println("7.Leave Approval");
    System.out.println("8.Leave Availability");
    System.out.println("8. Exit");
    System.out.println("Enter your choice:");
    int menuOption1 = option.nextInt();
    mainMenuDetails(menuOption1);

    case 3:
    // halt since normal exit throws a stacktrace due to jdbc threads not responding
    Runtime.getRuntime().halt(0);
  }
}

  
    // login details for employee
  public void login(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Username:");
    String un = sc.next();
    System.out.println("Password:");
    String pw = sc.next();

    if (un.equals("harshitha") && (pw.equals("reetu"))) {
      
          System.out.println("login successful");
      
    }
    else{
      System.out.println("please try again");
    }
  }


 

// for employee

  private void mainMenuDetails(final int selectedOption) {
    switch (selectedOption) {
      case 1: 
            
            listEmployeesDetails();
            break;
      case 2:
            listEmployeeDetail();
            break;
      
      case 3:
        
      break;
        default: 
        mainMenu();
    }  
    // mainMenu();
  }

  

  private void listEmployeeDetail() {
    System.out.println("Enter an Employee id");
    int empId = option.nextInt();
    Employee employee = Employee.listById(empId);
    if (employee == null) {
      System.out.println("Sorry, No such employee");
    } else {
      System.out.println(employee.getEmpId());
    }
  }

  private void listEmployeesDetails() {
    Employee[] employee = Employee.listAll();
    for (Employee e : employee) {
      System.out.println(e.getEmpId()+" "+ e.getFirst_name()+" "+e.getSecond_name()+" "+e.getContact_no()+" "+ e.getAddress()+" "+e.getDesignation()+" "+e.getBlood_group()+" "+ e.getManager_id());
    }

  }

  
  /**
   * The main entry point.
   * @param ar the list of arguments
   */
  public static void main(final String[] ar) {
    Employee m=new Employee();
     final CliMain mainObj = new CliMain();
     mainObj.mainMenu();
    m.login();

  }
}

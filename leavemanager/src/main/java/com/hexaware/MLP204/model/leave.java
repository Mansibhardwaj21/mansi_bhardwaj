package com.hexaware.MLP204.model;

import java.util.Objects;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class leave{

   
    private int emp_id;
    private int leave_left;
    private Date starting_date;
    private Date ending_date;
    private String leave_type;
    private String leave_reason;
    private String notification_status;
    private String  leave_status;
    private String apply_leave;
    private int total_leaves;
    private int leave_id;

    @Override
    public final boolean equals(final Object obj) {
      if (obj == null) {
        return false;
      }
      if (getClass() != obj.getClass()) {
        return false;
      }
      leave lv = (leave) obj;
      if (Objects.equals(emp_id, lv.emp_id) && Objects.equals(leave_left, lv.leave_left)
          && Objects.equals(starting_date, lv.starting_date) && Objects.equals(ending_date, lv.ending_date)
          && Objects.equals(leave_type, lv.leave_type) && Objects.equals(leave_reason, lv.leave_reason)
          && Objects.equals(notification_status, lv.notification_status)
          && Objects.equals(leave_status, lv.leave_status) && Objects.equals(apply_leave, lv.apply_leave)
          && Objects.equals(total_leaves, lv.total_leaves) && Objects.equals(leave_id, lv.leave_id)) {
        return true;
      }
      return false;
    }

    @Override
    public String toString() {

      return "employee id" + emp_id + "leave_left" + leave_left + "starting_date" + starting_date + "ending_date"
          + ending_date + "leave_type" + leave_type + "leave_reason" + leave_reason + "notification_status"
          + notification_status + "leave_status" + leave_status + "apply_leave" + apply_leave + "total_leaves"
          + total_leaves + "leave_id" + leave_id;
    }

    public leave(final int emp_id, final int leave_left, final Date starting_date, final Date ending_date,
        final String leave_type, final String leave_reason, final String notification_status,
        final String approval_status, final String leave_status, final String apply_leave, final int total_leaves,
        final int leave_id) {
      this.emp_id = emp_id;
      this.leave_left = leave_left;
      this.starting_date = starting_date;
      this.ending_date = ending_date;
      this.leave_type = leave_type;
      this.leave_reason = leave_reason;
      this.notification_status = notification_status;
      this.leave_status = leave_status;
      this.apply_leave = apply_leave;
      this.total_leaves = total_leaves;
      this.leave_id = leave_id;
    }

    // getters

    // public leave(int int1, int int2, String string, String string2,
    // String string3, String string4, String string5,
    // Date date, Date date2) {
    // }

    public final int getid() {
      return emp_id;
    }

    public final int getleaveleft() {
      return leave_left;
    }

    public final Date getstartdate() {
      return starting_date;
    }

    public final Date getenddate() {
      return ending_date;
    }

    public final String getleavetype() {
      return leave_type;
    }

    public final String getleavereason() {
      return leave_reason;
    }

    public final String getnotify() {
      return notification_status;
    }

    public final String getstatus() {
      return leave_status;
    }

    public final String getapply_leave() {
      return apply_leave;
    }

    public final int gettotal_leaves() {
      return total_leaves;
    }

    public final int getleave_id() {
      return leave_id;
    }

    // setters
    public final void setid(int id) {
      emp_id = id;
    }

    public final void setleaveleft(int leaveleft) {
      leave_left = leaveleft;
    }

    public final void setstartdate(Date startdate) {
      starting_date = startdate;
    }

    public final void setenddate(Date enddate) {
      ending_date = enddate;
    }

    public final void setleavetype(String leavetype) {
      leave_type = leavetype;
    }

    public final void setleavereason(String leavereason) {
      leave_reason = leavereason;
    }

    public final void setleavenotify(String notify) {
      notification_status = notify;
    }

    public final void setleave_status(String L_status) {
      L_status = leave_status;
    }

    public final void setapply_leave(String A_status) {
      A_status = apply_leave;
    }

    public final void settotal_leaves(int t_leave) {
      t_leave = total_leaves;
    }

    public final void setleave_id(int l_id) {
      l_id = leave_id;
    }

    // method for approve or deny leave

    public static void approveDeny(final int leave_id, final int emp_id, final String leave_status) {
      leave lv = leave.listbyid(leave_id);
       String res = null;
       if (lv != null) {
         int noOfDays = lv.gettotal_leaves();
         int l_id = lv.getid();

         System.out.println(leave_status);
         System.out.println(lv.getstatus());


         if (emp_id != emp_id) {
           System.out.println("You are not authorised to access this employee.");
         }
         if (lv.getstatus().equals("total_leave-leave_left-1")) {
           System.out.println("APPROVED");}

           
          if (leave_status.equals("total_leave-leave_left")) {
           System.out.println( "REJECTED");} 
           else
           {System.out.println("pending");}
         
          }}

          

     private static leave listbyid(int leave_id) {
      return null;
    }

   
   


//method for apply leave

public void apply_for_leave(String start_date, String end_date, String leave_type, String leave_reason)
      throws ParseException {

        // Employee e = new Employee();
        // if(e!= null){
          SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
          Date leave_from = sdf.parse(start_date);
          Date leave_to = sdf.parse(end_date);

        // }
        if (leave_to.after(leave_from)) {
            System.out.println("Yes !! Can apply for leave");;
        } else {
            System.out.println("Enter valid input");
        }
      
        if(leave_type =="casual"){
          System.out.println("Total leaves to be taken is 12");
        }
        else if(leave_type =="earned"){
          System.out.println("Total leaves to be taken is 12");
        }
        else if(leave_type =="sick leave"){
          System.out.println("Total leaves to be taken is 12");
        }
        else if(leave_type == "Maternity leave"){
          System.out.println("Maximum leaves to be taken is upto 6 months");
        }
        else{
          System.out.println("You have to mention the type of leave is mandatory");
        }

        if(leave_reason != null)
        {
          System.out.println("validated reason : enter the reason");
        }
        else
        {
          System.out.println("reason is mandatory");
        }
        }




     void Leave_left(int leave_left) {
        if (leave_left == 0 ){
        System.out.println("no leave available");}
        else {
        System.out.println("available leaves =" + leave_left);}
                                                    
      }

      void leave_history(String apply_leave){
        if (apply_leave == null) {
          System.out.println(" no history available ");
        } 
        else {System.out.println("leave history is" + apply_leave + starting_date + ending_date);
        }

      }
     void cancel_leave(String leave_status){
       if (leave_status == "pending") {
         System.out.println(" leave can be cancelled ");
       }
         else
         { System.out.println("no pending leave" );
         }
       }




       @Override
       public int hashCode() {
         // TODO Auto-generated method stub
         return Objects.hash( emp_id,leave_left,starting_date ,ending_date,leave_type,leave_reason,
         notification_status,leave_status,apply_leave,total_leaves,leave_id);
       }


       

      }

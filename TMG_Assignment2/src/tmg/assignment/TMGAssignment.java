/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tmg.assignment;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author mitch
 */
public class TMGAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmployeeAndCustomerManagementForm form = new EmployeeAndCustomerManagementForm();
        //StockManagement form = new StockManagement();
        form.show();
        Date d = new Date();
        SimpleDateFormat sdf= new SimpleDateFormat("DD/MM/YYYY");

        


        
    }
    
}

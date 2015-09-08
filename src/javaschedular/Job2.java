/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaschedular;

import java.util.Date;


/**
 *
 * @author mohammad.sami
 */
public class Job2 implements IJob{

    @Override
    public void execute() {
      System.out.println("Printing from job 2 at " + new Date()); //To change body of generated methods, choose Tools | Templates.
    }
    
}

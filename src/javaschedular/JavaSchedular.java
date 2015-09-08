/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaschedular
;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author mohammad.sami
 */
public class JavaSchedular {

    /**
     * @param args the command line arguments
     */
    public static List<ScheduledJob> jobs= new ArrayList<ScheduledJob>() {};
    public static void main(String[] args) {
        ScheduledJob testjob1 = new ScheduledJob();
        testjob1.Job = new Job1();
        testjob1.date = new Date(System.currentTimeMillis()+(long)1*60*1000);
        jobs.add(testjob1);
        ScheduledJob testjob2 = new ScheduledJob();
        testjob2.Job = new Job2();
        testjob2.date = new Date(System.currentTimeMillis()+2*60*1000);
        jobs.add(testjob2);
        
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
  @Override
  public void run() {
      for (ScheduledJob job : jobs) {
          
          if (job.date.before(new Date()) && !job.isProcessed) {
              System.out.print(job.date + "=> ");
              job.Job.execute();
              job.isProcessed=true;
          }
      }
  }
}, 5*1000,5*1000);
        
        
    }
    
}





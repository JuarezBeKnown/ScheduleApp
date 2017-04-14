/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduleapp;

/**
 *
 * @author Ernesto Juarez
 */
public class Schedule {
    private String day;
    private int timeStart,timeEnd;
    private Doctor doctor = new Doctor();
    private Patient patient = new Patient();
    
    Schedule(){
        
    }
    
    Schedule(Doctor doc){
        setDoctor(doc);
    }
    
    Schedule(Doctor doc, Patient pat){
        setDoctor(doc);
        setPatient(pat);
    }
       
   Schedule(Doctor doc, Patient pat, String day,
            int timein, int timeout){
        setAppointment(doc,pat,day,timein,timeout);
    }
    
    public void setAppointment(Doctor doc, Patient pat,String day, int timein,int timeout){
        this.doctor=doc;
        this.patient=pat;
        this.day=day;
        this.timeStart=timein;
        this.timeEnd=timeout;
    }
    public void setAppointmentDateTime(String d, int t, int to){
        this.day = d;
        this.timeStart =t;
        this.timeEnd=to;
    }
    
    public void setDoctor(Doctor obj){
        doctor=obj;
    }
    public void setPatient(Patient obj){
        patient=obj;
    }
    public void setTime(int timein,int timeout){
        this.timeStart=timein;
        this.timeEnd=timeout;
    }
    public void setDay(String day){
        this.day =day;
    }
    
    // Get methods    
    public int getStartTime(){
        return timeStart;
    }
    public int getEndTime(){
        return this.timeEnd;
    }
    public String getDay(){
        return this.day;
    }
    
    public String getDoctorName(Doctor obj){
        return obj.getName();
    }
    
    public String getPatientName(Patient obj){
        return obj.getName();
    }
    
    
    //***************** Print methods 
    public void printAppointment(){
        System.out.println("----------------Appointment Information------------------");
        System.out.println("Doctor : " + doctor.getName()
                + "  " +  " Patient : " + patient.getName()+"\n");
        System.out.println("Appointment Time :\t  " + getDay()  + "  " +
                getStartTime() + " - " + getEndTime()+" hrs");
        
        System.out.println("---------------------------------------------------------");        
    }
    
    /*public void viewSchedule(){
        // fill array 
        ///String[][] array2D 
        System.out.println(); 
        System.out.println("----------------------------------------------Schedule---------------------------------"
                + "---------------"); 
        System.out.println("---------------------------------------------------------------------------------------"
                + "---------------"); 
        // print first row only for spacing later
        //for(int x =0;x<workDays.length;x++){
          //  System.out.print(array2D[0][x] + "         ");
        //}
    
        System.out.println();  
        System.out.println(); 
        
        //row skip row 1 because already printed
        for(int i=1;i<22;i++){    
            for(int j=0;j<7;j++){  //col
                System.out.print(array2D[i][j]+" "+"\t\t");
               
                }  
                    System.out.println();
                    
            }  
        
        
    }  */
        
        
      
        
        
}  // end of class


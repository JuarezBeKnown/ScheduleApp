/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduleapp;
import java.util.Scanner;

/**
 *
 * @author Juarez
 */
public class ScheduleApp {
    
    public static void main(String[] args) {
        // local app variables
        String name;
        int ssn;
        
        // Clinic is Open 5 Days A week
        String[] workDays = { "Monday", "Tuesday" ,"Wendsday","Thursday","Friday"};
 
        // Clinic Has 5 Doctors On Staff
        Doctor doctor1 = new Doctor("Dr Juarez", "Tx423",workDays);
        Doctor doctor2 = new Doctor("Dr Hanley", "Tx455",workDays);

        
        // Clinic has 10 Patients On File
        Patient patient1 = new Patient("Patrick Juarez",637031267,"210-438-7231",
                "1702 Farley","Harlingen","Tx","7550","Blue Cross and Blue Shield","01/2018");
        Patient patient2 = new Patient("Chris Peterson",637032211,"210-432-7000",
                "2000 Saint Bernard","Brownsville","Tx","7550","FirstCare","02/2018");
        Patient patient3 = new Patient("Mona Peterson",637038888,"210-324-5432",
                "4893 N Hwy 80","Nixon","Tx","78140","Blue Cross and Blue Shield","03/2017");
        Patient patient4 = new Patient("Pete Conor",637034321,"956-438-7231",
                "1800 Broadway","San Antonio","Tx","78249","Blue Cross and Blue Shield","05/2018");
        Patient patient5 = new Patient("Patricia Rodriguez",637031234,"956-438-7399",
                "1801 S France","Harlingen","Tx","78550","n/a","n/a");
        Patient patient6 = new Patient("Daniel Palm",637039876,"956-324-2311",
                "1804 Water Leaf","Harlingen","Tx","78551","Blue Cross and Blue Shield","05/2018");
        Patient patient7 = new Patient("Michelle Palm",637036789,"956-324-4567",
                "1908 16th Street","Harlingen","Tx","78553","FirstCare","05/2018");
        Patient patient8 = new Patient("Rodger Puentes",637034567,"956-456-8766",
                "1910 El Paso Dr","Harlingen","Tx","78550","Blue Cross and Blue Shield","02/2018");
        Patient patient9 = new Patient("Victoria Puentes",6377654,"210-202-7231",
                "2104 E Hail","Brownsville","Tx","78558","Oscar Insurance","02/2018");
        Patient patient10 = new Patient("Victoria Puentes",637031029,"210-567-1254",
                "421 Pierre Rd","San Benito","Tx","78456","Oscar Insurance","02/2018");
        
        // Patient list distrubted amoungst the two doctors 
        Patient [] drJuarezPatients = {patient1,patient2,patient3,patient4,patient5};
        Patient [] drHanley2Patients = {patient6,patient7,patient8,patient9,patient10};
        
        // add Patient List to Doctor -> Doctor class
        // Docto is now the primary physician
        doctor1.addPatientList(drJuarezPatients);
        doctor2.addPatientList(drHanley2Patients);
              
        // Now make two Schedule Objects for Monday Morning Manually
        Schedule s1 = new Schedule(doctor1,patient1,"Monday",800,900);
        Schedule s2 = new Schedule(doctor1,patient2,"Monday",900,1000);
        Schedule s3 = new Schedule(doctor1,patient3,"Monday",1000,1100);
        
        // Now Schedule Objects 4-5 to Monday Evening Manually
        Schedule s4 = new Schedule(doctor1,patient4,"Monday",1300,1400);
        Schedule s5 = new Schedule(doctor1,patient4,"Monday",1300,1400);
        

        doctor1.addSchduleToArray(s1);
        doctor1.addSchduleToArray(s2);
        doctor1.addSchduleToArray(s3);
        doctor1.addSchduleToArray(s4);
        doctor1.addSchduleToArray(s5);
        
        doctor1.printCalendar();

        
        
       
    }
    
}

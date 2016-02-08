package lukelunix.ntnumple.contact.studentservice;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Created by Luka on 26.11.2015.
 */
public class StudentserviceData {

    public static TreeMap<String, List<String>> getData() {

        //Declare local variables for StudentserviceData
        TreeMap<String, List<String>> studentserviceData = new TreeMap<String, List<String>>();
        List<String> studentserviceDragvoll = new ArrayList<String>();
        List<String> studentserviceGloshaugen = new ArrayList<String>();

        //Studentservice Dragvoll
        studentserviceDragvoll.add("Opening hours: Mon-Fri 08.30–15.00");
        studentserviceDragvoll.add("Closing hours: Mon-Fri 11.45-12.15");
        studentserviceDragvoll.add("Phone: 73 59 67 00");
        studentserviceDragvoll.add("E-mail: studentservice@adm.ntnu.no");
        studentserviceDragvoll.add("Visiting address:\n"+
                "Edvard Bulls vei 1\n" +
                "Bygg 1, level 3");


        //Studentservice Gløshaugen
        studentserviceGloshaugen.add("Opening hours: Mon-Fri 08.30–15.00");
        studentserviceGloshaugen.add("Closing hours: Mon-Fri 11.15-11.45");
        studentserviceGloshaugen.add("Phone: 73 59 52 00");
        studentserviceGloshaugen.add("E-mail: studentservice@adm.ntnu.no");
        studentserviceGloshaugen.add("Visiting address:\n" +
                "Gamle Kjemi\n" +
                "Kolbjørn Hejes vei 4\n");


        //Put Studentservice Category together with Arraylist of studentservice_info
        studentserviceData.put("Studentservice at Dragvoll", studentserviceDragvoll);
        studentserviceData.put("Studentservice at Gløshaugen", studentserviceGloshaugen);


        //Return Treemap with Studentservice_Categories and Studentservice_Info
        return studentserviceData;
    }
}

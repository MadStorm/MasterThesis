package lukelunix.ntnumple.contact.orakel;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Created by Luka on 26.11.2015.
 */
public class OrakelData {

    public static TreeMap<String, List<String>> getData(){

        //Declare local variables for OrakelData
        TreeMap<String, List<String>>  orakelData = new TreeMap<String, List<String>>();
        List<String> orakelDragvoll = new ArrayList<String>();
        List<String> orakelGloshaugen = new ArrayList<String>();
        List<String> orakelOya = new ArrayList<String>();

        //Orakel Dragvoll
        orakelDragvoll.add("Opening hours: Mon-Fri 08:00-16:30");
        orakelDragvoll.add("Phone: 73 59 18 10 (available 08:00-16:30)");
        orakelDragvoll.add("E-mail: orakel@ntnu.no");
        orakelDragvoll.add("Office: Bygning 8, nivå 5 (Library)");


        //Orakel Gløshaugen
        orakelGloshaugen.add("Opening hours: Mon-Fri 10:15 - 16:00");
        orakelGloshaugen.add("Phone: 73 59 15 00 (available 08:00-16:00)");
        orakelGloshaugen.add("E-mail: orakel@ntnu.no");
        orakelGloshaugen.add("Office: Realfagbiblioteket, realfagbygget (Library)");


        //Orakel Øya
        orakelOya.add("Opening hours: Mon-Fri 10:15 - 14:00");
        orakelOya.add("E-mail: orakel@ntnu.no");
        orakelOya.add("Office: Øya, Kunnskapssenteret, 2. floor");


        //Put Orakel Category together with Arraylist of orakel_info
        orakelData.put("Orakel at Dragvoll", orakelDragvoll);
        orakelData.put("Orakel at Gløshaugen", orakelGloshaugen);
        orakelData.put("Orakel at Øya", orakelOya);


        //Return Treemap with Orakel_Categories and Orakel_Info
        return orakelData;

    }
}
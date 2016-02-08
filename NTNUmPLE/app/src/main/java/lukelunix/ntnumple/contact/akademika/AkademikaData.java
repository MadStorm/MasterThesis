package lukelunix.ntnumple.contact.akademika;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Created by Luka on 27.11.2015.
 */
public class AkademikaData {

    public static TreeMap<String, List<String>> getData() {

        //Declare local variables for AkademikaData
        TreeMap<String, List<String>> akademikaData = new TreeMap<String, List<String>>();
        List<String> akademikaDragvoll = new ArrayList<String>();
        List<String> akademikaGloshaugen = new ArrayList<String>();
        List<String> akademikaKalvskinnet = new ArrayList<String>();


        //Akademika Dragvoll
        akademikaDragvoll.add("Disciplines:\n"+
                "Humanities\n" +
                "Social sciences\n"+
                "Sports\n" +
                "Rural Research\n" +
                "Child Research");
        akademikaDragvoll.add("Opening hours: Mon-Fri 09.00-16.00\n"+
                "Sat: Closed");
        akademikaDragvoll.add("Phone: 73 59 84 50");
        akademikaDragvoll.add("E-mail: dragvoll@akademika.no");
        akademikaDragvoll.add("Visiting address:\n"+
                "Universitetssenteret Dragvoll \n" +
                "Bygg 7, Nivå 3");


        //Akademika Gløshaugen
        akademikaGloshaugen.add("Disciplines:\n"+
                "Civil Engineering,\n"+
                "Architecture\n" +
                "Natural Sciences\n"+
                "Economics");
        akademikaGloshaugen.add("Opening hours: Mon-Fri 09.00-16.00\n" +
                "Sat: Closed");
        akademikaGloshaugen.add("Phone: 73 59 32 18 / 73 59 32 27");
        akademikaGloshaugen.add("E-mail: gloshaugen@akademika.no");
        akademikaGloshaugen.add("Visiting address:\n"+
                "Alfred getz vei 3\n" +
                "7034 Trondheim");

        //Akademika Kalvskinnet
        akademikaKalvskinnet.add("Disciplines:\n"+
                "Engineering\n" +
                "Technology\n" +
                "Informatics and Computing\n"+
                "Archaeology");
        akademikaKalvskinnet.add("Opening hours: Mon-Fri 08.30-15.30\n"+
                "Sat: Closed");
        akademikaKalvskinnet.add("Phone: 98 25 53 00");
        akademikaKalvskinnet.add("E-mail: kalvskinnet@akademika.no");
        akademikaKalvskinnet.add("Visiting address:\n"+
                "Gunnerus gt. 1\n" +
                "7012 Trondheim");


        //Put Studentservice Category together with Arraylist of studentservice_info
        akademikaData.put("Akademika Dragvoll", akademikaDragvoll);
        akademikaData.put("Akademika Gløshaugen", akademikaGloshaugen);
        akademikaData.put("Akademika Kalvskinnet", akademikaKalvskinnet);


        //Return Treemap with Akademika_Categories and Akademika_Info
        return akademikaData;
    }


}

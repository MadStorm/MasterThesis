package lukelunix.ntnumple.contact.libraries;


import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Created by Luka on 25.11.2015.
 */
public class LibrariesData {

    public static TreeMap<String, List<String>> getData(){

        //Declare local variables for LibrariesData
        TreeMap<String, List<String>>  librariesData = new TreeMap<String, List<String>>();
        List<String> architectureLibrary = new ArrayList<String>();
        List<String> doraLibrary = new ArrayList<String>();
        List<String> dragvollLibrary = new ArrayList<String>();
        List<String> fineArtLibrary = new ArrayList<String>();
        List<String> gunnerusLibrary = new ArrayList<String>();
        List<String> marineTechnologyLibrary = new ArrayList<String>();
        List<String> medicineLibrary = new ArrayList<String>();
        List<String> moholtLibrary = new ArrayList<String>();
        List<String> musicLibrary = new ArrayList<String>();
        List<String> naturalScienceLibrary = new ArrayList<String>();
        List<String> technologyLibrary = new ArrayList<String>();

        //Architecture and Civil Engineering Library
        architectureLibrary.add("Mon-Thu: 08:30-21:00");
        architectureLibrary.add("Fri: 08:30-19:00 ");
        architectureLibrary.add("Sat: 09:00-17:00");
        architectureLibrary.add("Visiting address: Alfred Getz' veg 3");

        //Dora Library
        doraLibrary.add("Mon-Thu: 09:00-15:00 (Thu 18:00)");
        doraLibrary.add("Fri: 09:00-15:00");
        doraLibrary.add("Sat: Closed");
        doraLibrary.add("Visiting address: Maskinistgt. 1");

        //Dragvoll Library
        dragvollLibrary.add("Mon-Thu: 08:00-22:00");
        dragvollLibrary.add("Fri: 08:00-19:00");
        dragvollLibrary.add("Sat: 10:00-18:00");
        dragvollLibrary.add("Visiting address: Edvard Bulls veg 1");

        //Fine Art Library
        fineArtLibrary.add("Mon-Thu: 08:30-19:00");
        fineArtLibrary.add("Fri: 08:30-15:30");
        fineArtLibrary.add("Sat: Closed");
        fineArtLibrary.add("Visiting address: Innherredsvn. 7A, (6.etg)");

        //Gunnerus Library
        gunnerusLibrary.add("Mon-Thu: 08:30-19:00");
        gunnerusLibrary.add("Fri: 08:30-17:00");
        gunnerusLibrary.add("Sat: 10:00-15:00");
        gunnerusLibrary.add("Visiting address: Kalvskinnsgt. 1B");

        //Marine Technology Library
        marineTechnologyLibrary.add("Mon-Thu: 08:30-20:00");
        marineTechnologyLibrary.add("Fri: 08:30-20:00");
        marineTechnologyLibrary.add("Sat: Closed");
        marineTechnologyLibrary.add("Visiting address: Otto Nielsens vei 10");

        //Medicine and Health Library
        medicineLibrary.add("Mon-Thu: 08:30-20:00");
        medicineLibrary.add("Fri: 08:30-17:00");
        medicineLibrary.add("Sat: 10:00-15:00");
        medicineLibrary.add("Visiting address: Olav Kyrres gt. 10");

        //Moholt Library
        moholtLibrary.add("Mon-Thu: Open");
        moholtLibrary.add("Fri: Open");
        moholtLibrary.add("Sat: Open");
        moholtLibrary.add("Visiting address: Jonsvannsveien 82");

        //Music Library
        musicLibrary.add("Mon-Thu: 09:00-19:00");
        musicLibrary.add("Fri: 09:00-17:00");
        musicLibrary.add("Sat: Closed");
        musicLibrary.add("Visiting address: Kjøpmannsgt. 42");

        //Natural Science Library
        naturalScienceLibrary.add("Mon-Thu: 08:00-21:00");
        naturalScienceLibrary.add("Fri: 08:00-19:00");
        naturalScienceLibrary.add("Sat: 09:00-17:00");
        naturalScienceLibrary.add("Visiting address: Høgskoleringen 5");

        //Technology Library
        technologyLibrary.add("Mon-Thu: 08:00-21:00");
        technologyLibrary.add("Fri: 08:00-19:00");
        technologyLibrary.add("Sat: 09:00-17:00");
        technologyLibrary.add("Visiting address: Høgskoleringen 1");


        //Put Library Category together with Arraylist of library_info
        librariesData.put("Architecture and Civil Engineering Library", architectureLibrary);
        librariesData.put("Dora Library", doraLibrary);
        librariesData.put("Dragvoll Library", dragvollLibrary);
        librariesData.put("Fine Art Library", fineArtLibrary);
        librariesData.put("Gunnerus Library", gunnerusLibrary);
        librariesData.put("Marine Technology Library", marineTechnologyLibrary);
        librariesData.put("Medicine and Health Library", medicineLibrary);
        librariesData.put("Moholt Library", moholtLibrary);
        librariesData.put("Music Library", musicLibrary);
        librariesData.put("Natural Science Library", naturalScienceLibrary);
        librariesData.put("Technology Library", technologyLibrary);


        //Return Treemap with Library_Categories and Library_Info
        return librariesData;

    }

}
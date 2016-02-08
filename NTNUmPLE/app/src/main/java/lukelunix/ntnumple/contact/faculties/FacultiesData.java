package lukelunix.ntnumple.contact.faculties;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Created by Luka on 24.11.2015.
 */
public class FacultiesData {

    public static TreeMap<String, List<String>> getData(){

        //Declare local variables for FacultiesData
        TreeMap<String, List<String>>  facultiesData = new TreeMap<String, List<String>>();
        List<String> facultyOfArchitecture = new ArrayList<String>();
        List<String> facultyOfEngineeringScience = new ArrayList<String>();
        List<String> facultyOfHumanities = new ArrayList<String>();
        List<String> facultyOfNaturalSciences = new ArrayList<String>();
        List<String> facultyOfIME = new ArrayList<String>();
        List<String> facultyOfMedicine = new ArrayList<String>();
        List<String> facultyOfSocialSciences = new ArrayList<String>();

        //Faculty of Architecture
        facultyOfArchitecture.add("Phone: +47 73 55 02 75");
        facultyOfArchitecture.add("Fax: +47 73 59 50 94");
        facultyOfArchitecture.add("E-mail: fak-adm@ab.ntnu.no");
        facultyOfArchitecture.add("Visiting address:\n"+
                "Alfred Getz vei 3\n"+
                "Central Builidng 1,3. floor\n"+
                "Trondheim");
        facultyOfArchitecture.add("Postal address:\n"+
                "Alfred Getz vei 3\n"+
                "N-7491 Trondheim\n"+
                "Norway");

        //Faculty of Engineering
        facultyOfEngineeringScience.add("Office hours:\n"+
                "Mon-Fri 9.30 - 11.30 and\n"+
                "12.30 - 15.00");
        facultyOfEngineeringScience.add("Phone: (+47) 73 59 37 00");
        facultyOfEngineeringScience.add("E-mail: studier@ivt.ntnu.no");
        facultyOfEngineeringScience.add("Visiting address:\n"+
                "Geology building, 1st floor");
        facultyOfEngineeringScience.add("Postal address\n" +
                "Høgskoleringen 6, NTNU\n" +
                "Fakultet for ingeniørvitenskap og teknologi\n" +
                "7491 Trondheim\n"+
                "Norway");

        //Faculty of Humanities
        facultyOfHumanities.add("Opening hours:\n" +
                "Mon-Fri 08:00-15:45 (September-April) \n" +
                "Mon-Fri 08:00-15:00 (May-August)");
        facultyOfHumanities.add("Phone: +47 73 59 65 95");
        facultyOfHumanities.add("Fax: +47 73 59 10 30");
        facultyOfHumanities.add("E-mail: postmottak@hf.ntnu.no");
        facultyOfHumanities.add("Visiting address:\n" +
                "The University Centre at Dragvoll\n" +
                "Building 2, level 5");
        facultyOfHumanities.add("Postal Address:\n" +
                "NTNU\n" +
                "Faculty of Humanities\n" +
                "NO-7491 Trondheim\n" +
                "Norway");

        //Faculty of Natural Sciences
        facultyOfNaturalSciences.add("Phone: +47 73 59 41 97");
        facultyOfNaturalSciences.add("Fax: +47 73 59 14 10");
        facultyOfNaturalSciences.add("E-mail: postmottak@nt.ntnu.no");
        facultyOfNaturalSciences.add("Visiting address:\n"+
                "Høgskoleringen 5\n"+
                "Realfagbygget (Natural Science Building)\n"+
                "Blokk D, ground floor\n" +
                "Gløshaugen Campus, NTNU");
        facultyOfNaturalSciences.add("Postal address:\n" +
                "Faculty of Natural Sciences and Technology\n" +
                "Realfagbygget, NTNU\n" +
                "NO-7491 Trondheim, Norway");

        //Faculty of IME
        facultyOfIME.add("Opening hours\n" +
                "Office: 0800-1545\n" +
                "(1. May - 31. Aug: 0800-1500)\n" +
                "Student reception: 0800-1500");
        facultyOfIME.add("Phone: +47 73 59 42 02");
        facultyOfIME.add("Fax: +47 73 59 36 28");
        facultyOfIME.add("E-mail: studinfo@ime.ntnu.no");
        facultyOfIME.add("Visiting address:\n" +
                "Electrical Engineering A, 2nd Floor\n" +
                "O.S. Bragstads plass 2\n" +
                "Gløshaugen\n" +
                "7034 Trondheim");
        facultyOfIME.add("Postal address\n" +
                "Faculty of Information Technology, Mathematics and Electrical Engineering\n" +
                "NTNU\n" +
                "NO-7491 Trondheim\n"+
                "Norway");

        //Faculty of Medicine
        facultyOfMedicine.add("Opening hours:\n"+
                "0800-1545 (May-August 0800-1500)");
        facultyOfMedicine.add("Phone +47 72 82 07 00");
        facultyOfMedicine.add("E-mail: dmf-post@medisin.ntnu.no");
        facultyOfMedicine.add("Visiting address:\n" +
                "Medisinsk teknisk forskningssenter (MTFS)\n" +
                "Det medisinske fakultet\n" +
                "Olav Kyrres g. 9");
        facultyOfMedicine.add("Postal address:\n" +
                "Postboks 8905\n" +
                "NTNU, Det medisinske fakultet\n" +
                "7491 Trondheim\n" +
                "Norway");


        //Faculty of Social Sciences
        facultyOfSocialSciences.add("Phone: + 47 73 59 19 00");
        facultyOfSocialSciences.add("E-mail: postmottak@svt.ntnu.no");
        facultyOfSocialSciences.add("Visiting address:\n"+
                "NTNU, Faculty of Social Sciences and Technology Management\n" +
                "Loholt Allè 85, Paviljong A\n" +
                "N - 7048 Trondheim");
        facultyOfSocialSciences.add("Postal address:\n" +
                "NTNU, Faculty of Social Sciences and Technology Management\n" +
                "Dragvoll\n" +
                "7491 Trondheim\n"+
                "Norway");


        //Put Faculty Category together with Arraylist of faculty_info
        facultiesData.put("Faculty of Architecture and Fine Art", facultyOfArchitecture);
        facultiesData.put("Faculty of Engineering Science and Technology", facultyOfEngineeringScience);
        facultiesData.put("Faculty of Humanities", facultyOfHumanities);
        facultiesData.put("Faculty of Natural Sciences and Technology", facultyOfNaturalSciences);
        facultiesData.put("Faculty of Information Technology, Mathematics and Electrical Engineering", facultyOfIME);
        facultiesData.put("Faculty of Medicine", facultyOfMedicine);
        facultiesData.put("Faculty of Social Sciences and Technology Management", facultyOfSocialSciences);

        //Return Treemap with Faculty_Categories and Faculty_Info
        return facultiesData;

    }



}

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

        // Former faculties of Sør-Trønderlag University College
        List<String> facultyOfHealthAndSocialSciences = new ArrayList<String>();
        List<String> facultyOfTeacherAndInterpreterEducation = new ArrayList<String>();
        List<String> facultyOfTechnology = new ArrayList<String>();
        List<String> trondheimBusinessSchool= new ArrayList<String>();


        //Faculty of Architecture
        facultyOfArchitecture.add("Phone: +47 73 55 02 75");
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
        facultyOfEngineeringScience.add("Phone: +47 73 59 37 00");
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
                "Faculty of Medicine,\n" +
                "Olav Kyrres g. 9");
        facultyOfMedicine.add("Postal address:\n" +
                "Postboks 8905\n" +
                "NTNU, Faculty of Medicine,\n" +
                "7491 Trondheim\n" +
                "Norway");


        //Faculty of Social Sciences
        facultyOfSocialSciences.add("Phone: + 47 73 59 19 00");
        facultyOfSocialSciences.add("E-mail: postmottak@svt.ntnu.no");
        facultyOfSocialSciences.add("Visiting address:\n"+
                "NTNU, Faculty of Social Sciences and Technology Management\n" +
                "Loholt Allè 85, Paviljong A");
        facultyOfSocialSciences.add("Postal address:\n" +
                "NTNU, Faculty of Social Sciences and Technology Management\n" +
                "Dragvoll\n"+
                "Loholt Allè 85, Paviljong A"+
                "7048 Trondheim\n"+
                "Norway");


        //Sør-Trønderlag University College

        //Faculty of Health and Social Sciences
        facultyOfHealthAndSocialSciences.add("Phone: + 47 73 41 22 83 and "+"\n"
                +"+ 47 73 59 41 00");
        facultyOfHealthAndSocialSciences.add("E-mail: studier@fhs.ntnu.no");

        //Faculty of Teacher and Interpreter Education
        facultyOfTeacherAndInterpreterEducation.add("Opening hours:\n"
                + "08.00-15.00\n"
                + "Wed closed 09.30-11.00");
        facultyOfTeacherAndInterpreterEducation.add("Phone: + 47 73 55 98 50");
        facultyOfTeacherAndInterpreterEducation.add("E-mail: postmottak@flt.ntnu.no");
        facultyOfTeacherAndInterpreterEducation.add("Visiting address:\n"
                +"Rotvoll Campus,\n"
                +"Rotvoll allé 1,\n"
                +"7053 Ranheim");
        facultyOfTeacherAndInterpreterEducation.add("Postal address:\n"
                + "Norwegian University of Science and Technology, NTNU\n"
                + "Faculty of Teacher and Interpreter Education\n"
                + "Postboks 8900\n"
                + "NO-7491 Trondheim\n"
                + "Norway");

        //Faculty of Technology
        facultyOfTechnology.add("Opening hours:\n"
                +"Mon-Thurs 08.00-15.30\n"
                +"Fri 08.00-11.30 and 12.00-15.30");
        facultyOfTechnology.add("Phone: +47 73 55 94 50");
        facultyOfTechnology.add("E-mail: studier@ft.ntnu.no");
        facultyOfTechnology.add("Visiting address:\n"
            +"\"Brygghuset\", E. C. Dahls gt. 2");
        facultyOfTechnology.add("Postal address:\n"
                +"NTNU, Faculty of Technology\n"
                +"NO-7491 Trondheim\n"
                +"Norway");

        //Trondheim Business School
        trondheimBusinessSchool.add("Opening hours:\n"
                +"Mon-Thurs 08.00-15.00\n"
                +"Fri 08.00-12.00");
        trondheimBusinessSchool.add("Phone: +47 73 55 99 50");
        trondheimBusinessSchool.add("E-mail: postmottak@hhit.ntnu.no");
        trondheimBusinessSchool.add("Visiting address:\n"
                +"Trondheim Business School\n"
                +"Klæbuveien 72\n"
                +"Trondheim");
        trondheimBusinessSchool.add("Postal address:\n"
                +"NTNU, Trondheim Business School\n"
                +"NO-7491 Trondheim\n"
                +"Norway");


        //Put Faculty Category together with Arraylist of faculty_info
        facultiesData.put("Faculty of Architecture and Fine Art", facultyOfArchitecture);
        facultiesData.put("Faculty of Engineering Science and Technology", facultyOfEngineeringScience);
        facultiesData.put("Faculty of Humanities", facultyOfHumanities);
        facultiesData.put("Faculty of Natural Sciences and Technology", facultyOfNaturalSciences);
        facultiesData.put("Faculty of Information Technology, Mathematics and Electrical Engineering", facultyOfIME);
        facultiesData.put("Faculty of Medicine", facultyOfMedicine);
        facultiesData.put("Faculty of Social Sciences and Technology Management", facultyOfSocialSciences);
        facultiesData.put("Faculty of Health and Social Sciences", facultyOfHealthAndSocialSciences);
        facultiesData.put("Faculty of Teacher and Interpreter Education", facultyOfTeacherAndInterpreterEducation);
        facultiesData.put("Faculty of Technology", facultyOfTechnology);
        facultiesData.put("Trondheim Business School", trondheimBusinessSchool);



        //Return Treemap with Faculty_Categories and Faculty_Info
        return facultiesData;

    }



}

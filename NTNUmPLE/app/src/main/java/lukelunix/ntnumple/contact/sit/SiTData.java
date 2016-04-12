package lukelunix.ntnumple.contact.sit;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Created by Luka on 27.11.2015.
 */
public class SiTData {

    public static TreeMap<String, List<String>> getData() {

        //Declare local variables for SiTData
        TreeMap<String, List<String>> sitData = new TreeMap<String, List<String>>();

        //SiT Cantines
        List<String> sitCantineRealfag = new ArrayList<String>();
        List<String> sitCantineDragvoll = new ArrayList<String>();
        List<String> sitCantineElektro = new ArrayList<String>();
        List<String> sitCantineHangaren = new ArrayList<String>();
        List<String> sitCantineKjelhuset = new ArrayList<String>();
        List<String> sitCantineMoholt = new ArrayList<String>();
        List<String> sitCantineTyholt = new ArrayList<String>();
        List<String> sitCantineOya = new ArrayList<String>();

        //SiT Cafes
        List<String> sitCafeRealfag = new ArrayList<String>();
        List<String> sitCafeDragvoll = new ArrayList<String>();
        List<String> sitCafeStripa = new ArrayList<String>();

        //SiT Food Stores
        List<String> sitFoodStoreDragvoll = new ArrayList<String>();
        List<String> sitFoodStoreGloshaugen = new ArrayList<String>();

        //SiT Housing
        List<String> sitHousing = new ArrayList<String>();

        //SiT Nurse
        List<String> sitNurseDragvoll = new ArrayList<String>();
        List<String> sitNurseGloshaugen = new ArrayList<String>();

        //SiT Reception
        List<String> sitReception = new ArrayList<String>();

        //SiT Sports
        List<String> sitGymGloshaugen = new ArrayList<String>();
        List<String> sitGymPortalen = new ArrayList<String>();
        List<String> sitGymDragvoll = new ArrayList<String>();

        //=========================================================================================//
        //Cantines
        //=========================================================================================//

        //SiT Cantine Dragvoll
        sitCantineDragvoll.add("Opening hours: Mon-Thu 10.00–16.30\n"+
                "Fri 10.00–15.00");
        sitCantineDragvoll.add("Phone: 73 55 12 52");
        sitCantineDragvoll.add("E-mail: sit.kafe.dragvoll@sit.no");
        sitCantineDragvoll.add("Visiting address:\n" +
                "Bulding 5, Level 4 at Dragvoll");

        //SiT Cantine Elektro
        sitCantineElektro.add("Opening hours: Mon-Fri 08.15-15.15");
        sitCantineElektro.add("Phone: 73 59 68 34");
        sitCantineElektro.add("E-mail: sit.kafe.elektro@sit.no");
        sitCantineElektro.add("Visiting address:\n" +
                "Elektrobygget at Gløshaugen");

        //SiT Cantine Hangaren
        sitCantineHangaren.add("Opening hours: Mon-Thu 11.00–17.30\n"+
                "Fri 11.00–15.30");
        sitCantineHangaren.add("Phone: 90 91 65 52");
        sitCantineHangaren.add("E-mail: sit.kafe.hangaren@sit.no");
        sitCantineHangaren.add("Visiting address:\n" +
                "Gløshaugen, at the end of Stripa, south of Sentralbygg 1");

        //SiT Cantine Kjelhuset
        sitCantineKjelhuset.add("Opening hours: Mon-Thu 08.30-16.30\n"+
                "Fri 08.30-15.00");
        sitCantineKjelhuset.add("Phone: 73 59 79 93");
        sitCantineKjelhuset.add("Visiting address:\n" +
                "Inside of Kjelhuset at Gløshaugen");

        //SiT Cantine Moholt
        sitCantineMoholt.add("Opening hours: Mon-Thu 08.00-15.15\n"+
                "Fri 08.00-14.00");
        sitCantineMoholt.add("Phone: 73 94 59 23");
        sitCantineMoholt.add("E-mail: sit.kafe.moholt@sit.no");
        sitCantineMoholt.add("Visiting address:\n" +
                "Jonsvannsveien 82, close to Moholt Studentby");

        //SiT Cantine Realfag
        sitCantineRealfag.add("Opening hours: Mon-Thu 10.00–17.30\n"+
                "Fri 10.00–14.00");
        sitCantineRealfag.add("Phone: 73 55 12 52");
        sitCantineRealfag.add("Visiting address:\n"+
                "Realfagbygget at Gløshaugen");

        //SiT Cantine Tyholt
        sitCantineTyholt.add("Opening hours: Mon-Thu 09.00-16.00\n"+
                "Fri 09.00-15.00");
        sitCantineTyholt.add("Phone: 73 59 56 43");
        sitCantineTyholt.add("E-mail: sit.kafe.tyholt@sit.no");
        sitCantineTyholt.add("Visiting address:\n" +
                "At Marine Technology Centre at Tyholt");

        //SiT Cantine Øya
        sitCantineOya.add("Opening hours: Mon-Thu 08.00–16.00\n"+
                "Fri 08.00–14.00");
        sitCantineOya.add("Phone: 95 36 20 07");
        sitCantineOya.add("E-mail: sit.kafe.oya@sit.no");
        sitCantineOya.add("Visiting address:\n" +
                "Mauritz Hansens vei 2, take right in the roundabout before St Olav's Hospital and then take the door to the right");

        //=========================================================================================//
        //Cafe
        //=========================================================================================//

        //SiT Cafe Dragvoll
        sitCafeDragvoll.add("Opening hours: Mon-Thu 08.00–18.00\n"+
                "Fri  08.00-16.00");
        sitCafeDragvoll.add("Phone: 91 00 25 48");
        sitCafeDragvoll.add("E-mail: sit.kafe.tyholt@sit.no");
        sitCafeDragvoll.add("Visiting address:\n" +
                "Building 5, Level 3");

        //SiT Cafe Realfag
        sitCafeRealfag.add("Opening hours: Mon-Fri 08.00–16.00");
        sitCafeRealfag.add("Phone: 73 55 12 54");
        sitCafeRealfag.add("E-mail: cafe-sito.realfag@sit.no");
        sitCafeRealfag.add("Visiting address:\n" +
                "Realfagbygget at Gløshaugen");

        //SiT Cafe Stripa
        sitCafeStripa.add("Opening hours: Mon-Fri 08.00–15.30");
        sitCafeStripa.add("Phone: 91 00 32 15");
        sitCafeStripa.add("E-mail: cafe-sito.stripa@sit.no");
        sitCafeStripa.add("Visiting address:\n" +
                "Gløshaugen, at the end of Stripa, south of Sentralbygg 1");

        //=========================================================================================//
        //Food Store
        //=========================================================================================//

        //SiT Food Store Dragvoll
        sitFoodStoreDragvoll.add("Opening hours: Mon-Thu 08.00–17.00\n"+
                "Fri 08.00–16.00");
        sitFoodStoreDragvoll.add("Phone: 73 59 84 48");
        sitFoodStoreDragvoll.add("E-mail: sit.storkiosk.dragvoll@sit.no");
        sitFoodStoreDragvoll.add("Visiting address:\n" +
                "Building 5, Level 3");

        //SiT Food Store Gløshaugen
        sitFoodStoreGloshaugen.add("Opening hours: Mon-Thu 08.00–17.00\n" +
                "Fri 08.00–16.00");
        sitFoodStoreGloshaugen.add("Phone: 73 59 32 38/34");
        sitFoodStoreGloshaugen.add("E-mail: sit.storkiosk.gloshaugen@sit.no");
        sitFoodStoreGloshaugen.add("Visiting address:\n" +
                "Sentralbygg 1, middle of Stripa at Gløshaugen");

        //=========================================================================================//
        //SiT Nurse
        //=========================================================================================//

        //SiT Nurse Dragvoll
        sitNurseDragvoll.add("Opening hours: Mon,Thu and Fri 10.00–15.00");
        sitNurseDragvoll.add("Phone: 99 24 78 38");
        sitNurseDragvoll.add("E-mail: renate.johansen@sit.no");
        sitNurseDragvoll.add("Visiting address:\n" +
                "Room number 2334 at Dragvoll");

        //SiT Nurse Gløshaugen
        sitNurseGloshaugen.add("Opening hours: Mon and Wed 11.00–15.00");
        sitNurseGloshaugen.add("Phone: 91 31 15 97");
        sitNurseGloshaugen.add("E-mail: kristin.fredriksen@sit.no");
        sitNurseGloshaugen.add("Visiting address:\n" +
                "Gamle Kjemi, second floor");

        //=========================================================================================//
        //SiT Housing
        //=========================================================================================//

        //SiT Food Store Dragvoll
        sitHousing.add("Opening hours: Mon,Tue,Thu and Fri 08.00–15.00\n"+
                "Wed 09.30–16.00");
        sitHousing.add("Phone: 73 55 16 00");
        sitHousing.add("Phone Alarm central for tenants: 02347");
        sitHousing.add("E-mail Reception: bolig@sit.no\n"+
                "E-mail Cleaning department: boligrenhold@sit.no");
        sitHousing.add("Office address:\n" +
                "Frode Rinnans veg 1\n" +
                "7050 Trondheim");
        sitHousing.add("Mail address:\n" +
                "Postboks 2460 Sluppen\n" +
                "7005 Trondheim");
        sitHousing.add("Bank information:\n" +
                "Our name:\tSiT Bolig\n" +
                "Our address:\tPostboks 2460 Sluppen, 7005 Trondheim, Norway\n" +
                "Name of bank:\tSparebank 1 Midt-Norge\n" +
                "Address of bank:\t7467 Trondheim, Norway\n" +
                "Swift/BIC code:\tSPTRNO22 (for all accounts)\n" +
                "IBAN no:\tNO 89 42004151326 (rent and deposit)");


        //=========================================================================================//
        //SiT Reception
        //=========================================================================================//

        //Sit Reception
        sitReception.add("Opening hours: Mon-Fri 08.30–15.00");
        sitReception.add("Phone Switchboard: 73 59 32 50");
        sitReception.add("E-mail Switchboard: sit@sit.no");
        sitReception.add("Office address SiT administration:\n" +
                "Kolbjørn Hejesv. 4\n"+
                "(Gamle Kjemi, Stripa at Gløshaugen)");
        sitReception.add("Mail address:\n" +
                "Postboks 2460, Sluppen\n" +
                "7005 Trondheim");

        //=========================================================================================//
        //SiT Sports
        //=========================================================================================//

        //SiT Gym Dragvoll
        sitGymDragvoll.add("Opening hours: Mon-Fri 07.30–22.00\n" +
                "Sat 10.00-20.00\n" +
                "Sun 10.00-22.00");
        sitGymDragvoll.add("Phone: 73 55 06 31");
        sitGymDragvoll.add("E-mail: idrett@sit.no");
        sitGymDragvoll.add("Visiting address: Loholt allè 81");


        //SiT Gym Gløshaugen
        sitGymGloshaugen.add("Opening hours: Mon, Wed 06.30–23.00\n" +
                "Tue, Thurs 07.30-23.00\n" +
                "Sat 10.00-20.00\n" +
                "Sun 10.00-22.00");
        sitGymGloshaugen.add("Phone: 73 59 54 60");
        sitGymGloshaugen.add("E-mail: idrett@sit.no");
        sitGymGloshaugen.add("Visiting address: Christian Frederiks gate 20");

        //SiT Gym Portalen
        sitGymPortalen.add("Opening hours: Mon, Wed 07.30–22.00\n" +
                "Tue, Thurs 06.30-22.00\n" +
                "Fri 07.30-21.00\n" +
                "Sat 10.00-18.00\n" +
                "Sun 10.00-21.00");
        sitGymPortalen.add("Phone: 95 30 98 18");
        sitGymPortalen.add("E-mail: idrett@sit.no");
        sitGymPortalen.add("Visiting address: Dyre Halses gate 1");


        //Put SiT Category together with Arraylist of sit_info
        //Cantine
        sitData.put("SiT Cantine Dragvoll", sitCantineDragvoll);
        sitData.put("SiT Cantine Elektro", sitCantineElektro);
        sitData.put("SiT Cantine Hangaren", sitCantineHangaren);
        sitData.put("SiT Cantine Kjelhuset", sitCantineKjelhuset);
        sitData.put("SiT Cantine Moholt", sitCantineMoholt);
        sitData.put("SiT Cantine Realfag", sitCantineRealfag);
        sitData.put("SiT Cantine Tyholt", sitCantineTyholt);
        sitData.put("SiT Cantine Øya", sitCantineOya);

        //Cafe
        sitData.put("Cafe-sito Dragvoll", sitCafeDragvoll);
        sitData.put("Cafe-sito Realfag", sitCafeRealfag);
        sitData.put("Cafe-sito Stripa", sitCafeStripa);

        //Food Store
        sitData.put("SiT Food Store Dragvoll", sitFoodStoreDragvoll);
        sitData.put("SiT Food Store Gløshaugen", sitFoodStoreGloshaugen);

        //Nurse
        sitData.put("SiT Nurse Dragvoll", sitNurseDragvoll);
        sitData.put("SiT Nurse Gløshaugen", sitNurseGloshaugen);

        //Housing
        sitData.put("SiT Housing", sitHousing);

        //Reception
        sitData.put("SiT Reception", sitReception);

        //Sports
        sitData.put("SiT Gym Dragvoll", sitGymDragvoll);
        sitData.put("SiT Gym Gløshaugen", sitGymGloshaugen);
        sitData.put("SiT Gym Portalen", sitGymPortalen);



        //Return Treemap with Akademika_Categories and Akademika_Info
        return sitData;
    }


}

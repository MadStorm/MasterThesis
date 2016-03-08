package lukelunix.ntnumple.coursehelp.faqaboutcourses;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Created by Luka on 01.03.2016.
 */
public class FAQdata {

    public static TreeMap<String, List<String>> getCategoryData() {

        //Declare local variables for FAQdata
        TreeMap<String, List<String>> faqdatacat = new TreeMap<String, List<String>>();
        List<String> aboutExams = new ArrayList<String>();
        List<String> aboutAdmission = new ArrayList<String>();

        aboutExams.add("");
        aboutAdmission.add("");

        /*
        aboutExams.add("");
        aboutExams.add("");
        aboutExams.add("");
        aboutExams.add("");
        aboutExams.add("");
        aboutExams.add("");
        aboutExams.add("");
        aboutExams.add("");
        aboutExams.add("");
        aboutExams.add("");

        aboutAdmission.add("");
        aboutAdmission.add("");
        aboutAdmission.add("");
        aboutAdmission.add("");
        aboutAdmission.add("");
        aboutAdmission.add("");
        aboutAdmission.add("");
        aboutAdmission.add("");*/
/*
        aboutExams.add("I forgot to register for the exam. What do I do?");
        aboutExams.add("Is there a postponed exam?");
        aboutExams.add("I was ill the day of the examination; can I sit for the examination on another day?");
        aboutExams.add("How do I cancel my exam?");
        aboutExams.add("What are the examination dates?");
        aboutExams.add("How do I register for my exam?");
        aboutExams.add("I want to improve my grade, how can I register for the examination?");
        aboutExams.add("Can I sit for the examination without attending classes?");
        aboutExams.add("Is it necessary to pay the semester fee for appearing a re-sit examination?");
        aboutExams.add("What is a placement test?");
        aboutExams.add("I want to re-sit for a Norwegian examination, but I cannot register in Studentweb");
        aboutExams.add("I have taken the written and the oral examinations, unfortunately I did not pass the written but only the oral examination. Do I have to retake both oral and written examinations?");
        aboutExams.add("How do I get my exam results?");

        aboutAdmission.add("How do I apply and what is the deadline?");
        aboutAdmission.add("When does the semester start/finish?");
        aboutAdmission.add("How do I get a timetable?");
        aboutAdmission.add("I did not get a place in a Norwegian for foreigners' course; are there any alternatives?");
        aboutAdmission.add("Do I have to pay the semester fee?");
        aboutAdmission.add("Do I need to be present at the first lecture?");
        aboutAdmission.add("What if I would like to change my group?");
        aboutAdmission.add("I need an individual certificate of my participation with numbers of hours for each Norwegian course I attended.");
*/
        faqdatacat.put("About Exams", aboutExams);
        faqdatacat.put("About Admission", aboutAdmission);

        //Return Treemap with FAQ_Categories and FAQ_Info
        return faqdatacat;


    }

    public static TreeMap<String, List<String>> getSubCategoryDataAboutExams() {

        //Declare local variables for FAQdatacat
        TreeMap<String, List<String>> faqdata = new TreeMap<String, List<String>>();
        List<String> forgotToRegister = new ArrayList<String>();
        List<String> postponedExams = new ArrayList<String>();
        List<String> illOnExamination = new ArrayList<String>();
        List<String> cancelExam = new ArrayList<String>();
        List<String> registerForExam = new ArrayList<String>();
        List<String> improveGrade = new ArrayList<String>();
        List<String> examinationWithoutClasses = new ArrayList<String>();
        List<String> semesterFeeReSitExam = new ArrayList<String>();
        List<String> placementTest = new ArrayList<String>();
        List<String> cannotRegisterStudweb = new ArrayList<String>();
        List<String> oralAndWrittenRetake = new ArrayList<String>();
        List<String> examResults = new ArrayList<String>();

        //Forgot to register for the exam
        forgotToRegister.add("The Examinations Office can make exceptions for those students who have a plausible reason for failing to meet the deadline.\n" +
                "\n" +
                "Your application should contain your full name, student number, which Norwegian course you attend and the reason why you did not respect the deadline. Application form.\n" +
                "\n" +
                "You must apply for an exemption by 15 October in the autumn semester and 15 March in the spring semester.\n" +
                "\n" +
                "For any further questions, please contact the Examinations Office at eksamen@adm.ntnu.no");

        //Is there a postponed exam
        postponedExams.add("All students who have examination collision get the opportunity to sit for a postponed examination.\n" +
                "\n" +
                "Please apply for the postponed examination here.\n" +
                "\n" +
                "Please observe that your application is only accepted in case of examination collision or illness.\n" +
                "\n" +
                "Application deadlines:\n" +
                "\n" +
                "- 15 November for the examination session in December.\n" +
                "- 30 April for the examination session in May.");

        //I was ill the day of the examination; can I sit for the examination on another day?
        illOnExamination.add("If you are not able to sit an examination due to illness, an application for approved absence has to be submitted to Norwegian for foreigner's Office by email at norskkurs@hf.ntnu.no\n" +
                "\n" +
                "A medical certificate should be included in the application.");

        //How do I cancel my exam?
        cancelExam.add("Cancellation of registration for examination (withdrawal) can be done on StudentWeb.\n" +
                "\n" +
                "Deadlines:\n" +
                "\n" +
                "- 15 November (exam in Autumn semester)\n" +
                "- 30 April (exam in Spring semester)");

        //How do I register for my exam?
        registerForExam.add("You have to register for the exams at StudentWeb\n" +
                "\n" +
                "Deadlines:\n" +
                "\n" +
                "- 1. February (Spring Semester)\n" +
                "- 15. September (Autumn Semester).");

        //I want to improve my grade, how can I register for the examination?
        improveGrade.add("Application deadlines\n" +
                        "\n" +
                        "1. February (Spring)\n" +
                        "15 September (Autumn).\n" +
                        "Please note that if you have passed an examination, you only have the right to re-take an examination once more in each course in order to improve your grade.\n" +
                        "\n" +
                        "If you are registered for an examination and you do not withdrawn the examination registration by the deadline decided by the Director of the Student and Academic Division (15 November / 30 April), this is regarded as one attempt. The highest grade obtained is the one that counts.\n" +
                        "\n" +
                        "When the grade for a course is based on two or more assessments or tests, all of these have to be re-taken.\n" +
                        "Deadlines for cancellation of registration for examination:\n" +
                        "\n" +
                        "- 15 November (exam in autumn semester)\n" +
                        "- 30 April (exam in spring semester)");


        //Is it necessary to pay the semester fee for appearing a re-sit examination?
        semesterFeeReSitExam.add("In Norway all students who wish to take exams in higher education at a public school, are required by law to pay a semester fee. It is not to be confused with a tuition fee, as public higher education is free, the money does not end up at the educational institution. Rather it goes to the organization in charge of maintaining student welfare (Studentsamskipnad). In Trondheim the Studentsamskipnad is called SiT. See for more information https://www.sit.no/en");

        //I want to re-sit for a Norwegian examination, but I cannot register in Studentweb.
        cannotRegisterStudweb.add("If you did not pass an examination, you can apply for a re-sit.\n" +
                "Application deadlines:\n" +
                "\n" +
                "1. February (Spring semester)\n" +
                "15 September (Autumn semester).\n" +
                "You do not need to pay for the examination, but you have to pay the semester fee even if you do not have the right to attend classes and to participate to the course.\n" +
                "\n" +
                "As you are not allowed to attend the classes, you will be registered on It'sLearning in a group to keep up with the subjects discussed during the classes. In this way we hope to help you getting enough information in order to pass the examination.");

        //I have taken wirtten and oral examinations. Did not pass one of them. Do I need to retake both?
        oralAndWrittenRetake.add("The examination consists of a written and an oral part. Separate grades are given for the written and the oral exam. In the combined grade the written exam counts 2/3 while the oral exam counts 1/3.\n" +
                "\n" +
                "Both the written and the oral exam need to be passed in the same semester in order to pass the exam.");

        //How do I get my exam results?
        examResults.add("For exam results, you can check Studentweb or contact the Student Services Section (Studentservice)\n" +
                "Phone: (+47) 73 59 67 00\n" +
                "\n" +
                "You can order an examination transcript at the Student Services Section studentservice@adm.ntnu.no");


        faqdata.put("I forgot to register for the exam. What do I do?", forgotToRegister);
        faqdata.put("Is there a postponed exam?", postponedExams);
        faqdata.put("I was ill the day of the examination; can I sit for the examination on another day?", illOnExamination);
        faqdata.put("How do I cancel my exam?", cancelExam);
        faqdata.put("How do I register for my exam?", registerForExam);
        faqdata.put("I want to improve my grade, how can I register for the examination?", improveGrade);
        faqdata.put("Is it necessary to pay the semester fee for appearing a re-sit examination?", semesterFeeReSitExam);
        faqdata.put("I want to re-sit for a Norwegian examination, but I cannot register in Studentweb.", cannotRegisterStudweb);
        faqdata.put("I have taken the written and the oral examinations, unfortunately I did not pass the written but only the oral examination. Do I have to retake both oral and written examinations?", oralAndWrittenRetake);
        faqdata.put("How do I get my exam results?", examResults);

        //Return Treemap with FAQ_Categories and FAQ_Info
        return faqdata;


    }

    public static TreeMap<String, List<String>> getSubCategoryDataAboutAdmission() {

        //Declare local variables for FAQdatacat
        TreeMap<String, List<String>> faqdata = new TreeMap<String, List<String>>();
        List<String> applyAndDeadline = new ArrayList<String>();
        List<String> semesterStartFinish = new ArrayList<String>();
        List<String> alternativesNorwegianCourse = new ArrayList<String>();
        List<String> paySemesterFee = new ArrayList<String>();
        List<String> presentFirstLecture = new ArrayList<String>();

        //How do I apply and what is the deadline?
        applyAndDeadline.add("Information about the application procedure is to find on the Admissions Office's website.\n" +
                "The application deadline is 01 June for the Autumn semester, and 01 November for the Spring semester. All questions regarding the application must be directed to The Admissions Office at:\n" +
                "E-mail opptak@adm.ntnu.no\n" +
                "Phone: (+47) 73 59 77 00");

        //When does the semester start/finish?
        semesterStartFinish.add("The courses start in January (spring semester) and August (autumn semester). Each course lasts one semester.\n" +
                "\n" +
                "Examinations take place in December (autumn semester) and in May (spring semester). Here you will find the exam dates.");

        //I did not get a place in a Norwegian for foreigners' course; are there any alternatives?
        alternativesNorwegianCourse.add("- Norwegian On the Web: an online course in entry level Norwegian, where all the teaching aids are integrated on one website, free of charge. NOW has been developed at NTNU, by experienced instructors.\n" +
                "- Folkeuniversitet\n" +
                "- Trondheim Adult Education Centre");

        //Do I have to pay the semester fee?
        paySemesterFee.add("All applicants, except exchange student, have to pay the semester fee of 510 NOK. In order to pay the fee on Studentweb you must be registered as a Norwegian Course student.");

        //Do I need to be present at the first lecture?
        presentFirstLecture.add("As stated in our attendance's rules: \"Please observe that attendance is compulsory for the first lecture. If you are not able to attend the first lecture, access to the course and exam will be denied. Your place will be given to a student on the waiting list.\"\n" +
                "\n" +
                "This means that you will lose your place if you do not attend the first lesson. You are welcome to apply again next semester.");


        faqdata.put("How do I apply and what is the deadline?", applyAndDeadline);
        faqdata.put("When does the semester start/finish?", semesterStartFinish);
        faqdata.put("I did not get a place in a Norwegian for foreigners' course; are there any alternatives?", alternativesNorwegianCourse);
        faqdata.put("Do I have to pay the semester fee?", paySemesterFee);
        faqdata.put("Do I need to be present at the first lecture?", presentFirstLecture);

        return faqdata;
    }

}

package utilities;

import pojos.Appointment;
import pojos.Registrant;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

public class WriteToTxt {
    public static void saveRegistrantData(String fileName, Registrant registrant) {
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(registrant.getSsn() + "," + registrant.getFirstName() + ","
                    + registrant.getLastName() + "," + registrant.getUsername() + ","
                    + registrant.getEmail() + "," + registrant.getPassword() + ",\n");
            writer.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void saveRegistrantApiData(String fileName, Registrant[] registrants) {
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            for (int i = 0; i < registrants.length; i++) {
                writer.append(registrants[i].getSsn() + "," + registrants[i].getFirstName() + ","
                        + registrants[i].getLastName() + "," + registrants[i].getLogin() + ","
                        + registrants[i].getEmail() + ","
                        + registrants[i].isActivated() + ","
                        + registrants[i].getCreatedDate() + ",\n");
            }
            writer.close();
            Registrant registrant1 = new Registrant();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//    public static void saveAppointmentData(String fileName, Appointment[] appointments) {
//        try {
//            FileWriter fileWriter = new FileWriter(fileName, true);
//            BufferedWriter writer = new BufferedWriter(fileWriter);
//
//            for (int i = 0; i < registrants.length; i++) {
//                writer.append(registrants[i].getSsn() + "," + registrants[i].getFirstName() + ","
//                        + registrants[i].getLastName() + "," + registrants[i].getLogin() + ","
//                        + registrants[i].getEmail() + ","
//                        + registrants[i].isActivated() + ","
//                        + registrants[i].getCreatedDate() + ",\n");
//            }
//
//            for (int i = 0; i < appointments.length; i++) {
//                if (appointments[i].getPatient() != null) {//to ignore the null ones
//                    writer.append(appointments[i].getPatient().getFirstName()+","
//                            +appointments[i].getPatient().getLastName());
//                    System.out.println("Name: ");
//                    System.out.println("LastName: " +"") ;
//                    if (appointments[i].getPatient().getUser() != null)//to ignore the null ones
//                        System.out.println("SSN: " + appointments[i].getPatient().getUser().getSsn());
//                }
//            }
//
//
//            writer.close();
//            Registrant registrant1 = new Registrant();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public static void saveDBUserData(String fileName, List<Object> actualData) {
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            for (int i = 0; i < actualData.size(); i++) {
                writer.append(actualData.get(i) +",\n");
            }
            writer.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

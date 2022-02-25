package utilities;

import pojos.Registrant;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadTxt {

    public static List<Registrant> returnAllUserData(String filename) {

        List<Registrant> all = new ArrayList<>();
        try
                (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = br.readLine();
            while (line != null) { // This checks if you are at the end of the file
                Registrant registrant = new Registrant();
                //String ssn=line.split(",")[0]; //Only gives ssn

                if (line.split(",")[0] != null)
                    registrant.setSsn(line.split(",")[0]);
                registrant.setFirstName(line.split(",")[1]);
                registrant.setLastName(line.split(",")[2]);
                registrant.setUsername(line.split(",")[3]);
                registrant.setEmail(line.split(",")[4]);
                if (line.split(",")[5] != null)
                    registrant.setActivated(Boolean.parseBoolean(line.split(",")[5]));
                if (line.split(",")[6] != null)
                    registrant.setCreatedDate(line.split(",")[6]);

                line = br.readLine();
                all.add(registrant);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return all;
    }

    public static List<String> returnUserSSNs(String filename) {

        List<String> ssnList = new ArrayList<>();
        try
                (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = br.readLine();
            while (line != null) { // This checks if you are at the end of the file

                //String ssn=line.split(",")[0]; //Only gives ssn

                if (line.split(",")[0] != null)
                    ssnList.add(line.split(",")[0]);
                line = br.readLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ssnList;
    }
}

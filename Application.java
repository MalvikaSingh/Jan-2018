package com.example.demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.MultiValueMap;

@SpringBootApplication
public class Application {
	   public static Map<String, ArrayList<UserDetails>> hmUser;
public static void main(String[] args) throws IOException {
	    hmUser = new HashMap<String, ArrayList<UserDetails>>();
///////////////////////////////////CORE////////////////////////////
	   String csvFile = "C:\\Users\\Administrator\\Desktop\\Docs\\January 2018\\NEPAL\\CORE_NEPAL.csv";
       BufferedReader br = null;
       String line = "";
       String cvsSplitBy = ",";

       //try {
    	   ArrayList<UserDetails> arraylist = new ArrayList<UserDetails>();
           br = new BufferedReader(new FileReader(csvFile));
           while ((line = br.readLine()) != null) {

               // use comma as separator
               String[] Details = line.split(cvsSplitBy);
               arraylist.add(new UserDetails(Details[0],Details[1],Details[2],Details[3],Details[4],Details[5]));

           }
   	      //hmUser.put("#########################################", null);
  	      hmUser.put("CORE.csv", arraylist);
  	      hmUser.put("---------------------------------", null);
///////////////////////////////////////ACE////////////////////
           String csvFile1 = "C:\\Users\\Administrator\\Desktop\\Docs\\January 2018\\NEPAL\\ACE_NEPAL.csv";
           BufferedReader br1 = null;
           String line1 = "";
           String cvsSplitBy1 = ",";

           //try {
        	   ArrayList<UserDetails> arraylist1 = new ArrayList<UserDetails>();
               br1 = new BufferedReader(new FileReader(csvFile1));
               while ((line1 = br1.readLine()) != null) {

                   // use comma as separator
                   String[] Details = line1.split(cvsSplitBy1);
                   arraylist1.add(new UserDetails(Details[0],Details[1],Details[2],Details[3],Details[4],Details[5]));

               }
       	      //hmUser.put("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@", null);
           hmUser.put("ACE.csv", arraylist1);
   	      hmUser.put("*************************************************", null);
///////////////////////////////////////E-TRADE///////////////////////////
		String csvFile2 = "C:\\Users\\Administrator\\Desktop\\Docs\\January 2018\\NEPAL\\ETRADE_NEPAL.csv";
		BufferedReader br2 = null;
		String line2 = "";
		String cvsSplitBy2 = ",";
		
		//try {
		ArrayList<UserDetails> arraylist2 = new ArrayList<UserDetails>();
		br2 = new BufferedReader(new FileReader(csvFile1));
		while ((line2 = br2.readLine()) != null) {
		
		// use comma as separator
		String[] Details = line2.split(cvsSplitBy1);
		arraylist2.add(new UserDetails(Details[0],Details[1],Details[2],Details[3],Details[4],Details[5]));
		
		}
		hmUser.put("ETRADE.csv", arraylist2);
		hmUser.put("//////////////////////////////////////////////////", null);
///////////////////////////////////////INB/////////////////////////////
		String csvFile3 = "C:\\Users\\Administrator\\Desktop\\Docs\\January 2018\\NEPAL\\INB_NEPAL.csv";
		BufferedReader br3 = null;
		String line3 = "";
		String cvsSplitBy3 = ",";
		
		//try {
		ArrayList<UserDetails> arraylist3 = new ArrayList<UserDetails>();
		br3 = new BufferedReader(new FileReader(csvFile3));
		while ((line3 = br3.readLine()) != null) {
		
		// use comma as separator
		String[] Details = line3.split(cvsSplitBy3);
		arraylist3.add(new UserDetails(Details[0],Details[1],Details[2],Details[3],Details[4],Details[5]));
		
		}
		hmUser.put("INB.csv", arraylist3);
		hmUser.put("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-", null);
///////////////////////////////////////LOS/////////////////////
		String csvFile4 = "C:\\Users\\Administrator\\Desktop\\Docs\\January 2018\\NEPAL\\LOS_NEPAL.csv";
		BufferedReader br4 = null;
		String line4 = "";
		String cvsSplitBy4 = ",";
		
		//try {
		ArrayList<UserDetails> arraylist4 = new ArrayList<UserDetails>();
		br4 = new BufferedReader(new FileReader(csvFile4));
		while ((line4 = br4.readLine()) != null) {
		
		// use comma as separator
		String[] Details = line4.split(cvsSplitBy4);
		arraylist4.add(new UserDetails(Details[0],Details[1],Details[2],Details[3],Details[4],Details[5]));
		
		}
		hmUser.put("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%", null);
		hmUser.put("LOS.csv", arraylist4);

///////////////////////////////////////NETCAST////////////////////////
		String csvFile5 = "C:\\Users\\Administrator\\Desktop\\Docs\\January 2018\\NEPAL\\NETCAST_NEPAL.csv";
		BufferedReader br5 = null;
		String line5 = "";
		String cvsSplitBy5 = ",";
		
		//try {
		ArrayList<UserDetails> arraylist5 = new ArrayList<UserDetails>();
		br5 = new BufferedReader(new FileReader(csvFile5));
		while ((line5 = br5.readLine()) != null) {
		
		// use comma as separator
		String[] Details = line5.split(cvsSplitBy5);
		arraylist5.add(new UserDetails(Details[0],Details[1],Details[2],Details[3],Details[4],Details[5]));
		
		}
		hmUser.put("_______________________________________________", null);
		hmUser.put("NETCAST.csv", arraylist5);

 	      SpringApplication.run(Application.class, args);

}
}
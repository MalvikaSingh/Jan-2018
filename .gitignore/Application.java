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

///////////////////////////////////
	   String csvFile = "C:\\Users\\Administrator\\Desktop\\Docs\\January 2018\\CORE.csv";
       BufferedReader br = null;
       String line = "";
       String cvsSplitBy = ",";

       //try {
    	   ArrayList<UserDetails> arraylist = new ArrayList<UserDetails>();
           br = new BufferedReader(new FileReader(csvFile));
           while ((line = br.readLine()) != null) {

               // use comma as separator
               String[] Details = line.split(cvsSplitBy);
               arraylist.add(new UserDetails(Details[0],Details[1],Details[2],Details[3],Details[4]));

           }
///////////////////////////////////////
           
     	      hmUser.put("CORE.csv", arraylist);
   	   
 	      SpringApplication.run(Application.class, args);

           //////////checking contents of hashmap and size of arraylist and hashmap
           /*for (Entry<Long, Student> me : hmStudent.entrySet()) {
             System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
           }*/
           /*System.out.println(arraylist.size()+" Size of arraylist");
           System.out.println(hmStudent.size()+" Size of hashmap");*/

       //}
           /*Student one=new Student("John","math");
	      hmStudent.put(new Long(one.getId()),one);

	      SpringApplication.run(Application.class, args);

	      Student two=new Student("Jane","history");
	      hmStudent.put(new Long(two.getId()),two); } */
         /*  catch (FileNotFoundException e) {
               e.printStackTrace();
           } catch (IOException e) {
               e.printStackTrace();
           } finally {
               if (br != null) {
                   try {
                       br.close();
                   } catch (IOException e) {
                       e.printStackTrace();
                   }
               }
           }*/
}
}
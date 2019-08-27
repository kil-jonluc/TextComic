Project Requirements:
  Java 8 - (java version "1.8.0_211" & Java(TM) SE Runtime Environment (build 1.8.0_211-b12)
  Maven 3 (version 3.3.9)
  Twilio Account - their free trial is generous
  
Install Instructions:
  1. Make sure Java 8 and Maven 3.3.9.
  2. Set up a twilio number (could be a trial number) and a reciving phone number.
  3.`git clone TextComic`
  4.`mvn verify`
  5.Set these environment variables with data from your twilio account: (The variable names must be exactly the same while the values will be unique to your account they must be in the same format)

Variable Name: RECIPIENT_PHONE
Variable Value: +13333334444

Variable Name: TWILIO_TRIAL_NUMBER
Variable Value: +13333334444

Variable Name:TWILIO_ACCOUNT_SID
Variable Value: AB1234a1234a123a1ab1a1a12ab1234567

Variable Name: TWILIO_AUTH_TOKEN
Variable Value: a12ab12a1234567a123a1a12a123a1a1

6.In cmd navigate to the folder that contains the copy of the project and enter the following commands one at a time for the initial set up. 
  mvn clean 
  mvn compile
  mvn package
  mvn install
  java -jar (the location you put the project on your computer)/TextComic-master/out/artifacts/TextProject_jar/TextProject.jar

7. To run the the program again only run the java -jar line again ( the last instruction in #6). This jar command can be added to a scheduler to run daily if you would like. 



    

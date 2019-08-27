public class TwilioData {

    //constructor
    public TwilioData(){}

    //getting Twilio Data from pre set environmental variables
    final String TRIAL_NUMBER = System.getenv("TWILIO_TRIAL_NUMBER");
    final String RECIPIENT_PHONE = System.getenv("RECIPIENT_PHONE");
    final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
    final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");

}

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Scanner;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import com.twilio.converter.Promoter;
import java.net.URI;

//gets link to comic of the day and sends it to Twilio which sends it to phone as text message image
public class TextInitializer {
    public static void main(String[] args) {

        TwilioData data = new TwilioData();

        if (data.TRIAL_NUMBER == null || data.RECIPIENT_PHONE == null || data.ACCOUNT_SID == null || data.AUTH_TOKEN == null)
        {
            System.out.println("Environmental Variables have been set correctly. Please set these per program instructions.");
        }
        else{
            // Find your Account Sid and Token at twilio.com/user/account
            Twilio.init(data.ACCOUNT_SID, data.AUTH_TOKEN);

            Message message = Message.creator(new PhoneNumber(data.RECIPIENT_PHONE),
                    new PhoneNumber(data.TRIAL_NUMBER), "DAILY COMIC")
                    .setMediaUrl(
                            Promoter.listOfOne(URI.create("https://" + getURLForImage())))
                    .create();

            System.out.println(message.getSid());
        }
    }

    //method called returns a string that is the url of the dilbert sites daily comic
    public static String getURLForImage() {
        String URLString = "https://dilbert.com/";
        String address = "";

        try {
            java.net.URL url = new java.net.URL(URLString);
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()) {
                String line = input.nextLine();
                if (line.indexOf("img class=\"img-responsive img-comic\"") != -1) {
                    address = line.substring(line.indexOf("src") + 7, line.lastIndexOf("\""));
                    //System.out.println(address);
                    break;
                }

            }

        } catch (MalformedURLException ex) {
            System.out.println("Invalid URL");
        } catch (IOException ex) {
            System.out.println("I/O Errors: no such file");
        }

        return address; //"https://" + address;

    }
}

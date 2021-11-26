package mail_sender;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public enum MailCode {
    HAPPY_BIRTHDAY("happy_birthday.txt"), GREETINGS("greetings.txt"), COMPASSION("compassion.txt"), IMPORTANT("important.txt");

    private final String filename;

    MailCode(String filename) {
        this.filename = filename;
    }

    public String generateText(Client client) {
        // Read file
        // Inject client data
        // Return text

        String result = new String();
        try{
            result = readFile();
        }
        catch(Exception e){
            if (MailCode.this == HAPPY_BIRTHDAY)
                result = "Happy birthday!";
            if (MailCode.this == GREETINGS)
                result = "HaHa, Greetings!!";
            if (MailCode.this == COMPASSION)
                result = "Compassion :(";
            if (MailCode.this == IMPORTANT)
                result = "Important!!!";
        }
        result = injectData(result, client);
        return result;
    }

    private String readFile() throws FileNotFoundException {
        String content = new Scanner(new File(this.filename)).useDelimiter("\\Z").next();
        return content;
    }

    private String injectData(String letter, Client client){
        //dummy function
        return letter;
    }
}

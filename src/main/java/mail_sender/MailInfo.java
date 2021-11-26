package mail_sender;

public class MailInfo {
    Client client;
    MailCode mailcode;
    String letter;

    public MailInfo(Client client, MailCode mailcode){
        this.client = client;
        this.mailcode = mailcode;
        this.letter = mailcode.generateText(client);
    }

    public String getLetter(){return letter;}
    public String getEmail(){ return client.email; }
}

package mail_sender;

public class MailSender {
    public static void sendMail(MailInfo mailInfo, String emailFrom){
        //dummy function
        String emailTo = mailInfo.getEmail();
        mailInfo.getLetter();
        System.out.println("Email sent form "+emailFrom + " to "+mailInfo.getEmail());
    }
}

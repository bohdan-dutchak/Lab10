package mail_sender;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor @NoArgsConstructor
public class MailBox{
    private List<MailInfo> data = new ArrayList<>();

    public void addMailInfo(MailInfo mailInfo){
        data.add(mailInfo);
    }

    public void addMailInfo(ArrayList<MailInfo> mailInfos){
        data.addAll(mailInfos);
    }

    public void sendAll(){
        for (MailInfo mailinfo : data){
            MailSender.sendMail(mailinfo, "no-reply@ucu.edu.ua");
            data.remove(mailinfo);
        }
    }
}

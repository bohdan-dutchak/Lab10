package mail_sender;

import idGenerator.IdGenerator;

public class Client {
    int id;
    String name;
    int age;
    Gender sex;
    String email;

    public Client(String name, int age, Gender sex, String email){
        this.id = IdGenerator.getId();
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.email = email;
    }
}

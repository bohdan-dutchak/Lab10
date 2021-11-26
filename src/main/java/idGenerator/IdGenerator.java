package idGenerator;

public class IdGenerator {
    static private int id;
    private static IdGenerator instance = null;
    private IdGenerator(){
        this.id = 0;
    }
    public static int getId(){
        if (instance == null)
            instance = new IdGenerator();
        id++;
        return id;
    }
}

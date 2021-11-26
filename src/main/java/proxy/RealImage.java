package proxy;

import lombok.AllArgsConstructor;

public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk();
    }
    public void display(){
        System.out.println("__________\n__00__00__\n__________\n__0____0__\n___0000___");
    }

    public void loadFromDisk(){
        System.out.println("Loading image of a face from "+fileName+"...");
    }
}

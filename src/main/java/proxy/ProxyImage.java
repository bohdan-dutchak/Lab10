package proxy;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProxyImage implements Image{
    private RealImage realImage;
    String fileName;

    public  ProxyImage(String fileName){
        this.fileName = fileName;
        this.realImage = new RealImage(this.fileName);
    }

    public void display(){
        realImage.loadFromDisk();
        realImage.display();
    }
}

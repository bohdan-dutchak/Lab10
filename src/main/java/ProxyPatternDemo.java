import proxy.Image;
import proxy.RealImage;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new RealImage("folder");
        image.display();
    }
}

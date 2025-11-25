package SingletonDesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class STDP_runner {

    public static void main(String[] args) {

        STDP_01 obj1 = STDP_01.getInstance(); //create an object.
        STDP_01 obj2 = STDP_01.getInstance(); // create an object

//        STDP_01 obj3 = new STDP_01(); not required
//        STDP_01 obj4 = new STDP_01();  not required
        obj1.nsmethod();
        obj2.nsmethod();

        System.out.println(obj1==obj2); // return true both obj reference is pointing to 1 instance variable
//        System.out.println(obj3==obj4); --> Not required
//        WebDriver driver = new ChromeDriver();
    }
}

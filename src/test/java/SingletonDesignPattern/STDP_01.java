package SingletonDesignPattern;

public class STDP_01 {

   //1. make instance variable as private
    static STDP_01 inst ;

   //2. make constructor as private
     STDP_01()
    {

    }

    //3. method to create an object once.
    public static STDP_01 getInstance()
    {
        if (inst == null) {
            inst = new STDP_01(); //object will be created only once.
        }
        return inst;
    }


    //non static method
    public void nsmethod()
    {
        System.out.println("Singleton object created");
    }

}

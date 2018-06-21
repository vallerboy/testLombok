import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        //Logika biznesowa naszej adnotacji (executor)
        for (Method method : Player.class.getMethods() /* Podstawiamy caly katalog z klasami zamiast 1 klasy*/) {
            if(method.isAnnotationPresent(NeedInternet.class)){
                //Jeżli jest internet wpiety do pc to wszystko super
                //Jezeli nie to np. zamknij program lub popros usera od podlaczeniee
                System.out.println("Mamy w kodzie metode, ktora wymaga internetu( " + method.getName() + ")");
                System.out.println("Poniewaz jest wyrazona za pomoca adnotacji @NeedInternet");
            }
        }
    }
}

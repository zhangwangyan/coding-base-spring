import event.Event;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext application = new ClassPathXmlApplicationContext("spring.xml");
        application.publishEvent(new Event("aaa", "bbb"));

    }
}

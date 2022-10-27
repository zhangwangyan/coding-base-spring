package desperado;

import desperado.beans.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Mytest {
    public static void main(String[] args) {
   ApplicationContext application = new AnnotationConfigApplicationContext(TestBean.class);
        Teacher bean = application.getBean(Teacher.class);
        System.out.println(bean.getUsername());
    }
}

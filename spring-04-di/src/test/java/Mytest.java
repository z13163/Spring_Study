import com.kq.pojo.Student;
import com.kq.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
        User user = context.getBean("user", User.class);
        User user2 = context.getBean("user2", User.class);
        System.out.println(user);
        System.out.println(user2);
    }
}

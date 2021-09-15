import com.kq.config.MonConfig;
import com.kq.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MonConfig.class);
        User user = context.getBean("user", User.class);
        System.out.println(user.getName());
    }
}

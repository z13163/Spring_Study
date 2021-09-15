import com.kq.pojo.User;
import com.kq.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("User");
        User user2 = (User) context.getBean("User");
        user.show();
        System.out.println(user);
        System.out.println(user2);
    }
}

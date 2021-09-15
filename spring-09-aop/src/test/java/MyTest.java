import com.kq.service.UserService;
import com.kq.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //动态代理要去代理接口!!!!!!!!!!!!!!注意
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
}

import com.kq.pojo.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        People people = context.getBean("people", People.class);
        System.out.println(people);
        people.getCat().shut();
        people.getDog().shut();
    }
}

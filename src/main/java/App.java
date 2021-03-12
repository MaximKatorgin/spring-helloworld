import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld HWbean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld HWbean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(HWbean1 == HWbean2);

        Cat cat1 =
                (Cat) applicationContext.getBean("cat");
        Cat cat2 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(cat1 == cat2);
    }
}

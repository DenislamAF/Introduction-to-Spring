import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1_1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1_2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat bean2_1 =
                (Cat) applicationContext.getBean("cat");
        Cat bean2_2 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(bean1_1 == bean1_2);
        System.out.println(bean2_1 == bean2_2);
    }
}
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorld =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(helloWorld.getMessage());

        HelloWorld beanHello2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        
        if (helloWorld == beanHello2){
            System.out.println("Hello worlds is same");
        }

        Cat oneCat = applicationContext.getBean(Cat.class);
        Cat twoCat = applicationContext.getBean(Cat.class);


        if (oneCat != twoCat){
            System.out.println("Cat's not same");
        }
    }
}
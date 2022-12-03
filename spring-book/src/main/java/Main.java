import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Minoltan Issack on 12/3/2022
 */
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext();
        Parrot p = new Parrot();
    }
}

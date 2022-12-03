import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Minoltan Issack on 12/3/2022
 */
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());

        String s = context.getBean(String.class);
        System.out.println(s);
        Integer n = context.getBean(Integer.class);

    }
}

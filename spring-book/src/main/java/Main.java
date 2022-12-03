import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Minoltan Issack on 12/3/2022
 */
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot parrot1 = context.getBean("parrot1", Parrot.class);
        System.out.println(parrot1.getName());

        Parrot parrot2 = context.getBean("parrot2", Parrot.class);
        System.out.println(parrot1.getName());

        Parrot parrot3 = context.getBean("parrot3", Parrot.class);
        System.out.println(parrot1.getName());

        String s = context.getBean(String.class);
        System.out.println(s);
        Integer n = context.getBean(Integer.class);

        // Stereo type
        ParrotStereo parrotStereo = context.getBean(ParrotStereo.class);
        System.out.println(parrot1.getName());

    }
}

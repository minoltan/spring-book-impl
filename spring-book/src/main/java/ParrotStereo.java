import org.springframework.stereotype.Component;

/**
 * @author Minoltan Issack on 12/3/2022
 */
@Component
public class ParrotStereo {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

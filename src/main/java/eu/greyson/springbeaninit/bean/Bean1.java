package eu.greyson.springbeaninit.bean;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("bean6")
public class Bean1 {
    public Bean1() {
        System.out.println("Constructor: " + this.getClass());
    }
}

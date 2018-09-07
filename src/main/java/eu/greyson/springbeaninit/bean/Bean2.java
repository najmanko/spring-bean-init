package eu.greyson.springbeaninit.bean;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class Bean2 {
    public Bean2() {
        System.out.println("Constructor: " + this.getClass());
    }
}

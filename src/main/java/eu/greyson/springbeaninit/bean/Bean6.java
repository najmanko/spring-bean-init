package eu.greyson.springbeaninit.bean;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

public class Bean6 implements InitializingBean {
    public Bean6() {
        System.out.println("Constructor empty: " + this.getClass());
    }

    public void hovno() {
        System.out.println("hovno");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After: " + this.getClass());
    }

    @PostConstruct
    public void postConstructBean3Master() {
        System.out.println("post construct for " + getClass());
    }
}

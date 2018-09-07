package eu.greyson.springbeaninit.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Bean4Slave {

    public Bean4Slave() {
        System.out.println("Contructor empty: " + this.getClass());
    }

    @PostConstruct
    public void postConstructBean3Master() {
        System.out.println("post construct for " + getClass());
    }

    @PreDestroy
    public void lol() {
        System.out.println("pre destroy for " + getClass());
    }
}

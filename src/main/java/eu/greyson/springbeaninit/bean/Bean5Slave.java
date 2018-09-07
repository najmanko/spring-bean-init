package eu.greyson.springbeaninit.bean;

import org.springframework.stereotype.Component;

@Component
public class Bean5Slave {
    public Bean5Slave() {
        System.out.println("Contructor empty: " + this.getClass());
    }
}

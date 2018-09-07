package eu.greyson.springbeaninit.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@DependsOn("bean5Slave")
public class Bean3Master implements InitializingBean {
    private Bean4Slave bean4Slave;
    private Bean5Slave bean5Slave;

    @Autowired
    public Bean3Master(Bean4Slave bean4Slave, ApplicationContext context) {
        this.bean4Slave = bean4Slave;
        bean5Slave = context.getBean(Bean5Slave.class);
        System.out.println("Constructor with parameter: " + this.getClass());
        System.out.println("Slave5: " + bean5Slave);
    }

    @Autowired
    public void setBean5Slave(Bean5Slave bean5Slave) {
        this.bean5Slave = bean5Slave;
        System.out.println("SETEEEEEEEEEEEEEEEEEEEEER");
        System.out.println("Slave4: " + bean4Slave);
    }

    public Bean3Master() {
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


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet LOLOLOLOLOLOL");
    }
}

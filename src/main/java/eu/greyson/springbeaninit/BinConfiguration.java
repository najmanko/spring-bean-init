package eu.greyson.springbeaninit;

import eu.greyson.springbeaninit.bean.Bean6;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BinConfiguration {

    @Bean(initMethod = "hovno")
    public Bean6 bean6() {
        return new Bean6();
    }

}

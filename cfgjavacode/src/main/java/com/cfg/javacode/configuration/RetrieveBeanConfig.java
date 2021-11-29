package com.cfg.javacode.configuration;

import com.cfg.javacode.bean.DemoBean;
import com.cfg.javacode.bean.DemoBeanImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RetrieveBeanConfig {

    @Bean
    public DemoBean demoBean(){
        return new DemoBeanImpl();
    }
}

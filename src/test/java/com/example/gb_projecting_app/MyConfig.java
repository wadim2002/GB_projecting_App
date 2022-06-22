package com.example.gb_projecting_app;

import com.example.gb_projecting_app.process_rules.Process_rule_extract_size;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.example.gb_projecting_app")
public class MyConfig {
    @Bean
    @Scope("prototype")
    public Book bookBean(){
        return new Book();
    }
    @Bean
    @Scope("singleton")
    public Process_rule_extract_size ruleExtractSizeBean(){return new Process_rule_extract_size();}
}

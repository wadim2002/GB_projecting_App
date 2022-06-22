package com.example.gb_projecting_app.mytests;

import com.example.gb_projecting_app.Book;
import com.example.gb_projecting_app.MyConfig;
import com.example.gb_projecting_app.process_rules.Process_rule_extract_size;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test2 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Book book = context.getBean("bookBean", Book.class);
        Process_rule_extract_size myrule = context.getBean("ruleExtractSizeBean", Process_rule_extract_size.class);
        book = (Book)myrule.Process();

        context.close();
        
    }
}

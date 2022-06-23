package com.example.gb_projecting_app.mytests;
import org.hibernate.Session;
import com.example.gb_projecting_app.Book;
import com.example.gb_projecting_app.MyConfig;
import com.example.gb_projecting_app.process_rules.Process_rule_extract_size;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.hibernate.cfg.Configuration;

public class test3_hiber {

    public static void main(String[] args) {
        // Создаем сессию для Hibernate
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Book.class)
                .buildSessionFactory();

            Session session = (Session) factory.getCurrentSession();

            session.beginTransaction();

            Book book2 = new Book("География","Петров", "Роспечать", "c:file2.pdf");


            session.save(book2);
            session.getTransaction().commit();

            session.close();
            factory.close();
    }
}
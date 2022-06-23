package com.example.gb_projecting_app.mytests;

import com.example.gb_projecting_app.Book;
import com.example.gb_projecting_app.MyConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test4_hiber {

    public static void main(String[] args) {
//         Запускаем фабрику для создания сущностей
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Book book = (Book) context.getBean("bookBean", "Азбука","Иванов", "Роспечать", "c:file.pdf");
        //String label, String author, String publishing_house, String image
//        Process_rule_extract_size myrule = context.getBean("ruleExtractSizeBean", Process_rule_extract_size.class);
//        book.setLabel("книга");
//        book.setAuthor("Teacher");
//        book.setImage("c:1.pdf");
//        book.setPublishing_house("Роспечать");
        System.out.println(book.getLabel());
        //book = (Book) myrule.Process(book);


        // Создаем сессию для Hibernate
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Book.class)
                .buildSessionFactory();

        Session session = (Session) factory.getCurrentSession();

        session.beginTransaction();

        //Book book2 = new Book("География","Петров", "Роспечать", "c:file2.pdf");


        session.save(book);
        session.getTransaction().commit();

        context.close();

        session.close();
        factory.close();


    }
}
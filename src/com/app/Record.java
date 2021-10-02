package com.app;

import com.app.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Record {

    public static void main(String[] args) {
        Student student = new Student(1, "Rohit", "Nashik");

        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
        SessionFactory sessionFactory = con.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();
        session.save(student);
        transaction.commit();
    }
}

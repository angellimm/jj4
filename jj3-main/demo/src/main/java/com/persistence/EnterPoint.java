package com.persistence;
import com.entity.Person;
import com.persistence.HibernateUtil;
import org.hibernate.Session;

public class EnterPoint {

    public static void main(String[] args) {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        Person person1 = new Person("Сергей", 18);
        Person person2 = new Person("Олег", 19);

        session.save(person1);
        session.save(person2);
        session.getTransaction().commit();
    }

}


package com.register.dao;

import com.register.conn.HibernateUtils;
import com.register.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployeeDao {
    private SessionFactory sessionFactory;

    public EmployeeDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    public boolean saveEmp(Employee e){
        Session session =sessionFactory.openSession();
        boolean a=false;
       Transaction transaction = session.beginTransaction();
      int i=(Integer) session.save(e);
      if(i>0){a=true;}
      else a=false;
       transaction.commit();

       session.close();

        return a;
    }

}

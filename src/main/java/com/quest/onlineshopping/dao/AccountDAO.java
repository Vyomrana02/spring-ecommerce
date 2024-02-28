package com.quest.onlineshopping.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.quest.onlineshopping.entity.Account;
//that any database operations performed within the marked method or class will be executed within a transaction. If the transaction is successful, the changes will be committed to the database.
@Transactional
@Repository
public class AccountDAO {
 
    @Autowired
    private SessionFactory sessionFactory;

   //@repository itself gives methods like findbyid,save etc but if we want to find by other than primary key we create method and return like this 
  //ie session.find(which entity , find by which field)
    public Account findAccount(String userName) {
        Session session = this.sessionFactory.getCurrentSession();
        return session.find(Account.class, userName);
    }
 
}

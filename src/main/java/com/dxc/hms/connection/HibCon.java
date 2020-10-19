package com.dxc.hms.connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibCon {
	public Session getSession() {
		return session;
	}


	Session session;


public HibCon() {
	SessionFactory sfact= new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
	session=sfact.openSession();
}
}

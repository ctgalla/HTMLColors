package com.gallagher.hib3;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class colorDAO {
	private static SessionFactory factory;

	private static void setupFactory() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			;
		}

		Configuration configuration = new Configuration();
		// modify these to match your XML files
		configuration.configure("hibernate.cfg.xml");
		configuration.addResource("color.hbm.xml");
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		factory = configuration.buildSessionFactory(serviceRegistry);
	}

	// list all colors
	public static List<Color> listColors() {
		if (factory == null)
			setupFactory();
		Session hibernateSession = factory.openSession();
		hibernateSession.getTransaction().begin();

		List<Color> color = hibernateSession.createQuery("FROM Color").list();

		hibernateSession.getTransaction().commit();
		hibernateSession.close();

		return color;
	}
	// list all colors

}

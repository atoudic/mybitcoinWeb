package fr.bitcoinerie.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.Test;

public class HibernateTest{
    @Test
    public void createSessionFactory() {
        Configuration configuration = new Configuration();

        configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.DerbyTenFiveDialect");
        configuration.setProperty("hibernate.connection.url", "jdbc:derby:target/testdb;create=true");
        configuration.setProperty("hibernate.connection.driver_class", "org.apache.derby.jdbc.EmbeddedDriver");
        configuration.setProperty("hibernate.hbm2ddl.auto", "create-drop");

        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();

        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
}

}
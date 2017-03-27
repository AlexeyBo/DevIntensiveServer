package hello;

import hello.dao.IPersonDao;
import org.springframework.context.annotation.Bean;

import org.springframework.transaction.annotation.EnableTransactionManagement;

//@org.springframework.context.annotation.Configuration
//@EnableTransactionManagement
public class AppConfig {

//    @Bean
//    public IPersonDao personDao() {
//        return new PersonDao();
//    }
//
//    @Bean
//    public HibernateTemplate hibernateTemplate() {
//        return new HibernateTemplate(sessionFactory());
//    }
//
//    @Bean
//    public SessionFactory sessionFactory() {
//
//
//        return new LocalSessionFactoryBuilder(getDataSource())
//                .addAnnotatedClasses(Person.class)
//                .buildSessionFactory();
//    }
//
//    @Bean
//    public DataSource getDataSource() {
//        BasicDataSource dataSource = new BasicDataSource();
//        dataSource.setDriverClassName("org.postgresql.Driver");
//        dataSource.setUrl("jdbc:postgresql://localhost:5432/devintensive");
//        dataSource.setUsername("root");
//        dataSource.setPassword("12345");
//        return dataSource;
//    }
//
//    @Bean
//    public HibernateTransactionManager hibTransMan(){
//        return new HibernateTransactionManager(sessionFactory());
//    }

}

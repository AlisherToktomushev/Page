//package com.project.Config;
//
//import com.mchange.v2.c3p0.ComboPooledDataSource;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.orm.hibernate5.HibernateTransactionManager;
//import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
//import javax.sql.DataSource;
//import java.beans.PropertyVetoException;
//import java.util.Properties;
//
//@Configuration
//@ComponentScan(basePackages = "com.project")
//@EnableWebMvc
//@EnableTransactionManagement
//public class myConfig {
//
//        @Bean
//        public DataSource dataSource() {
//
//            ComboPooledDataSource dataSource = new ComboPooledDataSource();
//            try {
//                dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
//                dataSource.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/second?useSSL=false");
//                dataSource.setUser("bestuser");
//                dataSource.setPassword("bestuser");
//            } catch (PropertyVetoException e) {
//                e.printStackTrace();
//
//            }
//            return dataSource;
//        }
//        @Bean
//        public LocalSessionFactoryBean sessionFactoryBean() {
//            LocalSessionFactoryBean sessionFactoryBean1=new LocalSessionFactoryBean();
//            sessionFactoryBean1.setDataSource(dataSource());
//            sessionFactoryBean1.setPackagesToScan("com.zaur.spring.rest.entity");
//            Properties properties =new Properties();
//            properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
//            properties.setProperty("hibernate.show_sql","true");
//            sessionFactoryBean1.setHibernateProperties(properties);
//            return sessionFactoryBean1;
//        }
//        @Bean
//        public HibernateTransactionManager transactionManager(){
//            HibernateTransactionManager transactionManager =new HibernateTransactionManager();
//            transactionManager.setSessionFactory(sessionFactoryBean().getObject());
//            return transactionManager;
//        }
//    }
//
//
//

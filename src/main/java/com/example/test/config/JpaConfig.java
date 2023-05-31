//package com.example.test.config;
//
//import jakarta.persistence.EntityManagerFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.sql.DataSource;
//
//@Configuration
//@EnableJpaRepositories(basePackages = "com.example.test.repository")
//@EnableTransactionManagement
//public class JpaConfig {
//    @Bean
//    public EntityManagerFactory entityManagerFactory(DataSource dataSource) {
//        LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
//        emf.setDataSource(dataSource);
//        // Set other JPA and Hibernate properties if needed
//        emf.setPackagesToScan("com.example.test.entity");
//        emf.afterPropertiesSet();
//        return emf.getObject();
//    }
//}

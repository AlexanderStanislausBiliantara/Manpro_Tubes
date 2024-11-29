package com.example.manpro;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DataSourceConfig {
   @Value("${spring.datasource.url}")
   private String url;
   @Value("${spring.datasource.username}")
   private String username;
   @Value("${spring.datasource.password}")
   private String password;

   public DataSourceConfig() {
   }

   @Bean
   public DataSource dataSource() {
      DriverManagerDataSource dataSource = new DriverManagerDataSource();
      dataSource.setUrl(this.url);
      dataSource.setUsername(this.username);
      dataSource.setPassword(this.password);
      return dataSource;
   }
}

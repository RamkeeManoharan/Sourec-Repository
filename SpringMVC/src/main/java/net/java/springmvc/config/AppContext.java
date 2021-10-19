package net.java.springmvc.config;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@PropertySource("classpath:database.properties")
@EnableTransactionManagement

public class AppContext {
	@Autowired
	private Environment environment;
	
	@Bean
	public LocalSessionFactoryBean sessionfactory() {
		return new LocalSessionFactoryBean();
	}
	

}

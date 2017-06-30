package Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import model.Employee;

@Configuration
public class SpringConf {
 @Bean(initMethod="init",destroyMethod="destory")       
 public Employee emp(){
	 return new Employee();
 }
}

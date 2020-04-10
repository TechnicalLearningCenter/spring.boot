package spring.boot.ioc.async;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Created by pankaj on 2/27/2017.
 */
@Configuration
@EnableAsync
@ComponentScan("spring.ioc.ioc.async")
public class AppConfig {


}

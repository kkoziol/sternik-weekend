package pl.sternik.kk.weekend;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = { "pl.sternik.kk.weekend" }, excludeFilters = {
        @Filter(type = FilterType.REGEX, pattern = "pl\\.sternik\\.kk\\.weekend\\.web\\..*") })
@ImportResource({"classpath:/applicationContext.xml"})
public class SpringBusinessConfig {

}

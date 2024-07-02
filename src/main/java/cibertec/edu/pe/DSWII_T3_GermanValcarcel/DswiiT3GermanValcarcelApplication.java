package cibertec.edu.pe.DSWII_T3_GermanValcarcel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class DswiiT3GermanValcarcelApplication {

	public static void main(String[] args) {
		SpringApplication.run(DswiiT3GermanValcarcelApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer configurerglobalCros(){
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
					registry.addMapping("api/v2/**")
							.allowedMethods("GET","POST")
							.allowedOrigins("https://www.cibertec.edu.pe");
			}
		};
	}
}

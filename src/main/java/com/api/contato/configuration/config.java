package com.api.contato.configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class config implements WebMvcConfigurer{

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Permite todas as URLs
                .allowedOrigins("*") // Permite este domínio
                .allowedMethods("GET", "POST") // Permite estes métodos
                .allowedHeaders("*"); // Permite todos os headers
    }
}

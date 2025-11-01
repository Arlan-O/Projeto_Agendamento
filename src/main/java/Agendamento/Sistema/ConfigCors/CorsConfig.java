package Agendamento.Sistema.ConfigCors;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/eventos/**")  // Libera todos os endpoints que começam com /
                .allowedOrigins("*")       // Permite conexões de QUALQUER origem
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Permite estes métodos HTTP
                .allowedHeaders("*");      // Permite todos os cabeçalhos
    }
}

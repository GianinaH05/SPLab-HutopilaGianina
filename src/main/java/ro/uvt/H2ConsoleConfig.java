package ro.uvt;

import org.h2.server.web.JakartaWebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class H2ConsoleConfig {

    @Bean
    public ServletRegistrationBean<JakartaWebServlet> h2servletRegistration() {
        ServletRegistrationBean<JakartaWebServlet> registrationBean =
                new ServletRegistrationBean<>(new JakartaWebServlet(), "/h2-console/*", "/h2-console");
        return registrationBean;
    }

    // Optional: Add logging on startup to verify bean initialization
    public H2ConsoleConfig() {
        System.out.println(">>> H2ConsoleConfig loaded by Spring Application Context! <<<");
    }
}
package com.example.jaz_s26234_nbp.config;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

public class SwaggerConfig {

    @Bean
    public OpenAPI myOpenAPI() {
        Contact contact = new Contact();
        contact.setEmail("s26234@pjwstk.edu.pl");
        contact.setName("Pjatk");
        contact.setUrl("https://www.pjatk-gdansk.com");
        License mitLicense = new License().name("MIT License").url("https://choosealicense.com/licenses/mit/");
        Info info = new Info()
                .title("Movie Service rest api")
                .version("1.0")
                .contact(contact)
                .description("This API exposes endpoints to manage movie repository.")
                .license(mitLicense);
        return new OpenAPI().info(info);
    }


}

package org.openapitools.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "org.openapitools.configuration.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Tic Tac Toe")
                                .description("This API allows writing down marks on a Tic Tac Toe board and requesting the state of the board or of individual squares. ")
                                .version("1.0.0")
                )
                .components(
                        new Components()
                                .addSecuritySchemes("defaultApiKey", new SecurityScheme()
                                        .type(SecurityScheme.Type.APIKEY)
                                        .in(SecurityScheme.In.HEADER)
                                        .name("api-key")
                                )
                                .addSecuritySchemes("basicHttpAuthentication", new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("Basic")
                                )
                                .addSecuritySchemes("bearerHttpAuthentication", new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("Bearer")
                                        .bearerFormat("JWT")
                                )
                                .addSecuritySchemes("app2AppOauth", new SecurityScheme()
                                        .type(SecurityScheme.Type.OAUTH2)
                                )
                                .addSecuritySchemes("user2AppOauth", new SecurityScheme()
                                        .type(SecurityScheme.Type.OAUTH2)
                                )
                )
        ;
    }
}
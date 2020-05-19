package com.philips.api.calculation.infrastructure.configurations.swagger;

/**
 * @author <a href="mailto:harisson.freitas@gmail.com">Harisson Freitas∴</a>
 * @project calculations
 * @since 04/05/20 - 14:39
 **/

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration of Swagger with OpenApi
 * Version API
 */

@Configuration
public class OpenApiSwaggerConfiguration {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(info());
    }

    private Info info() {
        return new Info()
                .title("CALCULATIONS-API")
                .description("API containing the endpoints for the ICCA calculations settings")
                .version("0.0,1");
    }
}

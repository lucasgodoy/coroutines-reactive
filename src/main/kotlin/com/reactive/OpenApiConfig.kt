package com.reactive

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
internal class OpenApiConfig {

    @Bean
    fun customOpenAPI(): OpenAPI =
        OpenAPI()
            .info(
                Info()
                    .title("eCometry Backoffice API")
                    .description("Version 1.0 of the REST API to communicate with eCometry Backoffice.")
                    .version("1.0")
            )
}
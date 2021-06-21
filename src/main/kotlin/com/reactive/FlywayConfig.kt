package com.reactive

import org.flywaydb.core.Flyway
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.env.Environment

@Configuration
class FlywayConfig(val env: Environment) {
    // just because Flyway does not support R2DBC yet, we're forced to create a migration bean
    @Bean(initMethod = "migrate")
    fun flyway(): Flyway {
        return Flyway(
            Flyway.configure()
                .baselineOnMigrate(true)
                .dataSource(
                    env.getRequiredProperty("spring.flyway.url"),
                    env.getRequiredProperty("spring.flyway.username"),
                    env.getRequiredProperty("spring.flyway.password")
                )
        )
    }
}
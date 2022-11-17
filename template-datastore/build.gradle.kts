plugins {
   `java-test-fixtures`
}

dependencies {
   api(projects.templateDomain)
   api("io.micrometer:micrometer-core:1.10.0")
   api("org.postgresql:postgresql:42.5.0")
   api("com.zaxxer:HikariCP:5.0.1")
   api("org.springframework:spring-jdbc:5.3.23")
   api("org.flywaydb:flyway-core:9.7.0")
}

dependencies {
   testFixturesImplementation("io.kotest.extensions:kotest-extensions-testcontainers:1.3.4")
   testFixturesImplementation("org.testcontainers:postgresql:1.17.4")
}

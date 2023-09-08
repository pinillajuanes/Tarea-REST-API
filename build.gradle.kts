plugins {
	java
	id("org.springframework.boot") version "2.7.15"
	id("io.spring.dependency-management") version "1.0.15.RELEASE"
}

group = "com.inventario"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("mysql:mysql-connector-java:8.0.32")
	implementation("javax.persistence:javax.persistence-api:2.2")
	implementation("javax.persistence:javax.persistence-api:2.2")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	compileOnly("org.projectlombok:lombok:1.18.24")
}

tasks.withType<Test> {
	useJUnitPlatform()
}

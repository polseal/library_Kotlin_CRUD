import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "3.1.3"
	id("io.spring.dependency-management") version "1.1.3"
	kotlin("jvm") version "1.8.22"
	kotlin("plugin.spring") version "1.8.22"
	kotlin("plugin.jpa") version "1.8.22"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_19
}

repositories {
	mavenCentral()
}

dependencies {
	implementation ("org.jetbrains.kotlin:kotlin-stdlib:1.7.20")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-security")
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.liquibase:liquibase-core")
	implementation("org.thymeleaf.extras:thymeleaf-extras-springsecurity6")
	developmentOnly("org.springframework.boot:spring-boot-docker-compose")
	runtimeOnly("org.postgresql:postgresql")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.springframework.security:spring-security-test")
}


tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs += "-Xjsr305=strict"
		jvmTarget = "19"
	}
}

val fatJar = task("fatJar", type = Jar::class) {
	duplicatesStrategy = DuplicatesStrategy.EXCLUDE
	manifest {
		attributes["Implementation-Title"] = "Gradle Jar File Example"
		attributes["Implementation-Version"] = version
		attributes["Main-Class"] = "com.example.library.LibraryApplication"
	}
	from(configurations.runtimeClasspath.get().map({ if (it.isDirectory) it else zipTree(it) }))
	with(tasks.jar.get() as CopySpec)
}

tasks {
	"build" {
		dependsOn(fatJar)
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}

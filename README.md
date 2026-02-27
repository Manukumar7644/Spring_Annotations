# Spring_Annotations
Spring annotations are used to configure and manage Spring applications without XML. They help in creating beans, injecting dependencies, handling web requests, and managing configuration.
# 🌱 Spring Annotations (Spring Boot)

Spring annotations are used to configure and manage Spring applications without XML.
They help in creating beans, injecting dependencies, handling web requests, and managing configuration.

---

## 🔥 1. Stereotype Annotations (Create Beans)

### ✅ `@Component`

Generic annotation used to create a bean.

### ✅ `@Service`

Used in the service layer.

### ✅ `@Repository`

Used in the data access layer (database operations).

### ✅ `@Controller`

Used in Spring MVC to handle web requests.

### ✅ `@RestController`

Used to build REST APIs.
Combination of `@Controller + @ResponseBody`.

---

## 🔥 2. Dependency Injection Annotations

### ✅ `@Autowired`

Automatically injects dependencies.

### ✅ `@Qualifier`

Used when multiple beans of the same type exist.

### ✅ `@Value`

Injects values from properties file.

---

## 🔥 3. Configuration Annotations

### ✅ `@Configuration`

Marks a class as a configuration class.

### ✅ `@Bean`

Creates a bean manually.

### ✅ `@ComponentScan`

Scans packages to find Spring components.

---

## 🔥 4. Spring Boot Main Annotation

### ✅ `@SpringBootApplication`

Main annotation of Spring Boot.
Combination of:

* `@Configuration`
* `@EnableAutoConfiguration`
* `@ComponentScan`

---

## 🔥 5. Web / REST Annotations

### ✅ `@RequestMapping`

Maps HTTP requests to handler methods.

### ✅ `@GetMapping`

Handles GET requests.

### ✅ `@PostMapping`

Handles POST requests.

### ✅ `@PathVariable`

Extracts values from URL.

### ✅ `@RequestParam`

Reads query parameters from URL.

---

## 🎯 Key Points

* Annotations replace XML configuration
* `@Component` is the base stereotype
* `@Autowired` is used for dependency injection
* `@SpringBootApplication` is the entry point of a Spring Boot app

---

⭐ This repository contains examples and explanations of commonly used Spring Boot annotations.

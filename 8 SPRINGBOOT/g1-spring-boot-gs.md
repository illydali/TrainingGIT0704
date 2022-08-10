:beginner: _**CREATE SPRING BOOT PROJECT**_  

:one: _new project_  
- pom.xml (dependency config / maven)
```xml
<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.6.10</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
```

```xml
	<properties>
		<java.version>1.8</java.version>
	</properties>
	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
    </dependencies>
```

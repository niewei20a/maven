package maven;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "maven.dao")
@SpringBootApplication
public class mavenApplication {
    public static void main(String[] args) {
        SpringApplication.run(mavenApplication.class, args);
    }
}

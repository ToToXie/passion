package wd.passion;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@MapperScan(basePackages = "wd.passion.mapper")
public class PassionApplication {

    public static void main(String[] args) {
        SpringApplication.run(PassionApplication.class, args);
    }

}


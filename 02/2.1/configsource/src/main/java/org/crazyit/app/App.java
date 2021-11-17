package org.crazyit.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(scanBasePackages = {"org.crazyit.app", "org.fkit.app"})
@ImportResource("classpath:beans.xml")
@Import(cn.fkjava.app.MyConfig.class)
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}

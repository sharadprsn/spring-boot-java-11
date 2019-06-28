package com.cb.app;


import com.cb.app.component.InitComponent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.annotation.PostConstruct;
import java.net.InetAddress;

@Slf4j
@EnableWebMvc
@SpringBootApplication
@EnableConfigurationProperties(InitComponent.class)
public class Main {

    @Value("${server.port}")
    private String port;

    @Value("${server.servlet.context-path}")
    private String contextPath;

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Main.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }

    @PostConstruct
    public void serverStatus() {
        try {
            log.info("server running at local http://{}:{}{}", InetAddress.getLoopbackAddress().getHostAddress(), port, contextPath);
            log.info("server running at remote http://{}:{}{}", InetAddress.getLocalHost().getHostAddress(), port, contextPath);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}

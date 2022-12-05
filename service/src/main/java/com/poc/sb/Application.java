package com.poc.sb;


import com.poc.sb.controller.VaultConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.cloud.vault.config.VaultBootstrapper;
import org.springframework.context.ConfigurableApplicationContext;

import javax.annotation.PostConstruct;

@SpringBootApplication(exclude = {RedisAutoConfiguration.class})
public class Application {

    public static void main(String[] args) {
//        SpringApplication application = new SpringApplication(Application.class);
        SpringApplication.run(Application.class, args);
//        application.addBootstrapper(VaultBootstrapper.fromConfigurer(secretBackendConfigurer -> {
//            secretBackendConfigurer
//                    .add("cf/1a558498-59ad-488c-b395-8b983aacb7da/secret/my-cf-app");
//        }));
//        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
//        VaultConfig vaultConfiguration = context.getBean(VaultConfig.class);
//        System.out.println("Username: " + vaultConfiguration.getUsername());
//        System.out.println("Password: " + vaultConfiguration.getPassword());
    }

}
package com.poc.sb.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.vault.config.VaultConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

//@Configuration
//@RequiredArgsConstructor
public class VaultConfig {
//    private final AppVaultPaths appVaultPaths;
//    //@Bean
//    public VaultConfigurer configurer() {
//        return configurer -> appVaultPaths.getVaultPaths().forEach(vaultPath -> {
//            configurer.add(vaultPath);
////            configurer.registerDefaultDiscoveredSecretBackends(false);
////            configurer.registerDefaultKeyValueSecretBackends(false);
////            configurer.registerDefaultGenericSecretBackends(false);
//        });
//    }
//
//    @Data
//    @AllArgsConstructor
//    @NoArgsConstructor
//    @ConfigurationProperties("app")
//    @Component
//    public static class AppVaultPaths {
//        private List<String> vaultPaths;
//    }
}
package com.poc.sb.controller;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author daniel.leinbach
 * @since 4/12/17
 */
@Configuration
@ConfigurationProperties("hierarchy.graph")
@NoArgsConstructor
@Data
public class GraphProperties {
    private String url;
    private String username;
    private String password;
    private String realm;
    private Long pageSize;
}

package com.quechao.mobile.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties(prefix = "freemarker")
@Component
public class FreeMakerConfig {

    String template_loader_path;

}

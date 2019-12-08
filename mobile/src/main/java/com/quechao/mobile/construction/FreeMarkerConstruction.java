package com.quechao.mobile.construction;

import com.quechao.mobile.config.FreeMakerConfig;
import freemarker.cache.FileTemplateLoader;
import freemarker.cache.StringTemplateLoader;
import freemarker.cache.TemplateLoader;
import freemarker.template.Configuration;
import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.Reader;

@Component
public class FreeMarkerConstruction {

//    @Autowired
//    private FreeMakerConfig freeMakerConfig;

    public Configuration freeMakerConfig() {

        Configuration configuration = new Configuration(Configuration.getVersion());
        configuration.setDefaultEncoding("UTF-8");
        System.out.println(this.getClass().toString());
        configuration.setClassForTemplateLoading(this.getClass(), "/templates");
        return configuration;
    }

}

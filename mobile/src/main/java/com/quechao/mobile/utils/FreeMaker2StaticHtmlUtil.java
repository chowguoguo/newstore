package com.quechao.mobile.utils;

import com.quechao.mobile.construction.FreeMarkerConstruction;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.NotNull;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Component
public class FreeMaker2StaticHtmlUtil {

    @Autowired
    private FreeMarkerConstruction freeMarkerConstruction;

    public void makeHtml(Map<String, Object> contentMap, String sourceTemplate, File desPath) throws IOException, TemplateException {
        Template template = freeMarkerConstruction.freeMakerConfig().getTemplate(sourceTemplate);
        template.process(contentMap, new FileWriter(desPath));
    }


}

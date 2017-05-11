package org.javier.redis.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by jgabriele on 5/10/2017.
 */
public class SpringConfig extends WebMvcConfigurerAdapter {
    public static final String[] WEB_JAR_RESOURCE_PATTERNS = {"css/", "images/", "lib/"};
    public static final String WEB_JAR_RESOURCE_LOCATION = "classpath:META-INF/resources/";
    public static final String WEB_JAR_VIEW_RESOLVER_PREFIX = "classpath:/resources/";
    public static final String WEB_JAR_VIEW_RESOLVER_SUFFIX = ".jsp";

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

}

package org.javier.redis.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableWebMvc
@EnableSwagger2
public class SwaggerConfiguration {
    
	
	   @Bean
	   public Docket api() {
	      return new Docket(DocumentationType.SWAGGER_2)
	              .select()
	                .apis(RequestHandlerSelectors.any())
	                .paths(PathSelectors.any())
	                .build()
	              .apiInfo(metaData());
	   }


       private ApiInfo metaData() {
		   String myVersion = getClass().getPackage().getImplementationVersion();
    	   ApiInfo apiInfo = new ApiInfoBuilder()
    			   .title("Redis POC")
                   .description("Discharge Migration to MBH REST API Documentation")
                   .version(myVersion)
                   .build();
    	   
          return apiInfo;
       }
}

package mx.conacyt.cgtic.dashboard.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * <p>WebMvcConfig class.</p>
 *
 * @author gustavo arellano
 * @version $Id: $Id
 */
@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {

  /**
   * {@inheritDoc}
   */
  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {

    registry
        .addResourceHandler("swagger-ui.html")
        .addResourceLocations("classpath:/META-INF/resources/");

    registry
        .addResourceHandler("/webjars/**")
        .addResourceLocations("classpath:/META-INF/resources/webjars/");

    registry
        .addResourceHandler("/resources/**")
        .addResourceLocations("(/resources/");

    registry
        .addResourceHandler("index.html")
        .addResourceLocations("classpath:/static/");

    registry
        .addResourceHandler("Terms.html")
        .addResourceLocations("classpath:/static/Terms.html");

    registry
        .addResourceHandler("/css/**")
        .addResourceLocations("classpath:/static/css/");

    registry
        .addResourceHandler("/js/**")
        .addResourceLocations("classpath:/static/js/");

    registry
        .addResourceHandler("/fonts/**")
        .addResourceLocations("classpath:/static/fonts/");

    registry
        .addResourceHandler("/images/**")
        .addResourceLocations("classpath:/static/images/");

    registry
        .addResourceHandler("pouchdb.js")
        .addResourceLocations("classpath:/static/pouchdb.js");

    registry
        .addResourceHandler("/**")
        .addResourceLocations("classpath:/META-INF/resources/");

    registry
        .addResourceHandler("/")
        .addResourceLocations("classpath:/static/index.html");
  }

}

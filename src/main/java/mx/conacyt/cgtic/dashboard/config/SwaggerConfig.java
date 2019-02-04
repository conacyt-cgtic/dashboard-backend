package mx.conacyt.cgtic.dashboard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
  /**
   * <p>api.</p>
   *
   * @return a {@link springfox.documentation.spring.web.plugins.Docket} object.
   */
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build().apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "Ejemplito REST API", 
                "Servicios de backend en alta disponibilidad publicados por Spring", 
                "0.0.7-SNAPSHOT",
                "Terminos de servicio", 
                "gustavo.arellano@conacyt.mx", 
                "Licencia del API", 
                "https://www.apache.org/licenses/LICENSE-2.0");
        return apiInfo;
    }
}
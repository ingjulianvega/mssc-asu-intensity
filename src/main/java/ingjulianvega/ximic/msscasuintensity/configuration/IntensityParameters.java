package ingjulianvega.ximic.msscasuintensity.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "intensity")
public class IntensityParameters {

    private String api;
}

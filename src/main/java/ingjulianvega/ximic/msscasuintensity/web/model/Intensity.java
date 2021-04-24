package ingjulianvega.ximic.msscasuintensity.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Intensity implements Serializable {

    static final long serialVersionUID = 8572590842064316777L;

    private String name;

}

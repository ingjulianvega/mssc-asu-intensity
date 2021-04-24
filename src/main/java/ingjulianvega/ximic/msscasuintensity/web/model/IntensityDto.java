package ingjulianvega.ximic.msscasuintensity.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IntensityDto implements Serializable {

    static final long serialVersionUID = 1381824354983399294L;

    private UUID id;
    private String name;

}

package ingjulianvega.ximic.msscasuintensity.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IntensityList implements Serializable {

    static final long serialVersionUID = -6347883841692439083L;

    public ArrayList<IntensityDto> systemList;
}

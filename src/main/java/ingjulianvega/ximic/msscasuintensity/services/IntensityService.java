package ingjulianvega.ximic.msscasuintensity.services;


import ingjulianvega.ximic.msscasuintensity.web.model.Intensity;
import ingjulianvega.ximic.msscasuintensity.web.model.IntensityDto;
import ingjulianvega.ximic.msscasuintensity.web.model.IntensityList;

import java.util.UUID;

public interface IntensityService {
    IntensityList get();

    IntensityDto getById(UUID id);

    void create(Intensity intensity);

    void updateById(UUID id, Intensity intensity);

    void deleteById(UUID id);
}

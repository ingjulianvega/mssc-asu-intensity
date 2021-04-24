package ingjulianvega.ximic.msscasuintensity.web.Mappers;


import ingjulianvega.ximic.msscasuintensity.domain.IntensityEntity;
import ingjulianvega.ximic.msscasuintensity.web.model.IntensityDto;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper(uses = DateMapper.class)
public interface IntensityMapper {
    IntensityDto intensityEntityToIntensityDto(IntensityEntity intensityEntity);

    IntensityEntity intensityDtoToIntensityEntity(IntensityDto intensityDto);

    ArrayList<IntensityDto> intensityEntityListToIntensityDtoList(List<IntensityEntity> intensityEntityList);
}

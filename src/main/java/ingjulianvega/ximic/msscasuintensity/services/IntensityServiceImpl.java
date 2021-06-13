package ingjulianvega.ximic.msscasuintensity.services;

import ingjulianvega.ximic.msscasuintensity.configuration.ErrorCodeMessages;
import ingjulianvega.ximic.msscasuintensity.domain.IntensityEntity;
import ingjulianvega.ximic.msscasuintensity.domain.repositories.IntensityRepository;
import ingjulianvega.ximic.msscasuintensity.exception.IntensityException;
import ingjulianvega.ximic.msscasuintensity.web.Mappers.IntensityMapper;
import ingjulianvega.ximic.msscasuintensity.web.model.Intensity;
import ingjulianvega.ximic.msscasuintensity.web.model.IntensityDto;
import ingjulianvega.ximic.msscasuintensity.web.model.IntensityList;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@RequiredArgsConstructor
@Slf4j
@Service
public class IntensityServiceImpl implements IntensityService {

    private final IntensityRepository intensityRepository;
    private final IntensityMapper intensityMapper;

    @Cacheable(cacheNames = "intensityListCache", condition = "#usingCache == false")
    @Override
    public IntensityList get(Boolean usingCache) {
        log.debug("get()...");
        return IntensityList
                .builder()
                .systemList(intensityMapper.intensityEntityListToIntensityDtoList(intensityRepository.findAllByOrderByName()))
                .build();
    }

    @Cacheable(cacheNames = "intensityCache")
    @Override
    public IntensityDto getById(UUID id) {
        log.debug("getById()...");
        return intensityMapper.intensityEntityToIntensityDto(
                intensityRepository.findById(id)
                        .orElseThrow(() -> new IntensityException(ErrorCodeMessages.INTENSITY_NOT_FOUND, "")));
    }

    @Override
    public void create(Intensity intensity) {
        log.debug("create()...");
        intensityMapper.intensityEntityToIntensityDto(
                intensityRepository.save(
                        intensityMapper.intensityDtoToIntensityEntity(
                                IntensityDto
                                        .builder()
                                        .name(intensity.getName())
                                        .build())));
    }

    @Override
    public void updateById(UUID id, Intensity intensity) {
        log.debug("updateById...");
        IntensityEntity evidenceEntity = intensityRepository.findById(id)
                .orElseThrow(() -> new IntensityException(ErrorCodeMessages.INTENSITY_NOT_FOUND, ""));

        evidenceEntity.setName(intensity.getName());

        intensityRepository.save(evidenceEntity);
    }

    @Override
    public void deleteById(UUID id) {
        log.debug("deleteById...");
        intensityRepository.deleteById(id);
    }
}

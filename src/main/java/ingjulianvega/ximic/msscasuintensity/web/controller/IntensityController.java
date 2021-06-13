package ingjulianvega.ximic.msscasuintensity.web.controller;


import ingjulianvega.ximic.msscasuintensity.services.IntensityService;
import ingjulianvega.ximic.msscasuintensity.web.model.Intensity;
import ingjulianvega.ximic.msscasuintensity.web.model.IntensityDto;
import ingjulianvega.ximic.msscasuintensity.web.model.IntensityList;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class IntensityController implements IntensityI {

    private final IntensityService intensityService;

    @Override
    public ResponseEntity<IntensityList> get(Boolean usingCache) {
        return new ResponseEntity<>(intensityService.get(usingCache), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<IntensityDto> getById(@NotNull UUID id) {
        return new ResponseEntity<>(intensityService.getById(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> create(@NotNull @Valid Intensity intensity) {
        intensityService.create(intensity);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Void> updateById(@NotNull UUID id, @NotNull @Valid Intensity intensity) {
        intensityService.updateById(id, intensity);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @Override
    public ResponseEntity<Void> deleteById(@NotNull UUID id) {
        intensityService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

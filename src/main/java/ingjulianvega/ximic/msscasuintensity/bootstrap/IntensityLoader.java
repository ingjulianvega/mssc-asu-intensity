package ingjulianvega.ximic.msscasuintensity.bootstrap;

import ingjulianvega.ximic.msscasuintensity.domain.IntensityEntity;
import ingjulianvega.ximic.msscasuintensity.domain.repositories.IntensityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@RequiredArgsConstructor
@Component
public class IntensityLoader implements CommandLineRunner {

    private final IntensityRepository intensityRepository;

    @Override
    public void run(String... args) throws Exception {
        if (intensityRepository.count() == 0) {
            loadIntensityObjects();
        }
    }

    private void loadIntensityObjects() {
        intensityRepository.saveAll(Arrays.asList(
                IntensityEntity.builder().name("Dia").build(),
                IntensityEntity.builder().name("Noche").build(),
                IntensityEntity.builder().name("Despues de comer").build(),
                IntensityEntity.builder().name("Sentado").build(),
                IntensityEntity.builder().name("Acostado").build()
        ));
    }
}
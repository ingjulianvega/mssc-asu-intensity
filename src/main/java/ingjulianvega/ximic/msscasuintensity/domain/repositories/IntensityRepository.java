package ingjulianvega.ximic.msscasuintensity.domain.repositories;

import ingjulianvega.ximic.msscasuintensity.domain.IntensityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface IntensityRepository extends JpaRepository<IntensityEntity, UUID>, JpaSpecificationExecutor<IntensityEntity> {
}

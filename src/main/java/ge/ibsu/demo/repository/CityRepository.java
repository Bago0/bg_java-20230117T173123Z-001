package ge.ibsu.demo.repository;

import ge.ibsu.demo.entity.City;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CityRepository extends JpaRepository<City, Long> {
    @Query(value = "SELECT * FROM public.city")
    Slice<City> search( @Param("cityName") String cityName, Pageable pageable);


}

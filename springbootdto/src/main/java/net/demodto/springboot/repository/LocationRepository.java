package net.demodto.springboot.repository;

import net.demodto.springboot.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Srishti
 * @created 2/11/2023: 8:35 PM
 */
public interface LocationRepository extends JpaRepository<Location, Long> {
}

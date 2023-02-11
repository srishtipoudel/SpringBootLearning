package net.demodto.springboot.repository;

import net.demodto.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Srishti
 * @created 2/11/2023: 8:34 PM
 */
public interface UserRepository extends JpaRepository<User, Long> {
}

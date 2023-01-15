package ro.mycode.managegymsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.mycode.managegymsystem.model.Gym;

@Repository
public interface GymRepository extends JpaRepository<Gym,Long> {
}

package pl.lewandowski.circlecispringexample;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoCourseRepository extends JpaRepository<VideoCourse, Long> {
}

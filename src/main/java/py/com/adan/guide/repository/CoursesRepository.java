package py.com.adan.guide.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import py.com.adan.guide.entity.Courses;
@Repository
public interface CoursesRepository extends JpaRepository<Courses, Long> {
}

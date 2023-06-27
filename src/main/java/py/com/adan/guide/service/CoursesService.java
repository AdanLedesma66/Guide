package py.com.adan.guide.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import py.com.adan.guide.entity.Courses;
import py.com.adan.guide.repository.CoursesRepository;

import java.util.List;

@Service
public class CoursesService {

  @Autowired
  private CoursesRepository coursesRepository;

  public List<Courses> findAll(){
    return coursesRepository.findAll();
  }

  public Courses findBy(Long id){
    return coursesRepository.findById(id).orElse(null);
  }

  public Courses save(Courses courses){
    return coursesRepository.save(courses);
  }

}

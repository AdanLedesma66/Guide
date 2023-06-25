package py.com.adan.guide.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import py.com.adan.guide.repository.CoursesRepository;
@Service
public class CoursesService {

  @Autowired
  private CoursesRepository coursesRepository;


}

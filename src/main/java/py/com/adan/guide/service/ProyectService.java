package py.com.adan.guide.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import py.com.adan.guide.entity.Proyects;
import py.com.adan.guide.repository.ProyectsRepository;

import java.util.List;

@Service
public class ProyectService {

  @Autowired
  private ProyectsRepository proyectsRepository;

  public List<Proyects> findAll(){
    return proyectsRepository.findAll();
  }

  public Proyects findById(Long id){
    return proyectsRepository.findById(id).orElse(null);
  }
  public Proyects save(Proyects proyects){
    return proyectsRepository.save(proyects);
  }
}

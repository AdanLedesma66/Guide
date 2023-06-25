package py.com.adan.guide.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/guide/proyects")
public class ProyectEndpoint {

  @GetMapping
  public ResponseEntity list(){
    return null;
  }

  @GetMapping("/{id}")
  public ResponseEntity find(){
    return null;
  }

  @PostMapping
  public ResponseEntity insert(){
    return null;
  }

  @PutMapping("/{id}")
  public ResponseEntity update(){
    return null;
  }

  @DeleteMapping("/{id}")
  public ResponseEntity delete(){
    return null;
  }
}

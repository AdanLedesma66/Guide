package py.com.adan.guide.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "proyect")
public class Proyects {

  // ::: vars
  //

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "Proyect")
  private String proyect;

  @Column(name = "Description")
  private String description;

  @Column(name = "Duration")
  @Temporal(TemporalType.TIME)
  private Date duration;

  @Column(name = "Start")
  @Temporal(TemporalType.DATE)
  private Date start;

  @Column(name = "Finished")
  @Temporal(TemporalType.DATE)
  private Date finished;

  @Column(name = "Completed")
  private Boolean completed;

  // ::: constructor
  //

  public Proyects() {
  }

  public Proyects(Long id, String proyect, String description, Date duration, Date start, Date finished, Boolean completed) {
    this.id = id;
    this.proyect = proyect;
    this.description = description;
    this.duration = duration;
    this.start = start;
    this.finished = finished;
    this.completed = completed;
  }

  // ::: fields
  //

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getProyect() {
    return proyect;
  }

  public void setProyect(String proyect) {
    this.proyect = proyect;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Date getDuration() {
    return duration;
  }

  public void setDuration(Date duration) {
    this.duration = duration;
  }

  public Date getStart() {
    return start;
  }

  public void setStart(Date start) {
    this.start = start;
  }

  public Date getFinished() {
    return finished;
  }

  public void setFinished(Date finished) {
    this.finished = finished;
  }

  public Boolean getCompleted() {
    return completed;
  }

  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }
}

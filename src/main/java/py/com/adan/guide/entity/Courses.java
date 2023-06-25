package py.com.adan.guide.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "course")
public class Courses {

  // ::: vars
  //

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "Course")
  private String course;

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

  public Courses() {
  }

  public Courses(Long id, String course, String description, Date duration, Date start, Date finished, Boolean completed) {
    this.id = id;
    this.course = course;
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

  public String getCourse() {
    return course;
  }

  public void setCourse(String course) {
    this.course = course;
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

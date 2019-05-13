package com.trainee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Student_Parents")
public class StudentParents {

  @Column(name = "student_id")
  private int studentId;

  @Column(name = "parent_id")
  private int parentId;
}

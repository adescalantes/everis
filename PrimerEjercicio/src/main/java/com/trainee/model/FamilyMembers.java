package com.trainee.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Family_Members")
public class FamilyMembers {

  private int id;

  private int familyId;

  private int parentId;
  private int studentId;

}

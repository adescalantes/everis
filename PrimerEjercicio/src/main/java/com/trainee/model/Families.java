package com.trainee.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Families")
public class Families {

  @GeneratedValue
  @Id
  @Column(name = "family_id")
  private int id;

  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "head_of_family_parent_id", referencedColumnName = "parent_id")
  private int headOfFamilyParentId;

  @Column(name = "family_name")
  private String familyName;
}

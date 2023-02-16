package me.intvw.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * @author Oleksandr Pavliuk
 */
@Entity
public class Topic {

  @Id
  @GeneratedValue(generator = "uuid")
  private String id;
}

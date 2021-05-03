package dev.ryaryu;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "modulo")
public class Modulo extends PanacheEntity {

  public String nome;

}

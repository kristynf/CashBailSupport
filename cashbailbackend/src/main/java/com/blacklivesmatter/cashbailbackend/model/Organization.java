package com.blacklivesmatter.cashbailbackend.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Entity
public class Organization {

    @Id
    int id;
    String Name;


}

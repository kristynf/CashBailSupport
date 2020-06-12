package com.blacklivesmatter.cashbailbackend.model;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@Entity
public class Donor {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    int id;

    String email;
    @Embedded
    Address address;

}

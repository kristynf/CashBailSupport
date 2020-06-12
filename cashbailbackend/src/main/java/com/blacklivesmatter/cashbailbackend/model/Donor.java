package com.blacklivesmatter.cashbailbackend.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

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

    @OneToMany(targetEntity = Donation.class)
    List<Donation> donationsMade;
}

package com.blacklivesmatter.cashbailbackend.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@Entity
public class Cause {

    @Id
    int id;
    String description;
    BigDecimal amountRequired;
    BigDecimal amountRecieved;
    Organization associatedOrganization;

    @OneToMany(targetEntity = Donation.class)
    List<Donation> donations;

}

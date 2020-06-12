package com.blacklivesmatter.cashbailbackend.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@Entity
public class Donation {

    @ManyToOne(targetEntity = Donor.class)
    Donor donor;
    BigDecimal amount;
    @ManyToOne(targetEntity = Organization.class)
    Organization organization;
    @ManyToOne(targetEntity = Cause.class)
    Cause cause;



}

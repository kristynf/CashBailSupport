package com.blacklivesmatter.cashbailbackend.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@Entity
public class Donation {

    @Id
    private  int id;
    @ManyToOne(targetEntity = Donor.class)
    private Donor donor;
    private BigDecimal amount;
    @ManyToOne(targetEntity = Organization.class)
    private Organization organization;
    @ManyToOne(targetEntity = Cause.class)
    private Cause cause;



}

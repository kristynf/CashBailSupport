package com.blacklivesmatter.cashbailbackend.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
    BigDecimal amountReceived;
    LocalDate dateOpened;
    @ManyToOne
    Organization associatedOrganization;

    @OneToMany(targetEntity = Donation.class)
    List<Donation> donations;

}

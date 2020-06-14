package com.blacklivesmatter.cashbailbackend.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@Entity
public class Cause {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    private BigDecimal amountRequired;
    private BigDecimal amountReceived;
    private Instant dateOpened;


    @OneToMany(targetEntity = Donation.class)
    List<Donation> donations;

}

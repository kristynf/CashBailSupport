package com.blacklivesmatter.cashbailbackend.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@Entity
public class Donation {

    @Id
    private  long id;

    @NotBlank
    private BigDecimal amount;

    @NotBlank
    @ManyToOne(targetEntity = AppUser.class)
    private AppUser user;

    @NotBlank
    @ManyToOne(targetEntity = Cause.class)
    private Cause cause;



}

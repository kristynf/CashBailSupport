package com.blacklivesmatter.cashbailbackend.model;

import lombok.*;
import org.springframework.boot.autoconfigure.web.ConditionalOnEnabledResourceChain;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

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
    @Embedded
    Address address;
    @OneToMany(targetEntity = Cause.class)
    List<Cause> causes;


}

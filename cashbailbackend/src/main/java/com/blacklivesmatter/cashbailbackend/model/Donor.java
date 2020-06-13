package com.blacklivesmatter.cashbailbackend.model;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;
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
    private int id;

    @NotBlank(message = "must include firstName")
    private String firstName;
    @NotBlank(message = "must include lastName")
    private String lastName;
    @NotBlank(message = "must incliude userName")
    private String userName;
    @NotBlank(message = "must include email")
    private String email;
    @NotBlank(message= "must include password")
    private String password;
    private boolean enabled;
    private LocalDate created;

    @Embedded
    Address address;

    @OneToMany(targetEntity = Donation.class)
    List<Donation> donationsMade;


    @Override
    public String toString() {
        return "Donor{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", address=" + address +
                '}';
    }
}

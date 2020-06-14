package com.blacklivesmatter.cashbailbackend.service;

import com.blacklivesmatter.cashbailbackend.enums.Role;
import com.blacklivesmatter.cashbailbackend.model.AppUser;
import com.blacklivesmatter.cashbailbackend.model.Cause;
import com.blacklivesmatter.cashbailbackend.model.Donation;
import com.blacklivesmatter.cashbailbackend.repository.CauseRepository;
import com.blacklivesmatter.cashbailbackend.repository.DonationRepository;
import com.blacklivesmatter.cashbailbackend.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.apache.catalina.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@SpringBootTest
@AllArgsConstructor
public class DonationServiceTests {


    private final DonationService donationService;
    private final AuthService authService;
    private final CauseService causeService;

    private Donation cause1Donation1;
    private Donation cause1Donation2;
    private Donation cause2Donation1;
    private Cause cause1;
    private Cause cause2;
    private AppUser donationUser;

    @BeforeEach
    public void setUp() throws Exception{

        List<Donation> donations = donationService.findAllDonations();
        donations.forEach(donationService::deleteDonation);


        cause1 = new Cause();
        cause1.setAmountRequired(new BigDecimal("100.00"));
        cause1.setDateOpened(Instant.now());
        cause1.setDescription("John Owes parking ticket fines. Lets's get him out.");

        cause2 = new Cause();
        cause2.setAmountRequired(new BigDecimal("100.00"));
        cause2.setDateOpened(Instant.now());
        cause2.setDescription("Adam Owes parking ticket fines. Lets's get him out.");

        donationUser = new AppUser();
        donationUser.setRole(Role.DONOR);
        donationUser.setFirstName("John");
        donationUser.setLastName("Doe");
        donationUser.setPassword("password");
        donationUser.setUsername("johndoe");
        donationUser.setEmail("john.doe@gmail.com");

        cause1Donation1 = new Donation();
        cause1Donation1.setAmount(new BigDecimal("5.00"));
        cause1Donation1.setCause(cause1);
        cause1Donation1.setUser(donationUser);

        cause1Donation2 = new Donation();
        cause1Donation2.setAmount(new BigDecimal("95.00"));
        cause1Donation2.setUser(donationUser);
        cause1Donation2.setCause(cause1);

        cause2Donation1 = new Donation();
        cause2Donation1.setAmount( new BigDecimal("6.00"));
        cause2Donation1.setCause(cause2);
        cause2Donation1.setUser(donationUser);





    }

    @Test
    public void shouldProvideCorrectTotalForCauseDonations(){

    }


}

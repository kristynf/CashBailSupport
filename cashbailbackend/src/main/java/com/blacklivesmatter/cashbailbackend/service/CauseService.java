package com.blacklivesmatter.cashbailbackend.service;

import com.blacklivesmatter.cashbailbackend.model.Cause;
import com.blacklivesmatter.cashbailbackend.repository.CauseRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@AllArgsConstructor
@Transactional
public class CauseService {

    private CauseRepository causeRepository;

    //TODO -- Need to make sure when cause is pull total amount donated is set via Donation Service method


    public Cause saveCause(Cause cause){
        Optional<Cause> potentialDupe = causeRepository.findById(cause.getId());
        if(potentialDupe.isPresent())
            throw new IllegalArgumentException("Cause Already Exists");

        return causeRepository.save(cause);
    }

    public void deleteCause(Cause cause){

    }

    public void updateCause(Cause cause){

    }

    public Cause getCause(Cause cause){
        return new Cause();
    }



}

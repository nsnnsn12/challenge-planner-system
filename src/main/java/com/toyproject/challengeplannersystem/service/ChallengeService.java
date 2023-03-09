package com.toyproject.challengeplannersystem.service;

import com.toyproject.challengeplannersystem.dto.ChallengeDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChallengeService {

    public List<ChallengeDto> getChallenges() {
        List<ChallengeDto> result = new ArrayList<>();
        return result;
    }
}

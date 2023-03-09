package com.toyproject.challengeplannersystem.controller;

import com.toyproject.challengeplannersystem.dto.ChallengeDto;
import com.toyproject.challengeplannersystem.service.ChallengeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("challenges")
@Tag(name = "challenge", description = "the challenge API")
public class ChallengeController {
    @Autowired
    ChallengeService challengeService;

    @GetMapping("/")
    @Operation(summary = "get Challenges", description = "Get Challenges")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = ChallengeDto.class)) }),
            @ApiResponse(responseCode = "405", description = "Invalid input")
    })
    public ResponseEntity getChallenges(){
        return new ResponseEntity<>(challengeService.getChallenges(), HttpStatus.OK);
    }
}

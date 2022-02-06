package com.ensa.serviceclient.entities;

import com.ensa.serviceclient.enums.transfertService.EmissionType;

import java.time.LocalDateTime;

public class Emission {


    private Long id;
    private Transfer transfer;
    private Long agent;
    private  Long agence;
    private EmissionType emissionType; //By Agent - By Gab
    private LocalDateTime emissionDate;
}

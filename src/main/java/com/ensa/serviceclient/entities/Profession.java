package com.ensa.serviceclient.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Profession {
    ETUDIANT("etudiant");
    private String abreviation;
}

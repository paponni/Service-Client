package com.ensa.serviceclient.entities;

/*
* enumeration des titres supporter
* MME pour madame
* MR pour monsieur.
* */

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Civilite {

    MADAME("MME"), MONSIEUR("MR");

    private String abreviation;
}

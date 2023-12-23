package com.example.Client2.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Voiture {

    @Id
    @GeneratedValue
    private Long id;

    private String marque;
    private String matricule;
    private String model;

    private Long clientId;

    @Transient
    @ManyToOne
    private Client client;

    public void setClientId(Long clientId) {
        this.clientId=clientId;
    }
}


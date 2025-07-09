package ma.bankatiii.cih.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class reclamation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    // Liste des Attributs
    // Constructeur
    // Getters & Setters

}

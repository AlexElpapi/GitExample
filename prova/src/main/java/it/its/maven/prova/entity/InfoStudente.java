package it.its.maven.prova.entity;



import jakarta.persistence.*;

import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "info_studenti")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InfoStudente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cognome;
    private int eta;
    private String sesso;
    private String lavoro;
    private String statoCivile;
    private String hobby;
}
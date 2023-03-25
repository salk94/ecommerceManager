package com.tms.ecommerceManager.Model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "Articoli")
public class Articoli {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "codice_mexal", nullable = false)
    private String codice_mexal;

    @Column(name = "tipologia", nullable = false)
    private String tipologia;

    @Column(name = "descrizione", nullable = false)
    private String descrizione;

    @Column(name = "descrizione_estesa", nullable = false)
    private String descrizione_estesa;

    @Column(name = "descrizione_aggiuntiva")
    private String descrizione_aggiuntiva;

    @Column(name = "codice_alternativo")
    private String codice_alternativo;

    @Column(name = "codice_gruppo_merceologico", nullable = false)
    private String codice_gruppo_merceologico;

    @Column(name = "prezzo_listino", nullable = false)
    private String prezzo_listino;

    @Column(name = "prezzo_listino", nullable = false)
    private String prova;

}
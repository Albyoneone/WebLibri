package com.example.WebLibri.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Libri {

    @Id
    @GeneratedValue
    Long id;
    @NotNull
    @Size(min = 1, max = 40)
    private String titolo;
    @NotNull
    @Size(min = 1, max = 40)
    private String autore;
    @NotNull
    @Min(1900)
    private Integer annoPubblicazione;
    @NotNull
    @Min(1)
    private Integer prezzo;
    public static List<Libri> libri = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "User_id")
    private User user;

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public Integer getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(Integer annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public Integer getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Integer prezzo) {
        this.prezzo = prezzo;
    }
}

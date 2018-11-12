package fr.andrew.pizzeria.pizzeria.domain;

import javax.persistence.*;

@Entity(name="pizza")
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="libelle")
    private String libelle;
    @Column(name="reference")
    private String reference;
    @Column(name="prix")
    private Integer prix;
    @Column(name="url_image")
    private String urlImage;

    public Pizza() {
    }

    public Pizza(Integer id, String libelle, String reference, Integer prix, String urlImage) {
        this.id = id;
        this.libelle = libelle;
        this.reference = reference;
        this.prix = prix;
        this.urlImage = urlImage;
    }


    //GETTER & SETTER

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}


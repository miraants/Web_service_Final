package webservice.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class Param {
    Manao_enchere enchere;
    Sary[] photo;

    public Param() {
    }

    public Param(Manao_enchere enchere, Sary[] photo) {
        this.enchere = enchere;
        this.photo = photo;
    }

    public Manao_enchere getEnchere() {
        return enchere;
    }

    public void setEnchere(Manao_enchere enchere) {
        this.enchere = enchere;
    }

    public Sary[] getPhoto() {
        return photo;
    }

    public void setPhoto(Sary[] photo) {
        this.photo = photo;
    }
}

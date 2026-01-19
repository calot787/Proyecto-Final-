package com.letrana.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "codigodigital")
public class CodigoDigital {
    private Long codigo;
    private String enlace;
    private String claveSeguridad;
    private String formato;
}

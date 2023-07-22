package page.med.Proyect_2springbootJava;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    private Integer id;
    private String Nombre;
    private String Apellido;
    private String id_cedula_usuario;
    private Integer Edad;
    private String Telefono;
}


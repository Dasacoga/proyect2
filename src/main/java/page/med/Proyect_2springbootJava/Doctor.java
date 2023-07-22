package page.med.Proyect_2springbootJava;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    private Integer id;
    private String nombre_doctor;
    private String Apellido_doctor;
    private String Especialidad;
    private Integer consultorio;
    private String correo_de_contacto;
}


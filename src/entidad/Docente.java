package entidad;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Docente {
	
	private  int idDocente;
	private String nombre;
	private String apellido;
	private String sexo;
	private String fechaNacimiento;
	private String dni;

}

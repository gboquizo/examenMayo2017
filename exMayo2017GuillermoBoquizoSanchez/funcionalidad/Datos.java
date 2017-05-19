package exMayo2017GuillermoBoquizoSanchez.funcionalidad;

import java.time.LocalDate;

/**
 * Estructura a tratar
 * 
 * @author MaríaLourdes
 *
 */
public class Datos {
	/**
	 * Fecha
	 */
	private LocalDate localDate;
	/**
	 * Nombre del alumno
	 */
	private String nombre;
	/**
	 * Elemento a almacenar en el sistema de ficheros
	 */
	static  String GUILLERMO_BOQUIZO_SANCHEZ = "Guillermo Boquizo Sánchez";

	/**
	 * @return the localDate
	 */
	public LocalDate getLocalDate() {
		return localDate;
	}

	/**
	 * @param localDate
	 *            the localDate to set
	 */
	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Datos(LocalDate localDate, String nombre) {
		super();
		this.localDate = localDate;
		this.nombre = nombre;
	}
}

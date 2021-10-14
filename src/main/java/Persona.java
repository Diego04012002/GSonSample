
public class Persona {

	private String nombre;
	private String apellidos;
	private int edad;

	public Persona() {
	}
	
	public Persona(String Nombre, String Apellidos, int Edad) {
		this.apellidos = Apellidos;
		this.nombre = Nombre;
		this.edad = Edad;
	}
	
	public boolean contieneSoloLetras(String numeroTexto) {
	    for (int x = 0; x < numeroTexto.length(); x++) {
	        char c = numeroTexto.charAt(x);
	        if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) {
	            return false;
	        }
	    }
	    return true;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}

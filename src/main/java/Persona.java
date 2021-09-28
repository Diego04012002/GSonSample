
public class Persona {

	public String Nombre;
	public String Apellidos;
	public int Edad;

	public Persona() {
	}
	
	public Persona(String Nombre, String Apellidos, int Edad) {
		this.Apellidos = Apellidos;
		this.Nombre = Nombre;
		this.Edad = Edad;
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
		return Nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public int getEdad() {
		return Edad;
	}
}

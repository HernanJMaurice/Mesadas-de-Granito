package mesadaspackage;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		ArchivosConstructora arch = new ArchivosConstructora();
		Constructora construc = new Constructora();
		arch.grabarArchivo(construc.resolver(arch.leerArchivo("C:\\Users\\H\\Desktop\\Progra Avan\\Proyectos\\Mesada de Granito\\Archivos")));
	}

}

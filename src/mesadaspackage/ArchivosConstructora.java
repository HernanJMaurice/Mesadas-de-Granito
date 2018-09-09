package mesadaspackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ArchivosConstructora {
	
	private String path;
	
	public Mesada[] leerArchivo(String path) throws FileNotFoundException {
		this.path= path;
		File archivo = new File(this.path + "\\mesada1.in");
		Scanner sc = new Scanner(archivo);
		
		Mesada [] mesadas = new Mesada[sc.nextInt()];
		
		for(int i=0; i<mesadas.length;i++) {
			mesadas[i] = new Mesada(sc.nextInt() , sc.nextInt());
		}
		
		sc.close();
		
		return mesadas;
	}
	
	public void grabarArchivo(int numero) throws IOException {
		FileWriter archivo = new FileWriter(this.path + "\\mesadas.out");
		PrintWriter salida = new PrintWriter(archivo);
		salida.println(numero);
		salida.close();
	}
}

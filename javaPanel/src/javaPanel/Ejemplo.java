package javaPanel;

import java.io.IOException;

public class Ejemplo {

	public static void main(String[] args) throws IOException {
		
		
		/* Se crea la ventana */
		Panel panel = new Panel();		
		
		/*Se usa este metodo para ponber un texto al inicio de la ventana*/
		panel.setLabelText("Aqui puede ir una descripción del programa");
		
		/*Se usa este metodo para poner los eventos en la ventana*/
		panel.logText("Aqui se ponen los eventos que van sucediendo");
		panel.logText("Otro ejemplo de un evento");
		
		/*Este metodo crea un archivo y va agregando lo que quieras, sirve como un historial*/
		/*El archivo se crea en la misma carpeta en donde se ejecuta el programa*/
		panel.LogWriter("copia de archivos hecha");
		panel.LogWriter("tranformación de archivos relaizada con exito");
		panel.LogWriter("Error critico - no se encuentran archivos");
		
	}

}

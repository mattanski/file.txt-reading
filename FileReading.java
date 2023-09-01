package TutorialTrentOtto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;

	
/* TUTORIAL 38 - LAVORARE CON I FILE
 * 
 *   Verificare se file esiste nel progetto o nel computer
 *   
 *   getPath,	getAbsolutePath,	isFile
 *   eliminare file
 *   
 *   scrivere in un file FileWriter: write e append
 *   
 *   leggere un file con filereader
 * 
 *
 * 
 */



public class FileReading {
		public static void main(String[]args) {
			

			 File file = new File ("prova.txt");	
			 
			
			if(file.exists()) {
				System.out.println("Il file esiste");
				System.out.println(file.getPath());
				System.out.println(file.getAbsolutePath());
				System.out.println(file.isFile());
				file.delete();				
			}else {
				System.out.println("Il file non esiste");
			}
			

//------------------------------------------------------------> se il file è nel nostro folder di eclipse
			
			
/*
			File file = new File ("D:\\DESKTOP\\proova.txt");		
			if(file.exists()) {
				System.out.print("Il file esiste");
			}else {
				System.out.print("Il file non esiste");
			}			
*/
//-----------------------------------------------------------------------> se il file è nel nostro PC
			
			
/*
			try {
				
				FileWriter writer = new FileWriter("prova.txt");
				writer.write("Java è un OPO OBJECT PROGRAMMING ORIENTED\n questo corso ti distrugge\n");
				writer.append("Questa funzione fa inserire un altra riga al file di testo");
				writer.close();

				
			}catch(IOException e){
				e.printStackTrace();
				
			}
*/
//------------------------------------------------------------------------>se il file non te lo trova lo va a creare

			
			
			try {
				FileReader reader = new FileReader ("prova.txt");
				int data = reader.read();
				
				while(data!= -1) {
					System.out.print((char)data);
						data = reader.read();
					}
			
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
			//---------------------------------------------> il file viene letto carattere per carattere e facendo (char)data
			//--------------------------------------------->viene convertito da CODICE ASCII A CARATTERE 	
				
			
				
				
			
			
			
			
			
			
	}
}




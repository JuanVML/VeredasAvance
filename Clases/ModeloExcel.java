
package Clases;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;

public class ModeloExcel {
    public String Importar(File archivo){
        String mensaje = "Error en la Importación";

        try{
            Workbook book = WorkbookFactory.create(new FileInputStream(archivo));
            // Resto del código para importar y procesar el archivo Excel según tus necesidades
            // ...
            
            mensaje = "Importación Exitosa";
        } catch (Exception e){
            // Manejo de errores
            e.printStackTrace(); 
        }
        
        return mensaje;
    }
    

}


package Clases;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import javax.swing.JOptionPane;

public class Plantilla {
    String nombrePaciente;
    String fecha;
    String rutaimagen;
    List<Persona> personas;
    
    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;

    public Plantilla(String nombrePaciente, String fecha, String rutaimagen, List<Persona> personas) {
        this.nombrePaciente = nombrePaciente;
        this.fecha = fecha;
        this.rutaimagen = rutaimagen;
        this.personas = personas;
        documento = new Document();
        titulo = new Paragraph("Plantilla Personalizada");
    }
    
    public void crearPlantilla() throws FileNotFoundException, DocumentException{
        try{
            archivo  =  new FileOutputStream(nombrePaciente + ".pdf");
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            titulo.setAlignment(1);
            Image image = null;
            try{
                image =  Image.getInstance(rutaimagen);
                image.scaleAbsolute(150,100);
                image.setAbsolutePosition(415, 750);
            }catch (Exception e){
        }
        documento.add(image);
        documento.add(titulo);
        documento.add(new Paragraph("Usuario:  "+nombrePaciente) );
        documento.add(Chunk.NEWLINE);
        Paragraph texto = new Paragraph("Querido usuario se a generado su cita"
                + " correctamente, verifique sus datos ");
        texto.setAlignment(Element.ALIGN_JUSTIFIED);
        documento.add(texto);
         documento.add(Chunk.NEWLINE);
         PdfPTable tabla = new PdfPTable(4);
         tabla.setWidthPercentage(100);
         PdfPCell dni = new PdfPCell(new Phrase ("DNI"));
         dni.setBackgroundColor(BaseColor.ORANGE);
         PdfPCell nom = new PdfPCell(new Phrase ("NOMBRE"));
         nom.setBackgroundColor(BaseColor.ORANGE);
         PdfPCell ape  = new PdfPCell(new Phrase ("APELLIDOS"));
         ape.setBackgroundColor(BaseColor.ORANGE);
         PdfPCell hora  = new PdfPCell(new Phrase ("HORARIO"));
         ape.setBackgroundColor(BaseColor.ORANGE);
        tabla.addCell(dni);
        tabla.addCell(nom);
        tabla.addCell(ape);
        tabla.addCell(hora);        
        for(Persona persona: this.personas){
           tabla.addCell(persona.getNombre());
           tabla.addCell(persona.getDNI()+"");
           tabla.addCell(persona.getNombre()+"");
           tabla.addCell(persona.getApellido()+"");
           tabla.addCell(persona.getHorario()+"");
        }
        documento.add(tabla);
        documento.add(new Paragraph ("Fecha: " + fecha));
        
        documento.close();
        JOptionPane.showMessageDialog(null, "El arcchivo PDF se a creado correctamente ");
            
        }catch (FileNotFoundException e){
            System.err.println(e.getMessage());
        }catch(DocumentException e) {
             System.err.println(e.getMessage());
        }
    
}
}

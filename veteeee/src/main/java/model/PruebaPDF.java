/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

import java.io.FileOutputStream;
import javax.swing.JTable;
/**
 *
 * @author gabriel
 */
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import javax.swing.JTable;

/**
 * La clase PruebaPDF proporciona métodos para crear archivos PDF con información específica o tablas a partir de una JTable.
 */
public class PruebaPDF {

    /**
     * Crea un archivo PDF con información específica de un animal.
     *
     * @param nombre Nombre del animal.
     * @param id Identificador del animal.
     * @param especie Especie del animal.
     * @param edad Edad del animal.
     * @param raza Raza del animal.
     * @param fechaIngreso Fecha de ingreso del animal.
     * @param texto Texto adicional para la historia del animal.
     */
    public static void crearHistoria(String nombre, String id, String especie, String edad, String raza, String fechaIngreso, String texto) {
        try {
            Document doc = new Document();
            PdfWriter.getInstance(doc, new FileOutputStream("post.pdf"));
            doc.open();

            Font titleFont = FontFactory.getFont(BaseFont.TIMES_BOLD, 15, BaseColor.RED);
            Font bodyFont = FontFactory.getFont(BaseFont.HELVETICA, 12, BaseColor.BLACK);
            Font cuerpo = FontFactory.getFont(BaseFont.HELVETICA_BOLD, 9, BaseColor.BLACK);

            Paragraph nombre1 = new Paragraph(nombre, titleFont);
            Paragraph id1 = new Paragraph(id, cuerpo);
            Paragraph especie1 = new Paragraph(especie, cuerpo);
            Paragraph edad1 = new Paragraph(edad, cuerpo);
            Paragraph raza1 = new Paragraph(raza, cuerpo);
            Paragraph fecha = new Paragraph(fechaIngreso, cuerpo);
            Paragraph body = new Paragraph(texto, bodyFont);

            doc.add(nombre1);
            doc.add(id1);
            doc.add(especie1);
            doc.add(edad1);
            doc.add(raza1);
            doc.add(fecha);
            doc.add(body);

            doc.close();

        } catch (DocumentException | java.io.FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Crea un archivo PDF con una tabla a partir de los datos de una JTable.
     *
     * @param swTable JTable con los datos para la tabla PDF.
     */
    public static void crearTabla(JTable swTable) {
        try {
            Document doc = new Document();
            PdfWriter.getInstance(doc, new FileOutputStream("tabla.pdf"));
            doc.open();
            PdfPTable tabla = new PdfPTable(swTable.getColumnCount());
            for (int i = 0; i < swTable.getColumnCount(); i++) {
                tabla.addCell(swTable.getColumnName(i));
            }
            for (int x = 0; x < swTable.getRowCount(); x++) {
                for (int y = 0; y < swTable.getColumnCount(); y++) {
                    String valor = (swTable.getValueAt(x, y) != null) ? swTable.getValueAt(x, y).toString() : "";
                    tabla.addCell(valor);
                }
            }
            doc.add(tabla);
            doc.close();

        } catch (DocumentException | java.io.FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}


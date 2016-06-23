/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.intecap.veterinaria.util;

import co.edu.intecap.veterinaria.negocio.mascotas.Gato;
import co.edu.intecap.veterinaria.negocio.mascotas.Perro;
import java.awt.Color;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author capacitaciones
 */
public class Utilidad {

    private static final String RUTA_ARCHIVO = "C:/archivo_veterinaria/";

    private static void validarRuta() {
        File directorio = new File(RUTA_ARCHIVO);
        if (!directorio.exists()) {
            directorio.mkdirs();
        }
    }

    public static void escribirArchivoPerros(ArrayList<Perro> listaPerros) {
        try {
            StringBuilder linea = new StringBuilder();
            for (Perro perro : listaPerros) {
                linea = linea.append(perro.getNombre()).append(",");
                linea = linea.append(perro.getEdad()).append(",");
                linea = linea.append(perro.getPeso()).append(",");
                linea = linea.append(perro.getRaza()).append(",");
                linea = linea.append(perro.getDueno()).append(",");
                linea = linea.append(perro.getEnergia()).append(",");
                linea = linea.append(perro.getTamano()).append(",");
                linea = linea.append(perro.getColor().toString()).append(",");
                linea = linea.append(perro.isCola()).append("|");
            }
            validarRuta();
            PrintStream escritor = new PrintStream(RUTA_ARCHIVO + "archivo_perro.txt");
            escritor.print(linea.toString());
            escritor.flush();
            escritor.close();
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

    public static ArrayList<Perro> leerArchivoPerros() {
        ArrayList<Perro> listaPerros = new ArrayList<>();
        try {
            validarRuta();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(RUTA_ARCHIVO + "archivo_perro.txt")
                    )
            );
            StringBuilder contenido = new StringBuilder();
            while (br.ready()) {
                contenido = contenido.append(br.readLine());
            }
            prepararListaPerros(listaPerros, contenido.toString());
            br.close();
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
        return listaPerros;
    }
    
    private static void prepararListaPerros(ArrayList<Perro> listaPerros,String lineaPerros){
        String[] arregloPerros = lineaPerros.split(Pattern.quote("|"));
        for (String perro : arregloPerros) {
            String[] atributosPerro = perro.split(Pattern.quote(","));
            listaPerros.add(asignarAtributosPerro(atributosPerro));
        }
    }
    
    private static Perro asignarAtributosPerro(String[] atributos){
        Perro perro = new Perro();
        perro.setNombre(atributos[0]);
        perro.setEdad(Integer.parseInt(atributos[1]));
        perro.setPeso(Double.parseDouble(atributos[2]));
        perro.setRaza(atributos[3]);
        perro.setDueno(atributos[4]);
        perro.setEnergia(Double.parseDouble(atributos[5]));
        perro.setTamano(Double.parseDouble(atributos[6]));
        perro.setColor(Color.getColor(atributos[7]));
        perro.setCola(Boolean.parseBoolean(atributos[8]));
        return perro;
    }
    
    public static void escribirArchivoGatos(ArrayList<Gato> listaGatos){
        try {
            StringBuilder linea = new StringBuilder();
            for (Gato gato : listaGatos) {
                linea = linea.append(gato.getNombre()).append(",");
                linea = linea.append(gato.getEdad()).append(",");
                linea = linea.append(gato.getPeso()).append(",");
                linea = linea.append(gato.getRaza()).append(",");
                linea = linea.append(gato.getDueno()).append(",");
                linea = linea.append(gato.getEnergia()).append(",");
                linea = linea.append(gato.isPelo()).append(",");
                linea = linea.append(gato.isGarras()).append("|");
            }
            validarRuta();
            PrintStream escritor = new PrintStream(RUTA_ARCHIVO + "archivo_gato.txt");
            escritor.print(linea.toString());
            escritor.flush();
            escritor.close();
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
    
    public static ArrayList<Gato> leerArchivoGatos(){
        ArrayList<Gato> listaGatos = new ArrayList<>();
        try {
            validarRuta();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(RUTA_ARCHIVO + "archivo_gato.txt")
                    )
            );
            StringBuilder contenido = new StringBuilder();
            while (br.ready()) {
                contenido = contenido.append(br.readLine());
            }
            prepararListaGatos(listaGatos, contenido.toString());
            br.close();
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
        return listaGatos;
    }
    
    private static void prepararListaGatos(ArrayList<Gato> listaGatos,String lineaGatos){
        String[] arregloGatos = lineaGatos.split(Pattern.quote("|"));
        for (String gato : arregloGatos) {
            String[] atributosGato = gato.split(Pattern.quote(","));
            listaGatos.add(asignarAtributosGato(atributosGato));
        }
    }

    private static Gato asignarAtributosGato(String[] atributos) {
        Gato gato = new Gato();
        gato.setNombre(atributos[0]);
        gato.setEdad(Integer.parseInt(atributos[1]));
        gato.setPeso(Double.parseDouble(atributos[2]));
        gato.setRaza(atributos[3]);
        gato.setDueno(atributos[4]);
        gato.setEnergia(Double.parseDouble(atributos[5]));
        gato.setPelo(Boolean.parseBoolean(atributos[6]));
        gato.setGarras(Boolean.parseBoolean(atributos[7]));
        return gato;
    }
    
    public static void lanzarAlerta(Component padre, String mensaje, String titulo, int tipo) {
        JOptionPane.showMessageDialog(padre, mensaje, titulo, tipo);
    }
}

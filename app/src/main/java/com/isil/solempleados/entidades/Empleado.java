package com.isil.solempleados.entidades;

import com.isil.solempleados.enums.Categoria;

public class Empleado {
    long codigo;
    String nombre;
    String apellido;
    private double sueldo;
    Categoria categoria;

    private static double sueldoAdm = 3000;
    private static double sueldoProd = 4500;
    private static double sueldoCal = 6000;
    private static double sueldoGer = 7500;
    private static double sueldoError = -1;

    public Empleado(long codigo, String nombre, String apellido, Categoria categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.categoria = categoria;
    }

    double CalcularSueldo(){
        switch (categoria){
            case Administracion:
                sueldo = sueldoAdm;
                break;
            case Produccion:
                sueldo = sueldoProd;
                break;
            case Calidad:
                sueldo = sueldoCal;
                break;
            case Gerencia:
                sueldo = sueldoGer;
                break;
            default:
                sueldo = sueldoError;
        }
        return sueldo;
    }

    public static void ModificarSueldo(Categoria categoria, double value){
        if(value<0 || value>10000) return;

        switch (categoria){
            case Administracion:
               sueldoAdm = value;
                break;
            case Produccion:
                sueldoProd = value;
                break;
            case Calidad:
                sueldoCal = value;
                break;
            case Gerencia:
                sueldoGer = value;
                break;
        }
    }

    public static double ObtenerSueldo(Categoria categoria){
        double s = sueldoError;
        switch (categoria){
            case Administracion:
                s = sueldoAdm;
                break;
            case Produccion:
                s = sueldoProd;
                break;
            case Calidad:
                s = sueldoCal;
                break;
            case Gerencia:
                s = sueldoGer;
                break;
            default:
                s = sueldoError;
        }
        return s;
    }

    String CategoriaEnTexto(){
        switch (categoria){
            case Administracion:
                return "Administración";
            case Produccion:
                return "Producción";
            case Calidad:
                return "Calidad";
            case Gerencia:
                return "Gerencia";
        }
        return "No definida";
    }

    public String MostrarInfo(){
        CalcularSueldo();
        return "Información de Empleado\n********************\n\nCódigo: "+
                codigo + "\nNombre: "+nombre+" "+apellido + "\nCategoría: "+
                CategoriaEnTexto() + "\nSueldo: "+sueldo;
    }
}

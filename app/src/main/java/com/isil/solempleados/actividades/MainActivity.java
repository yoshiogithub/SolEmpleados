package com.isil.solempleados.actividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.isil.solempleados.R;
import com.isil.solempleados.entidades.Empleado;
import com.isil.solempleados.enums.Categoria;

public class MainActivity extends AppCompatActivity {

    TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoResultado = findViewById(R.id.tvResultado);
        Mostrar();
    }

    public void Mostrar(){
        Empleado e1 = new Empleado(1001, "Ricardo", "Perez", Categoria.Gerencia);
        Empleado e2 = new Empleado(1002, "Ricardo", "Milonote", Categoria.Administracion);
        Empleado e3 = new Empleado(1003, "Kevin", "Vargas", Categoria.Produccion);

        String msg = e1.MostrarInfo() + "\n\n" + e2.MostrarInfo() + "\n\n" +
                e3.MostrarInfo();
        textoResultado.setText(msg);
    }
}

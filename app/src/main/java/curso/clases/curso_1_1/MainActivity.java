package curso.clases.curso_1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import curso.clases.curso_1_1.Intents.SegundoActivity;
import curso.clases.curso_1_1.Models.Persona;
import curso.clases.curso_1_1.Models.Profesor;
import curso.clases.curso_1_1.Models.Usuario;

public class MainActivity extends AppCompatActivity {
    Button login,clear;
    TextView usuario, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.btnLogin);
        clear = findViewById(R.id.btnLimpiar);

        usuario = findViewById(R.id.txtUsuario);
        password = findViewById(R.id.txtPassword);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Presionaste Login", Toast.LENGTH_LONG).show();

                /*Instanciamos activity*/
                Intent segundoActivity = new Intent(MainActivity.this, SegundoActivity.class);

                /*parametros*/

                segundoActivity.putExtra("nombre",usuario.getText().toString());
                segundoActivity.putExtra("password",password.getText().toString());


                Usuario ObjUsuario = new Usuario(usuario.getText().toString(),password.getText().toString());
                segundoActivity.putExtra("ObjUsuario",ObjUsuario);


                /*Iniciamos segundo activity*/
                startActivity(segundoActivity);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Presionaste Limpiar", Toast.LENGTH_LONG).show();
                usuario.setText("");
                password.setText("");
            }
        });
        /*
        * byte: como su propio nombre denota, emplea un solo byte (8 bits) de almacenamiento. Esto permite almacenar valores en el rango [-128, 127].
        short: usa el doble de almacenamiento que el anterior, lo cual hace posible representar cualquier valor en el rango [-32.768, 32.767].
        int: emplea 4 bytes de almacenamiento y es el tipo de dato entero más empleado. El rango de valores que puede representar va de -2^31 a 2^31-1.
        long: es el tipo entero de mayor tamaño, 8 bytes (64 bits), con un rango de valores desde -2^63 a 2^63-1.
        *
        * */

        /*int enterto = 2147483647, float2 = -2147483648, entero2 = 123;
        float flotante1 = 28.01f;
        byte byte1 = 127;
        double double1 = 28.02121d ;
        long long1 = -9223372036854775808L;
        char _char = '6';
        String cadena1 = "123";

        int nombre_array[];
        nombre_array = new int[8];

        nombre_array[0] = 8;
        nombre_array[1] = 7;
        nombre_array[2] = 6;
        nombre_array[3] = 5;
        nombre_array[4] = 4;
        nombre_array[5] = 3;
        nombre_array[6] = 2;
        nombre_array[7] = 1;

        System.out.println("ejemplo: "+cadena1+ " array: " + nombre_array[5]);


        List<String> lista = new ArrayList<String>();

        lista.add("primer valor");
        lista.add("segundo valor");
        lista.add("tercer varlor");
        lista.add("cuarto valor ");


        lista.remove(2);

        int indice = 1;
        for(String str : lista){
            System.out.println("valor "+indice+": "+str);
            indice++;
        }

        lista.clear();

        lista.add("segunda secuencia");
        indice = 1;
        for(String str : lista){
            System.out.println("valor "+indice+": "+str);
            indice++;
        }*/

        /*int monedas = 20;

        switch(monedas) {
            case 5:
                System.out.println("Habitación 1");
                break;
            case 10:
                System.out.println("Habitación 2");
                break;
            case 15:
                System.out.println("Habitación 3");
                break;
            case 20:
                System.out.println("Habitación 4");
                break;
            default:
                System.out.println("Habitación 5");
                break;
        }

        System.out.println("Fuera del switch (y de las habitaciones)");*/

        /*asinar valores al array*/

        String nombre_array[];
        nombre_array = new String[8];

        int i = 0;

        while (i < nombre_array.length) {          //Condición trivial: siempre cierta
            nombre_array[i] = "posicion "+i;
            i++;
        }
        /*imprimir valores de array*/

        i = 0;
        /*do  {          //Condición trivial: siempre cierta
            System.out.println( nombre_array[i]);
            i++;
        } while(i < nombre_array.length );*/

        /*for(int z = 0; z < nombre_array.length; z++){
            System.out.println( nombre_array[z]);
        }
        String matriz[][];
        matriz = new String[4][4];


        int valores = 0;
        for(int z=0;z < matriz.length;z++){
            for(int y=0;y < matriz[z].length;y++){
                matriz[z][y] = "valor: "+valores;
                valores++;
            }
        }

        int x = 0;
        while(x < matriz.length){
            int y = 0;
            while(y < matriz[x].length){
                System.out.println( matriz[x][y]);
                y++;
            }
            x++;
        }*/
        Persona persona = new Persona("Juan Perez",28,"Masculino", 1.76f);
        Persona persona2 = new Persona();

        persona.setNombre("Juan Perez");
        System.out.println(persona.getNombre());

        persona.setNombre("Carlos Perez");
        System.out.println(persona.getNombre());

        System.out.println("dias "+persona.edadEndias());

        Profesor profesor = new Profesor("Alejandro", 28,"Masculino", 1.82f);
        profesor.setIdProfesor("Profesor_Matematicas_1");


        System.out.println("profesor: "+profesor.getNombre()+" id profesor: "+profesor.getIdProfesor());
        profesor.setSalones();
        List<String> salones  = profesor.getSalones();
        for (int z = 0; z < salones.size(); z++){
            System.out.println(salones.get(z));
        }
        System.out.println(profesor.edadEndias());

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this, "Start", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this, "Resumen", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this, "Pausa", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this, "Stop", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(MainActivity.this, "Re-Start", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this, "Destroy", Toast.LENGTH_LONG).show();
    }
}
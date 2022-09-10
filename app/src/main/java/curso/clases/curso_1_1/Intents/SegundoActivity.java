package curso.clases.curso_1_1.Intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import curso.clases.curso_1_1.Models.Usuario;
import curso.clases.curso_1_1.R;

public class SegundoActivity extends AppCompatActivity {
    TextView editTextNombre, editTextPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        Intent myIntent = getIntent(); // gets the previously created intent
        String nombre = myIntent.getStringExtra("nombre"); // will return "FirstKeyValue"
        String password= myIntent.getStringExtra("password"); // will return "SecondKeyValue"

        Usuario objUsuario = (Usuario) myIntent.getSerializableExtra("ObjUsuario");

        editTextNombre = findViewById(R.id.textViewNombre);
        editTextPassword = findViewById(R.id.textViewPassword);



        //editTextNombre.setText(nombre);
        //editTextPassword.setText(password);


        editTextNombre.setText(objUsuario.getNombre());
        editTextPassword.setText(objUsuario.getPassword());

    }
}
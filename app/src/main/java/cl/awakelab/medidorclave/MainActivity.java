package cl.awakelab.medidorclave;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Toast;

import cl.awakelab.medidorclave.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements IVistaPresentador {

    ActivityMainBinding binding;
    private Presentador presentador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        presentador = new Presentador(this);
        binding.editTextPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                presentador.evaluarClave(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    @Override
    public void mostrarDevil() {
        Toast.makeText(this, "Contraseña Devil", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void mostrarMedia() {
        Toast.makeText(this, "Contraseña Media", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void mostrarFuerte() {

        Toast.makeText(this, "Contraseña Fuerte", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void mostrarError() {

        Toast.makeText(this, "Ingrese Contraseña", Toast.LENGTH_SHORT).show();
    }
}
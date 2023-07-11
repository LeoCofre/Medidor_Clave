package cl.awakelab.medidorclave;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import android.widget.Toast;

import cl.awakelab.medidorclave.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements IVistaPresentador {

    ActivityMainBinding binding;
    private Presentador presentador;

    TextView textView = binding.textView;

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

        textView.setBackgroundColor(getColor(R.color.rojo));
        textView.setText(R.string.devil);
    }

    @Override
    public void mostrarMedia() {

        textView.setBackgroundColor(getColor(R.color.amarillo));
        textView.setText(R.string.media);
    }

    @Override
    public void mostrarFuerte() {

        textView.setBackgroundColor(getColor(R.color.verde));
        textView.setText(R.string.fuerte);
    }

    @Override
    public void mostrarError() {

        Toast.makeText(this, "Ingrese Contraseña", Toast.LENGTH_SHORT).show();
    }
}
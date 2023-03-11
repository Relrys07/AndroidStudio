package devandroid.alves.applistacurso2023.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.alves.applistacurso2023.R;
import devandroid.alves.applistacurso2023.model.Pessoa;


public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();

    }
}
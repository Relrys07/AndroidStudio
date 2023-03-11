package devandroid.alves.applistacurso2023.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.alves.applistacurso2023.R;
import devandroid.alves.applistacurso2023.model.Pessoa;


public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outraPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        //Atribuir conteúdo Dados ,valpres para objetos
        pessoa.setPrimeiroNome("Relrys");
        pessoa.setSobreNome("Alves");
        pessoa.setTelefoneContato("85 8597854");
        pessoa.setCursoDesejado("Android");

        outraPessoa =  new Pessoa();
        outraPessoa.setPrimeiroNome("Hayna");
        outraPessoa.setSobreNome("Alves");
        outraPessoa.setTelefoneContato("85486514156");
        outraPessoa.setCursoDesejado("java");


        int parada = 0;

    }
}
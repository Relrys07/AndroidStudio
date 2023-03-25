package devandroid.alves.applistacurso2023.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import devandroid.alves.applistacurso2023.R;
import devandroid.alves.applistacurso2023.model.Pessoa;


public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outraPessoa;

    String dadosPessoa; //passcalCase - camelCase
    String dadosOutraPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        //Atribuir conteúdo Dados ,valpres para objetos
        pessoa.setPrimeiroNome("Relrys");
        pessoa.setSobreNome("Alves");
        pessoa.setTelefoneContato("858597854");
        pessoa.setCursoDesejado("Android");

        outraPessoa =  new Pessoa();
        outraPessoa.setPrimeiroNome("Hayna");
        outraPessoa.setSobreNome("Alves");
        outraPessoa.setTelefoneContato("85486514156");
        outraPessoa.setCursoDesejado("java");

        dadosPessoa = " Primeiro nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += " Sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa += " Telefone Contato: ";
        dadosPessoa += pessoa.getTelefoneContato();
        dadosPessoa += " Curso Desejado: ";
        dadosPessoa += pessoa.getCursoDesejado();

        dadosOutraPessoa = " Primeiro nome: ";
        dadosOutraPessoa += outraPessoa.getPrimeiroNome();
        dadosOutraPessoa += " Sobrenome: ";
        dadosOutraPessoa += outraPessoa.getSobreNome();
        dadosOutraPessoa += " Telefone Contato: ";
        dadosOutraPessoa += outraPessoa.getTelefoneContato();
        dadosOutraPessoa += " Curso Desejado: ";
        dadosOutraPessoa += outraPessoa.getCursoDesejado();

        Log.i("PooAndroid","Objetos paessoa: "+pessoa.toString());
        Log.i("PooAndroid","Objetos outraPaessoa: "+outraPessoa.toString());
    }
}
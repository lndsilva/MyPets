package br.com.local.mypets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {
    //Declarando as variaveis que representarão os componentes xml
    EditText edtNome, edtSenha;
    Button btnEntrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login_layout);

        //Ligar as variaveis do java aos componentes do xml
        edtNome = findViewById(R.id.edtUsuario);
        edtSenha = findViewById(R.id.edtSenha);

        btnEntrar = findViewById(R.id.btnEntrar);

        //criando um evento de click no botão entrar
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Pegando os valores das editTexts
                String nome, senha;

                nome = edtNome.getText().toString();
                senha = edtSenha.getText().toString();


                if (nome.equals("senac") && senha.equals("senac")) {

                    //formas de abertura de janela ou Activity
                    //primeira forma

                    //startActivity(new Intent(getApplicationContext(),MenuPrincipal_Activity.class));
                    //finish();

                    //segunda forma
                    Intent intent = new Intent(getApplicationContext(),MenuPrincipal_Activity.class);

                    //intent.putExtra("nomeUsuario",15);

                    startActivity(intent);

                    Toast.makeText(getApplicationContext(), "Bem vindo ao sistema.", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Erro ao acessar o sistema.", Toast.LENGTH_SHORT).show();
                }


            }
        });


    }

    public void sairSistema(View view) {
        finish();
    }
}


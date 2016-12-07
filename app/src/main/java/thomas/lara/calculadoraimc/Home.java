package thomas.lara.calculadoraimc;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    //Wingets
    private EditText etAltura;
    private EditText eTpeso;
    private Button btnCalcular;
    private TextView tvIMC;

    //Objeto
    private CalculadoraIMC calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //Preferencias

        etAltura = (EditText) findViewById(R.id.home_et_altura);
        eTpeso = (EditText) findViewById(R.id.home_et_peso);
        btnCalcular = (Button) findViewById(R.id.home_btn_calcular);
        tvIMC = (TextView) findViewById(R.id.home_et_imc);

          btnCalcular.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  calc = new CalculadoraIMC();

                  calc.setAltura(Double.parseDouble(etAltura.getText().toString()));
                  calc.setPeso(Double.parseDouble(eTpeso.getText().toString()));
                  Toast.makeText(getBaseContext(),calc.toString(),Toast.
                          LENGTH_LONG).show();
                  tvIMC.setText(calc.toString());
              }
          });


    }//fecha onCreate
}//fecha Home

package com.org.cjava.sodiado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Sodiacoctivity extends AppCompatActivity {
EditText mes, dia;
    TextView salida;
    Button boton;
    Button lim;
    int dias;
    String m[]={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Setiembre","Octubre","Noviembre","Diciembre"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sodiacoctivity);
    dia=(EditText)findViewById(R.id.Caja1);
    mes=(EditText)findViewById(R.id.Caja2);
    salida=(TextView)findViewById(R.id.Salida);
    boton=(Button)findViewById(R.id.button);
    lim=(Button)findViewById(R.id.btnLimpiar);
        lim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                limpiar_cajas();
            }
        });
    boton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            try {
                dias= Integer.parseInt(dia.getText().toString());

                for (int i =0; i<=m.length ; i++) {

                    m[0]=mes.getText().toString();
                    m[1]=mes.getText().toString();
                    m[2]=mes.getText().toString();
                    m[3]=mes.getText().toString();
                    m[4]=mes.getText().toString();
                    m[5]=mes.getText().toString();
                    m[6]=mes.getText().toString();
                    m[7]=mes.getText().toString();
                    m[8]=mes.getText().toString();
                    m[9]=mes.getText().toString();
                    m[10]=mes.getText().toString();
                    m[11]=mes.getText().toString();
                }

                calculo_sodiaco(dia,mes);

            }
            catch (Exception e)
            {
                Toast.makeText(Sodiacoctivity.this,"Valores ilegales ingresados,intente de nuevo",Toast.LENGTH_LONG).show();
                limpiar_cajas();
            }
        }
    });

    }

    private void calculo_sodiaco(EditText dia, EditText mes) {
         String r="";

        String cadena=r;

        for(int i=0;i<=m.length;i++){
            if((i==0 && dias>=22 && dias<=31)||(i==1 && dias>0 && dias<=21)){
                r="Acuario";

            }
            if((i==1 && dias>21 && dias<29)||(i==2 && dias>0 && dias<21) ){
                r="Picis";

            }
            if((i==2 && dias>=21 && dias<=31)||(i==3 && dias>0 && dias<21) ){
                r="Aries";

            }
            if((i==3 && dias>=21 && dias<=30)||(i==4 && dias>0 && dias<=20) ){
                r="Tauro";

            }
            if((i==4 && dias>=21 && dias<=31)||(i==5 && dias>0 && dias<=21) ){
                r="Geminis";

            }
            if((i==5 && dias>=22 && dias<=30)||(i==6 && dias>0 && dias<=22) ){
                r="Cancer";

            }
            if((i==6 && dias>=23 && dias<=31)||(i==7 && dias>0 && dias<=22) ){
                r="Leo";

            }
            if((i==7 && dias>=23 && dias<=31)||(i==8 && dias>0 && dias<=21) ){
                r="Virgo";

            }
            if((i==8 && dias>=22 && dias<=30)||(i==9 && dias>0 && dias<=22) ){
                r="Libra";

            }
            if((i==9 && dias>=23 && dias<=31)||(i==10 && dias>0 && dias<=21) ){
             r="Escorpio";

            }
            if((i==10 && dias>=22 && dias<=30)||(i==12 && dias>0 && dias<=22) ){
                r="Sagitario";

            }
            if((i==11 && dias>=23 && dias<=31)||(i==0 && dias>0 && dias<=21) ){
                r="Capricornio";

            }

        }

            salida.setText(r);


//-Acuario: 22 de enero - 21 de febrero
        //(02) -Piscis: 22 de febrero - 20 de marzo
        //(03)-Aries: 21 de marzo - 20 de abril
        //(04) -Tauro: 21 de abril - 20 de mayo
        //(05) -Géminis: 21 de mayo - 21 de junio
        //(06) -Cáncer: 22 de junio - 22 de julio
        //(07) -Leo: 23 de julio - 22 de agosto
        //(08) -Virgo: 23 de agosto - 21 de septiembre
        //(09) -Libra: 22 de septiembre - 22 de octubre
        //(10) -Escorpio: 23 de octubre - 21 de noviembre
        //(11) -Sagitario: 22 de noviembre - 22 de diciembre
        //(12) -Capricornio: 23 de diciembre - 21 de enero

    }

    private void limpiar_cajas() {
    dia.setText("");
    mes.setText("");
    dia.requestFocus();
    }



}

package app.usuario.visualizadordeimagenscompanydomain;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageView imgFoto;
    Button btnFoto1, btnFoto2;
    TextView txtInformacao;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        imgFoto = (ImageView)findViewById(R.id.imgFoto);
        btnFoto1 = (Button) findViewById(R.id.btnFoto1);
        btnFoto2 = (Button) findViewById(R.id.btnFoto2);
        txtInformacao = (TextView) findViewById(R.id.txtInformacao);

        btnFoto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                imgFoto.setImageResource(R.drawable.imagenclasse);
                txtInformacao.setText("Foto 1");
            }
        });
        btnFoto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                imgFoto.setImageResource(R.drawable.inseto);
                txtInformacao.setText("Foto 2");
            }
        });
    }
}
package simple.example.hewanpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnAyam,btnBurung,btnIkan;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

        Button btnMyBio = findViewById(R.id.btn_my_bio);
        btnMyBio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, mybio.class);
                startActivity(intent);
            }
        });

    }

    private void inisialisasiView() {
        btnAyam = findViewById(R.id.btn_buka_ras_ayam);
        btnBurung = findViewById(R.id.btn_buka_ras_burung);
        btnIkan = findViewById(R.id.btn_buka_ras_ikan);
        btnAyam.setOnClickListener(view -> bukaGaleri("Ayam"));
        btnBurung.setOnClickListener(view -> bukaGaleri("Burung"));
        btnIkan.setOnClickListener(view -> bukaGaleri("Ikan"));

    }

    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN","Buka activity kucing");
        Intent intent = new Intent(this, DaftarHewanActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }

}
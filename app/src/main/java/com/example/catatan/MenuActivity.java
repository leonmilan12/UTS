// 10118374 Leonardo Korompis IF-9 5 Juni 2021
package com.example.catatan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MenuActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView menu_bawah;
    private TextView tulisan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu_bawah = findViewById(R.id.menu_bawah);
        tulisan = findViewById(R.id.tulisan);
        menu_bawah.setOnNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.home:

                tulisan.setText("Tombol home diklik");
                break;
            case R.id.profile:

                tulisan.setText("Tombol profile diklik");
                break;
            case R.id.about:

                tulisan.setText("Tombol folder diklik");
                break;
        }
        return true;
    }
}
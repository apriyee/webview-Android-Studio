package net.ab88shop.realaktifitaskita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    private int waktu_loading=1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //setelah loading maka akan langsung berpindah ke home activity
                Intent home=new Intent(MainActivity.this, activity_home.class);
                startActivity(home);
                finish();

            }
        },waktu_loading);
    }
}

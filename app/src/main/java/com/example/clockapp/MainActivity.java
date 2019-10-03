package com.example.clockapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.util.Date;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Convert Time to 24 hr
    public void convertTo24(View view) {

        TimeZone timezone = TimeZone.getDefault();
        //Time in Sydney
        Date sydt = new Date();
        TextView sydney = findViewById(R.id.sydney);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        sdf.setTimeZone(timezone.getTimeZone("Australia/Sydney"));
        String sydneyTime = sdf.format(sydt);
        sydney.setText("Sydney"+ "\n" +sydneyTime);

        //Time in New York
        Date nyt = new Date();
        TextView newYork = findViewById(R.id.newYork);
        SimpleDateFormat nydf = new SimpleDateFormat("HH:mm");
        nydf.setTimeZone(timezone.getTimeZone("America/New_York"));
        String newYorkTime = nydf.format(nyt);
        newYork.setText("New York"+ "\n" + newYorkTime);

        //Time in Tokyo
        Date tkt = new Date();
        TextView tokyo = findViewById(R.id.tokyo);
        SimpleDateFormat tkdf = new SimpleDateFormat("HH:mm");
        tkdf.setTimeZone(timezone.getTimeZone("GMT+9:00"));
        String tokyoTime = tkdf.format(tkt);
        tokyo.setText("Tokyo"+ "\n" + tokyoTime);

        //Time in London
        Date lt = new Date();
        TextView london = findViewById(R.id.london);
        SimpleDateFormat ldf = new SimpleDateFormat("HH:mm");
        ldf.setTimeZone(timezone.getTimeZone("GMT+1:00"));
        String londonTime = ldf.format(lt);
        london.setText("London" + "\n" +londonTime);

        //Time in Hong Kong
        Date hkt = new Date();
        TextView hongKong = findViewById(R.id.hongKong);
        SimpleDateFormat hkdf = new SimpleDateFormat("HH:mm");
        hkdf.setTimeZone(timezone.getTimeZone("GMT+9:00"));
        String hongKongTime = hkdf.format(hkt);
        hongKong.setText("Hong Kong" + "\n" + hongKongTime);
    }

    //Convert time to 12hr
    public void convertTo12(View view) {
        TimeZone timezone = TimeZone.getDefault();
        //Time in Sydney
        Date sydt = new Date();
        TextView sydney = findViewById(R.id.sydney);
        SimpleDateFormat sdf = new SimpleDateFormat("h:mm a");
        sdf.setTimeZone(timezone.getTimeZone("Australia/Sydney"));
        String sydneyTime = sdf.format(sydt);
        sydney.setText("Sydney"+ "\n" +sydneyTime);

        //Time in New York
        Date nyt = new Date();
        TextView newYork = findViewById(R.id.newYork);
        SimpleDateFormat nydf = new SimpleDateFormat("h:mm a");
        nydf.setTimeZone(timezone.getTimeZone("America/New_York"));
        String newYorkTime = nydf.format(nyt);
        newYork.setText("New York"+ "\n" + newYorkTime);

        //Time in Tokyo
        Date tkt = new Date();
        TextView tokyo = findViewById(R.id.tokyo);
        SimpleDateFormat tkdf = new SimpleDateFormat("h:mm a");
        tkdf.setTimeZone(timezone.getTimeZone("GMT+9:00"));
        String tokyoTime = tkdf.format(tkt);
        tokyo.setText("Tokyo"+ "\n" + tokyoTime);

        //Time in London
        Date lt = new Date();
        TextView london = findViewById(R.id.london);
        SimpleDateFormat ldf = new SimpleDateFormat("h:mm a");
        ldf.setTimeZone(timezone.getTimeZone("GMT+1:00"));
        String londonTime = ldf.format(lt);
        london.setText("London" + "\n" +londonTime);

        //Time in Hong Kong
        Date hkt = new Date();
        TextView hongKong = findViewById(R.id.hongKong);
        SimpleDateFormat hkdf = new SimpleDateFormat("h:mm a");
        hkdf.setTimeZone(timezone.getTimeZone("GMT+9:00"));
        String hongKongTime = hkdf.format(hkt);
        hongKong.setText("Hong Kong" + "\n" + hongKongTime);
    }

}
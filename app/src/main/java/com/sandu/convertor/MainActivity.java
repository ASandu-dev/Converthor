package com.sandu.convertor;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivity extends AppCompatActivity {
    EditText km;
    EditText mi;
    EditText m;
    EditText ft;
    EditText yd;
    EditText cm;
    EditText in;
    Button btn;
    Button clear;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        km = findViewById(R.id.km);
        mi = findViewById(R.id.mi);
        m = findViewById(R.id.m);
        ft = findViewById(R.id.ft);
        yd = findViewById(R.id.yd);
        cm = findViewById(R.id.cm);
        in = findViewById(R.id.inch);
        btn = findViewById(R.id.convert);
        clear = findViewById(R.id.clear);
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
       mAdView.loadAd(adRequest);


            try {
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (km.hasFocus()){
                            double value=Double.valueOf(km.getText().toString());
                            mi.setText(Double.valueOf(UnitConverter.kilometri2Mile(value)).toString());
                            m.setText(Double.valueOf(UnitConverter.kilometri2Metri(value)).toString());
                            ft.setText(Double.valueOf(UnitConverter.kilometri2Feet(value)).toString());
                            yd.setText(Double.valueOf(UnitConverter.kilometri2Yard(value)).toString());
                            cm.setText(Double.valueOf(UnitConverter.kilometri2Centimetri(value)).toString());
                            in.setText(Double.valueOf(UnitConverter.kilometri2Inch(value)).toString());



                        }else if (mi.hasFocus()){
                            double value = Double.valueOf(mi.getText().toString());
                            km.setText(Double.valueOf(UnitConverter.mile2Kilometri(value)).toString());
                            m.setText(Double.valueOf(UnitConverter.mile2Metri(value)).toString());
                            ft.setText(Double.valueOf(UnitConverter.mile2Feet(value)).toString());
                            yd.setText(Double.valueOf(UnitConverter.mile2Yarzi(value)).toString());
                            cm.setText(Double.valueOf(UnitConverter.mile2Centimetri(value)).toString());
                            in.setText(Double.valueOf(UnitConverter.mile2Inch(value)).toString());

                        }else if(m.hasFocus()){
                            double value = Double.valueOf(m.getText().toString());
                            km.setText(Double.valueOf(UnitConverter.metri2Kilometri(value)).toString());
                            mi.setText(Double.valueOf(UnitConverter.metri2Mile(value)).toString());
                            ft.setText(Double.valueOf(UnitConverter.metri2Feet(value)).toString());
                            yd.setText(Double.valueOf(UnitConverter.metri2Yard(value)).toString());
                            cm.setText(Double.valueOf(UnitConverter.metri2Centimetri(value)).toString());
                            in.setText(Double.valueOf(UnitConverter.metri2Inch(value)).toString());



                        }else if(ft.hasFocus()){
                            double value = Double.valueOf(ft.getText().toString());
                            km.setText(Double.valueOf(UnitConverter.feet2Kilometri(value)).toString());
                            mi.setText(Double.valueOf(UnitConverter.feet2Miles(value)).toString());
                            m.setText(Double.valueOf(UnitConverter.feet2Metri(value)).toString());
                            yd.setText(Double.valueOf(UnitConverter.feet2Yard(value)).toString());
                            cm.setText(Double.valueOf(UnitConverter.feet2Centimeters(value)).toString());
                            in.setText(Double.valueOf(UnitConverter.feet2Inch(value)).toString());


                        }else if(yd.hasFocus()){

                            double value = Double.valueOf(yd.getText().toString());
                            km.setText(Double.valueOf(UnitConverter.yard2Kilometri(value)).toString());
                            mi.setText(Double.valueOf(UnitConverter.yard2Mile(value)).toString());
                            m.setText(Double.valueOf(UnitConverter.yard2Metri(value)).toString());
                            ft.setText(Double.valueOf(UnitConverter.yard2Feet(value)).toString());
                            cm.setText(Double.valueOf(UnitConverter.yard2Centimetri(value)).toString());
                            in.setText(Double.valueOf(UnitConverter.yard2Inch(value)).toString());

                        }else if(cm.hasFocus()){
                            double value = Double.valueOf(cm.getText().toString());
                            km.setText(Double.valueOf(UnitConverter.cm2Kilometri(value)).toString());
                            mi.setText(Double.valueOf(UnitConverter.cm2Mile(value)).toString());
                            m.setText(Double.valueOf(UnitConverter.cm2Metri(value)).toString());
                            ft.setText(Double.valueOf(UnitConverter.cm2Feet(value)).toString());
                            yd.setText(Double.valueOf(UnitConverter.cm2Yard(value)).toString());
                            in.setText(Double.valueOf(UnitConverter.cm2Inch(value)).toString());
                        }else if (in.hasFocus()){
                            double value = Double.valueOf(in.getText().toString());
                            km.setText(Double.valueOf(UnitConverter.inch2Kilometeri(value)).toString());
                            mi.setText(Double.valueOf(UnitConverter.inch2Mile(value)).toString());
                            m.setText(Double.valueOf(UnitConverter.inch2Metri(value)).toString());
                            ft.setText(Double.valueOf(UnitConverter.inch2Feet(value)).toString());
                            yd.setText(Double.valueOf(UnitConverter.inch2Yard(value)).toString());
                            cm.setText(Double.valueOf(UnitConverter.inch2Centimetri(value)).toString());
                        }
                    }
                });

                clear.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        km.setText("");
                        mi.setText("");
                        m.setText("");
                        ft.setText("");
                        yd.setText("");
                        cm.setText("");
                        in.setText("");
                    }
                });
            }catch (Exception e){

            }


        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
                AdView adView = new AdView(MainActivity.this);
                adView.setAdSize(AdSize.BANNER);adView.setAdUnitId("ca-app-pub-3940256099942544/6300978111");
        // TODO: Add adView to your view hierarchy.
        mAdView = findViewById(R.id.adView);
        mAdView.loadAd(adRequest);
    }



    }


package com.example.ljh_8;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabSpecBaseball = tabHost.newTabSpec("baseball").setIndicator("야구");
        tabSpecBaseball.setContent(R.id.baseball);
        tabHost.addTab(tabSpecBaseball);

        TabHost.TabSpec tabSpecBasketball = tabHost.newTabSpec("basketball").setIndicator("농구");
        tabSpecBasketball.setContent(R.id.basketball);
        tabHost.addTab(tabSpecBasketball);

        TabHost.TabSpec tabSpecSoccer = tabHost.newTabSpec("soccer").setIndicator("축구");
        tabSpecSoccer.setContent(R.id.soccer);
        tabHost.addTab(tabSpecSoccer);
        tabHost.setCurrentTab(0);

        TabHost.TabSpec tabSpecVolleyball = tabHost.newTabSpec("volleyball").setIndicator("배구");
        tabSpecVolleyball.setContent(R.id.volleyball);
        tabHost.addTab(tabSpecVolleyball);
        tabHost.setCurrentTab(0);

    }
}
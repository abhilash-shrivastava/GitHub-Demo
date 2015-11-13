package com.robpercival.animations;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {

    public void fade(View view) {

        ImageView bart = (ImageView) findViewById(R.id.bart);

        bart.animate()
                .translationXBy(1000f)
                .translationYBy(1000f)
                .translationXBy(-1000f)
                .translationYBy(-1000f)
                .translationXBy(1000f)
                .translationYBy(1000f)
                .rotationBy(3600)
                .setDuration(2000);



        // ImageView homer = (ImageView) findViewById(R.id.homer);

        //homer.animate().alpha(1f).setDuration(2000);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView bart = (ImageView) findViewById(R.id.bart);

        bart.setTranslationX(-1000f);
        bart.setTranslationY(-1000f);

        bart.setTranslationX(1000f);
        bart.setTranslationY(1000f);

        bart.setTranslationX(-1000f);
        bart.setTranslationY(-1000f);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

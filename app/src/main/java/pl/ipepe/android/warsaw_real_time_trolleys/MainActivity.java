package pl.ipepe.android.warsaw_real_time_trolleys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main_activity);

        WebView webView = new WebView(this);
        setContentView(webView);
        webView.setWebViewClient(new WebViewClient());
        WebSettings webSettings = webView.getSettings();
        webSettings.setDomStorageEnabled(true);
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl("http://examples.phaser.io/embed.php?f=virtualjoystick/dual+sticks.js&v=2.3.1.virtual-joystick");
        //webView.loadUrl("file:///android_asset/www/index.html");
        //<meta name="viewport" content="width=device-width, initial-scale=1">

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId()) {
            case R.id.one:
                Toast.makeText(this, "Jeden klik", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.two:
                Toast.makeText(this, "Dwa kliki", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

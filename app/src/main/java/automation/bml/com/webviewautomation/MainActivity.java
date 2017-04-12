package automation.bml.com.webviewautomation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.AbsoluteLayout.LayoutParams;
import android.widget.RelativeLayout;

import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;
import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AutomatedWebview webview = new AutomatedWebview(getApplicationContext());

        RelativeLayout main_layout = (RelativeLayout) findViewById(R.id.activity_main);
        main_layout.addView(webview);

        webview.loadUrl("https://www.google.com");

       // webview.getMNCMCC();
    }
}
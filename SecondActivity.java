package id.ac.id.telkomuniversity.tass.praktekactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle b = getIntent().getExtras();

        textView = findViewById(R.id.textView);

        String message = getIntent().getStringExtra("Text");
        textView.setText(message);

    }
}
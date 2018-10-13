package route.com.practiceg17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Welcome extends AppCompatActivity {

    Button letsgo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        letsgo = findViewById(R.id.letsgo);

        letsgo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Welcome.this, "lets go clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void Skip(View view) {
        finish();
    }
}

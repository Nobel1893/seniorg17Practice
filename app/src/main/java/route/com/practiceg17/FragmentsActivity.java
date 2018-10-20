package route.com.practiceg17;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

/**
 * Created by Mohamed Nabil Mohamed (Nobel) on 10/20/2018.
 * byte code SA
 * m.nabil.fci2015@gmail.com
 */
public class FragmentsActivity extends AppCompatActivity
        implements View.OnClickListener {


    protected Button red;
    protected Button green;
    protected FrameLayout fragmentContainer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_fragments);
        initView();
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RedFragment redFragment= new RedFragment();
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container,redFragment)
                        .commit();

            }
        });

    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.green) {

            GreenFragment greenFragment= new GreenFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container,greenFragment)
                    .commit();
        }
    }

    private void initView() {
        red = (Button) findViewById(R.id.red);
        red.setOnClickListener(FragmentsActivity.this);
        green = (Button) findViewById(R.id.green);
        green.setOnClickListener(FragmentsActivity.this);
        fragmentContainer = (FrameLayout) findViewById(R.id.fragment_container);
    }
}

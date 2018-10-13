package route.com.practiceg17;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


    }

    public void openRecyclerView(View v){
        startActivity(new Intent(Splash.this,ContactsListActivity.class));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("lifeCycle","onstart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("lifeCycle","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("lifeCycle","onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("lifeCycle","onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("lifeCycle","onDestroy");

    }
}

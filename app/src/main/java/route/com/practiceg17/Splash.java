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
    public void exitApp(View v){

        final ConfirmationDialog confirmationDialog = new ConfirmationDialog();
        confirmationDialog
                .Message("Do you want to exit ? ")
                .Title("Warning")
                .PosText("yes")
                .NegText("No")
                .PosAction(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                })
                .NegAction(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        confirmationDialog.dismiss();
                    }
                })
                .show(getSupportFragmentManager(),"exit");



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

    public void openFragment(View view) {

        startActivity(new Intent(Splash.this,FragmentsActivity.class));

    }
    public void openbottomnavigation(View view) {

        startActivity(new Intent(Splash.this,BottomNavigationActivity.class));

    }
}

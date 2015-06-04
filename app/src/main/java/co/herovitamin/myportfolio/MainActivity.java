package co.herovitamin.myportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    /* Click event */
    public void showMessage(View view){
        String message = "This button will launch ";
        switch (view.getId()){
            case R.id.button_spotify_streamer:
                message += getString(R.string.name_spotify_streamer);
                break;
            case R.id.button_scores_app:
                message += getString(R.string.name_scores_app);
                break;
            case R.id.button_library_app:
                message += getString(R.string.name_library_app);
                break;
            case R.id.button_build_it_bigger:
                message += getString(R.string.name_build_it_bigger);
                break;
            case R.id.button_bacon_reader:
                message += getString(R.string.name_bacon_reader);
                break;
            case R.id.button_capston_my_own_app:
                message += getString(R.string.name_capstone_my_own_app);
                break;
            default:
                message = "Hi there";
                break;
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}

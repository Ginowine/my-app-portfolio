package hub.yasiga.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements OnClickListener{

    private Button buttonOne;
    private Button buttonTwo;
    private Button buttonThree;
    private Button buttonFour;
    private Button buttonFive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonOne = (Button) findViewById(R.id.button1);
        buttonOne.setOnClickListener(this);
        buttonTwo = (Button) findViewById(R.id.button2);
        buttonTwo.setOnClickListener(this);
        buttonThree = (Button) findViewById(R.id.button3);
        buttonThree.setOnClickListener(this);
        buttonFour = (Button) findViewById(R.id.button4);
        buttonFour.setOnClickListener(this);
        buttonFive = (Button) findViewById(R.id.button5);
        buttonFive.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button1){
            Toast.makeText(getBaseContext(), "This button will launch my Spotify Streamer app!", Toast.LENGTH_SHORT).show();
        }
        else if (view.getId() == R.id.button2){
            Toast.makeText(getBaseContext(), "This button will launch my Super Duo app!", Toast.LENGTH_SHORT).show();
        }
        else if (view.getId() == R.id.button3){
            Toast.makeText(getBaseContext(), "This button will launch my Build It Bigger app!", Toast.LENGTH_SHORT).show();
        }
        else if (view.getId() == R.id.button4){
            Toast.makeText(getBaseContext(), "This button will launch my XYZ Reader app!", Toast.LENGTH_SHORT).show();
        }
        else if (view.getId() == R.id.button5){
            Toast.makeText(getBaseContext(), "This button will launch my own awesome app!", Toast.LENGTH_SHORT).show();
        }
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

package michaelcrump.net.mytestapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }

public void onClickMe(View view){
    EditText editText = (EditText)(findViewById(R.id.editText));
    TextView textView = (TextView)(findViewById(R.id.textView));

    String username = editText.getText().toString();

    Toast toast =  Toast.makeText(this, "Your name is : " + username, Toast.LENGTH_LONG);
    toast.show();

    textView.setText("Your name is : " + username);

}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        if (id == R.id.action_page2) {
            Intent intent = new Intent(this, MyActivity2.class);
            startActivity(intent);
        }
        if (id == R.id.action_exit) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}

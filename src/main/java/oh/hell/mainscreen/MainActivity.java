package oh.hell.mainscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import java.util.concurrent.ExecutionException;
import java.util.logging.Level;

public class MainActivity extends AppCompatActivity {

    private Object View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        Window w=getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button lvl=findViewById(R.id.levels);
        lvl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                try{
                Intent i=new Intent(MainActivity.this,levels.class);
                startActivity(i);finish();
            }catch (Exception e){}}
        });

}
    public void onclickhighscores(View v){
        try{
            Intent intent=new Intent(MainActivity.this,highscores.class);
            startActivity(intent);finish();
        }catch (Exception e){

        }
    }
    public void onclickstart(View c){
        try{
            Intent intent=new Intent(MainActivity.this,strtwndw.class);
            startActivity(intent);finish();
        }catch (Exception e){

        }
}
    public void onclicmultiplayer(View x){
        try{
            Intent intent=new Intent(MainActivity.this,multiplayer.class);
            startActivity(intent);finish();
        }catch (Exception e){

        }
    }
    public void onclicksettings(View z){
        try{
            Intent intent=new Intent(MainActivity.this,settings.class);
            startActivity(intent);finish();
        }catch (Exception e){

        }
    }
    public void onclicklvls(View v) {
        try {
            Intent intent = new Intent(MainActivity.this, levels.class);
            startActivity(intent);
            finish();
        } catch (Exception e) {

        }
    }

}

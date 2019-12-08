package oh.hell.mainscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class strtwndw extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.strtwndw);

        Window w=getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button back=(Button)findViewById(R.id.back1);
        back.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                try{
                    Intent intent=new Intent(strtwndw.this,MainActivity.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });

}

}

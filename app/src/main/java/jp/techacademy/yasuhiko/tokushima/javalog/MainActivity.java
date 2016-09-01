package jp.techacademy.yasuhiko.tokushima.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("javatest", "================= start =================");

        Human human1 = new Human("ハイジ", 8, "おじいさん");
        human1.say();
        human1.think();

        Log.d("javatest", ",");

        Human human2 = new Human("ペーター", 14, "クララ");
        human2.say();
        human2.think();

        Log.d("javatest", "=================  end  =================");
    }
}

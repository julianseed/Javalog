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
/*        Dog dog = new Dog("ポチ", 3);     // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

        dog.say();
        Log.d("javatest", "犬の名前は" + dog.name + "です。");
        Log.d("javatest", "犬の年齢は" + dog.age + "歳です。");
        dog.move();

        Log.d("javatest", ",");

        BigDog bigdog = new BigDog("ヨーゼフ", 15);     // 名前をヨーゼフ、年齢15歳で、BigDogのインスタンスを作る

        bigdog.say();
        Log.d("javatest", "犬の名前は" + bigdog.name + "です。");
        Log.d("javatest", "犬の年齢は" + bigdog.age + "歳です。");
        bigdog.move();

        Log.d("javatest", ",");
*/
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

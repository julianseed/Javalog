package jp.techacademy.yasuhiko.tokushima.javalog;

import android.util.Log;
/**
 * Created by koutaro on 2016/09/01.
 */
class BigDog extends Dog implements Movable {
    // クラス変数
    static String to_jp = "大型犬";

    public BigDog(String name, int age) {
        super(name, age);
    }

    // クラス関数
    public static void introduce() {
        Log.d("javatest", "これは大型犬クラスです。");
    }

    @Override
    public void move() {
        Log.d("javatest", this.name + "(" + this.age +"歳)は全力で走った。");
    }
}

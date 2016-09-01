package jp.techacademy.yasuhiko.tokushima.javalog;

import android.util.Log;
/**
 * Created by koutaro on 2016/09/01.
 */
class Dog extends Animal implements Movable {
    // クラス変数
    static String to_jp = "犬";

    // コントラクタ
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // クラス関数
    public static void introduce() {
        Log.d("javatest", "これは犬クラスです。");
    }

    // メンバ変数
    public void say() {
        Log.d("javatest", this.name + "(" + this.age +  "歳)「ワンワン」");
    }

    @Override
    public void move() {
        Log.d("javatest", this.name + "(" + this.age +"歳)は全力で走った。");
    }
}

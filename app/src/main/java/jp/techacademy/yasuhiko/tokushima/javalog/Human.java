package jp.techacademy.yasuhiko.tokushima.javalog;

import android.util.Log;

/**
 * Created by koutaro on 2016/09/01.
 */
class Human extends Animal implements Thinkable {
    // メンバ変数
    String hobby;

    // コントラクタ
    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    // メンバ関数
    public void say() {
        Log.d("javatest", "私の名前は" + this.name + "です。年は" + this.age +  "歳です。");
    }

    @Override
    public void think() {
        Log.d("javatest", "私は" + this.hobby + "について考える");
    }
}

package isfaaghyth.app.countcounter

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by isfaaghyth on 11/18/17.
 * github: @isfaaghyth
 */

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_ganti_teks.setOnClickListener({
            txt_test.text = "Hai, Juga! Hahaha"
        })
    }

}

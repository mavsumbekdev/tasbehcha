package uz.datatalim.tasbehcha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var sanoq = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun count(view: View) {
        var btn = findViewById<Button>(R.id.count)
        btn.setOnClickListener {
            sanoq++
            btn.setText(sanoq.toString())
        }
    }
}
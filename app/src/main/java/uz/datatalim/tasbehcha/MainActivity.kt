package uz.datatalim.tasbehcha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    var sanoq = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn = findViewById<FloatingActionButton>(R.id.count)
        var text = findViewById<TextView>(R.id.text)
        var reset = findViewById<FloatingActionButton>(R.id.reset)
        btn.setOnClickListener {
            sanoq++
            if (sanoq > 33) {
                sanoq=0
            }
            text.setText(sanoq.toString())
            text.text="$sanoq/33"
        }
        reset.setOnClickListener {
            sanoq=0
            text.text="$sanoq/33"
        }
    }
}
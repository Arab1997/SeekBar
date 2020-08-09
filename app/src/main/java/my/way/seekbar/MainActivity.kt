package my.way.seekbar

import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.SeekBar
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), SeekBar.OnSeekBarChangeListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val seekbar = SeekBar(this)
        val layoutParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        layoutParams.setMargins(30, 30, 30, 30)
        seekbar.layoutParams = layoutParams

        seekbar.progressDrawable.setColorFilter(ContextCompat.getColor(this, R.color.switch_thumb_normal_material_dark), PorterDuff.Mode.SRC_ATOP)
        seekbar.setBackgroundColor(ContextCompat.getColor(this,android.R.color.darker_gray))


        seekbar.setOnSeekBarChangeListener(this)
        linearLayout.addView(seekbar)

        seekbar1.setOnSeekBarChangeListener(this)
        seekbar2.setOnSeekBarChangeListener(this)
        seekbar3.setOnSeekBarChangeListener(this)
        seekbar4.setOnSeekBarChangeListener(this)
        seekbar5.setOnSeekBarChangeListener(this)
        seekbar6.setOnSeekBarChangeListener(this)
        seekbar7.setOnSeekBarChangeListener(this)
        seekbar8.setOnSeekBarChangeListener(this)
        seekbar9.setOnSeekBarChangeListener(this)
    }


    override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
        textView.text = "$p1"
    }

    override fun onStartTrackingTouch(p0: SeekBar?) {
    }

    override fun onStopTrackingTouch(p0: SeekBar?) {
    }

}

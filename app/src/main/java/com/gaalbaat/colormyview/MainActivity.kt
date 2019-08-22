package com.gaalbaat.colormyview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.Collections.list

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun setListeners() {
        val clickAbleView : List<View> =
            listOf(
                boxOneText ,
                boxTwoText ,
                boxThreeText,
                boxFourText ,
                boxFiveText ,
                ConstraintLayoutText,
                red_button,
                yellow_button,
                green_button

            )
        for(item in clickAbleView){
            item.setOnClickListener {
                makeColored(it)
            }
        }
    }

    private fun makeColored(view: View) {
        when(view.id){
            // Classes for color
            R.id.boxOneText -> view.setBackgroundColor(Color.DKGRAY)
            R.id.boxTwoText -> view.setBackgroundColor(Color.GRAY)
            //Boxes Android Color resource for background
            R.id.boxThreeText -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.boxFourText -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.boxFiveText -> view.setBackgroundResource(android.R.color.holo_green_light)

            // buttons
            R.id.red_button->boxThreeText.setBackgroundResource(R.color.myRed)
            R.id.yellow_button->boxFourText.setBackgroundResource(R.color.myYellow)
            R.id.green_button->boxFiveText.setBackgroundResource(R.color.myGreen)

            else ->  view.setBackgroundColor(Color.LTGRAY)
        }
    }
}

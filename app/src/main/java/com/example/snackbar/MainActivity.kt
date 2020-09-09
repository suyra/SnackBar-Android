package com.example.snackbar

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showSnackbar.setOnClickListener {

            //make() is a static method which takes 3 parameters rootView where we want to display snackBar, message we want to display and the duration
            val snackBar = Snackbar.make(root,"Showing SnackBar...",Snackbar.LENGTH_LONG)

                    //to add a action to snackBar add a callback method setAction() and pass the text for action.
                    snackBar.setAction("CLOSE"){
                        //inside setAction() handle the action.
                        //use dismiss() method on snackBar to close/dismiss snackbar.
                        snackBar.dismiss()
                    }

                    //to change the color of the action text use setActionTextColor()
                    snackBar.setActionTextColor(Color.RED)

                    //to change the text color get the text id from view and use setTextColor() method.
                    val view = snackBar.view
                    val text = view.findViewById<TextView>(R.id.snackbar_text)
                    text.setTextColor(Color.BLUE)
                    //to change the background use setBackgroundColor()
                    snackBar.view.setBackgroundColor(Color.LTGRAY)

                    //finally to show snackBar call show() method on snackBar
                    snackBar.show()

        }
    }
}
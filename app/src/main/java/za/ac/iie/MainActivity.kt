package za.ac.iie

import android.os.Bundle
import android.provider.MediaStore.Audio.Radio
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
// identifies the variable and its id in order to use the app effectively
        val rbMorning = findViewById<RadioButton>(R.id.rdMorning)
        val rbMidmorning = findViewById<RadioButton>(R.id.rdMidmorning)
        val rbAfternoonLunch = findViewById<RadioButton>(R.id.rdAfternoonLunch)
        val rbAfternoonSnack = findViewById<RadioButton>(R.id.rdAfternoonSnack)
        val rbDinner = findViewById<RadioButton>(R.id.rdDinner)
        val rbDessert = findViewById<RadioButton>(R.id.rdDessert)
        val btnCompute = findViewById<Button>(R.id.btnCompute)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val txtResults = findViewById<TextView>(R.id.txtResults)

        // this part of the program allows the user to select an option and display the answer portrayed by selection
        btnCompute.setOnClickListener{
            var textHour = " "

            if (rbMorning.isChecked){
                textHour = "Your food options are: Eggs; Waffles; Bacon; Pancakes; Toast; Cereal"
            }
            else if (rbMidmorning.isChecked){
                textHour = " Your food options are: Muesli; Fruit Bowl; Fruits; Yoghurt"
            }
            else if (rbAfternoonLunch.isChecked){
                textHour= "Your food options are: Wraps; Sandwich; Burgers; Hot dogs; Kota"
            }
            else if (rbAfternoonSnack.isChecked){
                textHour = "Your food options are: Chocolate Bars; Muffins; Oat Bars; Cake; Chips"
            }
            else if (rbDinner.isChecked) {
                textHour = "Your food options are: Mice & Spaghetti; Seafood Pasta; Pizza; Sushi; Rice & Curry"
            }
            else if (rbDessert.isChecked){
                textHour = "Your food options are: Ice Cream; Cheesecake; Custard; Pudding"
            }
            else {
                textHour = "Kindly choose a reasonable answer for a reasonable meal plan"
            }
            txtResults.text = textHour
        }
// this part of the program allows the user to clear any suggestions previously given by the app.
        btnClear.setOnClickListener{
            txtResults.text = " "
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
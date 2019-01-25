package com.example.sternenhimmel

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import kotlinx.android.synthetic.main.activity_scrolling.*
import java.io.IOException

import okhttp3.*
import okhttp3.OkHttpClient

import android.widget.Toast


class ScrollingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scrolling)

        setSupportActionBar(toolbar)

        fun run(number: String) {
            Toast.makeText(this@ScrollingActivity, "API request: " + number, Toast.LENGTH_SHORT).show()
            val url = "http://192.168.4.1/api?cmd=!rst" + number + "%23"
            val request = Request.Builder().url(url).build()

            val client = OkHttpClient()

            client.newCall(request).enqueue(object : Callback {
                override fun onFailure(call: Call?, e: IOException?) {}
                override fun onResponse(call: Call?, response: Response?) {}
            })
        }


        val button_01 = findViewById<Button>(R.id.element_01)
        button_01.setOnClickListener {
            run("01")
        }
        val button_02 = findViewById<Button>(R.id.element_02)
        button_02.setOnClickListener {
            run("02")
        }
        val button_03 = findViewById<Button>(R.id.element_03)
        button_03.setOnClickListener {
            run("03")
        }
        val button_04 = findViewById<Button>(R.id.element_04)
        button_04.setOnClickListener {
            run("04")
        }
        val button_05 = findViewById<Button>(R.id.element_05)
        button_05.setOnClickListener {
            run("05")
        }
        val button_06 = findViewById<Button>(R.id.element_06)
        button_06.setOnClickListener {
            run("06")
        }
        val button_07 = findViewById<Button>(R.id.element_07)
        button_07.setOnClickListener {
            run("07")
        }
        val button_08 = findViewById<Button>(R.id.element_08)
        button_08.setOnClickListener {
            run("08")
        }
        val button_09 = findViewById<Button>(R.id.element_09)
        button_09.setOnClickListener {
            run("09")
        }
        val button_10 = findViewById<Button>(R.id.element_10)
        button_10.setOnClickListener {
            run("10")
        }
        val button_11 = findViewById<Button>(R.id.element_11)
        button_11.setOnClickListener {
            run("11")
        }
        val button_12 = findViewById<Button>(R.id.element_12)
        button_12.setOnClickListener {
            run("12")
        }
        val button_13 = findViewById<Button>(R.id.element_13)
        button_13.setOnClickListener {
            run("13")
        }
        val button_14 = findViewById<Button>(R.id.element_14)
        button_14.setOnClickListener {
            run("14")
        }
        val button_15 = findViewById<Button>(R.id.element_15)
        button_15.setOnClickListener {
            run("15")
        }
        val button_16 = findViewById<Button>(R.id.element_16)
        button_16.setOnClickListener {
            run("16")
        }
        val button_17 = findViewById<Button>(R.id.element_17)
        button_17.setOnClickListener {
            run("17")
        }
        val button_18 = findViewById<Button>(R.id.element_18)
        button_18.setOnClickListener {
            run("18")
        }
        val button_19 = findViewById<Button>(R.id.element_19)
        button_19.setOnClickListener {
            run("19")
        }
        val button_20 = findViewById<Button>(R.id.element_20)
        button_20.setOnClickListener {
            run("20")
        }
        val button_21 = findViewById<Button>(R.id.element_21)
        button_21.setOnClickListener {
            run("21")
        }
        val button_22 = findViewById<Button>(R.id.element_22)
        button_22.setOnClickListener {
            run("22")
        }
        val button_23 = findViewById<Button>(R.id.element_23)
        button_23.setOnClickListener {
            run("23")
        }
        val button_24 = findViewById<Button>(R.id.element_24)
        button_24.setOnClickListener {
            run("24")
        }
        val button_25 = findViewById<Button>(R.id.element_25)
        button_25.setOnClickListener {
            run("25")
        }
        val button_26 = findViewById<Button>(R.id.element_26)
        button_26.setOnClickListener {
            run("26")
        }
        val button_27 = findViewById<Button>(R.id.element_27)
        button_27.setOnClickListener {
            run("27")
        }
        val button_28 = findViewById<Button>(R.id.element_28)
        button_28.setOnClickListener {
            run("28")
        }


        val button_29 = findViewById<Button>(R.id.element_29)
        button_29.setOnClickListener {
            run("29")
        }
        val button_30 = findViewById<Button>(R.id.element_30)
        button_30.setOnClickListener {
            run("30")
        }
        val button_31 = findViewById<Button>(R.id.element_31)
        button_31.setOnClickListener {
            run("31")
        }
        val button_32 = findViewById<Button>(R.id.element_32)
        button_32.setOnClickListener {
            run("32")
        }
        val button_33 = findViewById<Button>(R.id.element_33)
        button_33.setOnClickListener {
            run("33")
        }
        val button_34 = findViewById<Button>(R.id.element_34)
        button_34.setOnClickListener {
            run("34")
        }
        val button_35 = findViewById<Button>(R.id.element_35)
        button_35.setOnClickListener {
            run("35")
        }
        val button_36 = findViewById<Button>(R.id.element_36)
        button_36.setOnClickListener {
            run("36")
        }
        val button_37 = findViewById<Button>(R.id.element_37)
        button_37.setOnClickListener {
            run("37")
        }
        val button_38 = findViewById<Button>(R.id.element_38)
        button_38.setOnClickListener {
            run("38")
        }
        val button_39 = findViewById<Button>(R.id.element_39)
        button_39.setOnClickListener {
            run("39")
        }
        val button_40 = findViewById<Button>(R.id.element_40)
        button_40.setOnClickListener {
            run("40")
        }



    }

    /*
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_scrolling, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
    */
}

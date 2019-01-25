package com.arte.ps.sternbilderapp

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_scrolling.*
import android.widget.Button
import android.widget.Toast
import okhttp3.*

import java.io.IOException
import java.lang.Exception
import java.util.concurrent.TimeUnit



class ScrollingActivity : AppCompatActivity() {
    
    private val client = OkHttpClient()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scrolling)
        setSupportActionBar(toolbar)

        fun run(number: String) {
            //Toast.makeText(this@ScrollingActivity, "API request: " + number, Toast.LENGTH_SHORT).show()
            val url = "http://192.168.4.1/api?cmd=!rst" + number + "%23"
            val request = Request.Builder().url(url).build()

            client.newCall(request).enqueue(object : Callback {
                override fun onFailure(call: Call?, e: IOException?) {}
                override fun onResponse(call: Call?, response: Response?) {}
            })
        }

        val button_44 = findViewById<Button>(R.id.element_44)
        button_44.setOnClickListener {
            run("44")
        }
        val button_47 = findViewById<Button>(R.id.element_47)
        button_47.setOnClickListener {
            run("47")
        }
        val button_51 = findViewById<Button>(R.id.element_51)
        button_51.setOnClickListener {
            run("51")
        }
        val button_53 = findViewById<Button>(R.id.element_53)
        button_53.setOnClickListener {
            run("53")
        }
        val button_42 = findViewById<Button>(R.id.element_42)
        button_42.setOnClickListener {
            run("42")
        }
        val button_23 = findViewById<Button>(R.id.element_23)
        button_23.setOnClickListener {
            run("23")
        }
        val button_11 = findViewById<Button>(R.id.element_11)
        button_11.setOnClickListener {
            run("11")
        }
        val button_10 = findViewById<Button>(R.id.element_10)
        button_10.setOnClickListener {
            run("10")
        }
        val button_03 = findViewById<Button>(R.id.element_03)
        button_03.setOnClickListener {
            run("03")
        }
        val button_02 = findViewById<Button>(R.id.element_02)
        button_02.setOnClickListener {
            run("02")
        }
        val button_01 = findViewById<Button>(R.id.element_01)
        button_01.setOnClickListener {
            run("01")
        }
        val button_76 = findViewById<Button>(R.id.element_76)
        button_76.setOnClickListener {
            run("76")
        }


        // Weitere Sternbilder
        val button_66 = findViewById<Button>(R.id.element_66)
        button_66.setOnClickListener {
            run("66")
        }
        val button_04 = findViewById<Button>(R.id.element_04)
        button_04.setOnClickListener {
            run("04")
        }
        val button_35 = findViewById<Button>(R.id.element_35)
        button_35.setOnClickListener {
            run("35")
        }
        val button_49 = findViewById<Button>(R.id.element_49)
        button_49.setOnClickListener {
            run("49")
        }
        val button_43 = findViewById<Button>(R.id.element_43)
        button_43.setOnClickListener {
            run("43")
        }
        val button_21 = findViewById<Button>(R.id.element_21)
        button_21.setOnClickListener {
            run("21")
        }
        val button_14 = findViewById<Button>(R.id.element_14)
        button_14.setOnClickListener {
            run("14")
        }
        val button_29 = findViewById<Button>(R.id.element_29)
        button_29.setOnClickListener {
            run("29")
        }
        val button_45 = findViewById<Button>(R.id.element_45)
        button_45.setOnClickListener {
            run("45")
        }
        val button_25 = findViewById<Button>(R.id.element_25)
        button_25.setOnClickListener {
            run("25")
        }
        val button_64 = findViewById<Button>(R.id.element_64)
        button_64.setOnClickListener {
            run("64")
        }
        val button_57 = findViewById<Button>(R.id.element_57)
        button_57.setOnClickListener {
            run("57")
        }
        val button_56 = findViewById<Button>(R.id.element_56)
        button_56.setOnClickListener {
            run("56")
        }
        val button_16 = findViewById<Button>(R.id.element_16)
        button_16.setOnClickListener {
            run("16")
        }
        val button_13 = findViewById<Button>(R.id.element_13)
        button_13.setOnClickListener {
            run("13")
        }
        val button_38 = findViewById<Button>(R.id.element_38)
        button_38.setOnClickListener {
            run("38")
        }
        val button_32 = findViewById<Button>(R.id.element_32)
        button_32.setOnClickListener {
            run("32")
        }
        val button_62 = findViewById<Button>(R.id.element_62)
        button_62.setOnClickListener {
            run("62")
        }
        val button_34 = findViewById<Button>(R.id.element_34)
        button_34.setOnClickListener {
            run("34")
        }
        val button_59 = findViewById<Button>(R.id.element_59)
        button_59.setOnClickListener {
            run("59")
        }
        val button_18 = findViewById<Button>(R.id.element_18)
        button_18.setOnClickListener {
            run("18")
        }
        val button_12 = findViewById<Button>(R.id.element_12)
        button_12.setOnClickListener {
            run("12")
        }
        val button_20 = findViewById<Button>(R.id.element_20)
        button_20.setOnClickListener {
            run("20")
        }
        val button_36 = findViewById<Button>(R.id.element_36)
        button_36.setOnClickListener {
            run("36")
        }
        val button_28 = findViewById<Button>(R.id.element_28)
        button_28.setOnClickListener {
            run("28")
        }
        val button_30 = findViewById<Button>(R.id.element_30)
        button_30.setOnClickListener {
            run("30")
        }
        val button_52 = findViewById<Button>(R.id.element_52)
        button_52.setOnClickListener {
            run("52")
        }
        val button_41 = findViewById<Button>(R.id.element_41)
        button_41.setOnClickListener {
            run("41")
        }
        val button_77 = findViewById<Button>(R.id.element_77)
        button_77.setOnClickListener {
            run("77")
        }
        val button_40 = findViewById<Button>(R.id.element_40)
        button_40.setOnClickListener {
            run("40")
        }
        val button_79 = findViewById<Button>(R.id.element_79)
        button_79.setOnClickListener {
            run("79")
        }
        val button_17 = findViewById<Button>(R.id.element_17)
        button_17.setOnClickListener {
            run("17")
        }
        val button_68 = findViewById<Button>(R.id.element_68)
        button_68.setOnClickListener {
            run("68")
        }
        val button_19 = findViewById<Button>(R.id.element_19)
        button_19.setOnClickListener {
            run("19")
        }
        val button_58 = findViewById<Button>(R.id.element_58)
        button_58.setOnClickListener {
            run("58")
        }
        val button_24 = findViewById<Button>(R.id.element_24)
        button_24.setOnClickListener {
            run("24")
        }
        val button_37 = findViewById<Button>(R.id.element_37)
        button_37.setOnClickListener {
            run("37")
        }
        val button_15 = findViewById<Button>(R.id.element_15)
        button_15.setOnClickListener {
            run("15")
        }
        val button_80 = findViewById<Button>(R.id.element_80)
        button_80.setOnClickListener {
            run("80")
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
        val button_27 = findViewById<Button>(R.id.element_27)
        button_27.setOnClickListener {
            run("27")
        }
        val button_78 = findViewById<Button>(R.id.element_78)
        button_78.setOnClickListener {
            run("78")
        }
        val button_67 = findViewById<Button>(R.id.element_67)
        button_67.setOnClickListener {
            run("67")
        }
        val button_61 = findViewById<Button>(R.id.element_61)
        button_61.setOnClickListener {
            run("61")
        }
        val button_46 = findViewById<Button>(R.id.element_46)
        button_46.setOnClickListener {
            run("46")
        }
        val button_70 = findViewById<Button>(R.id.element_70)
        button_70.setOnClickListener {
            run("70")
        }
        val button_69 = findViewById<Button>(R.id.element_69)
        button_69.setOnClickListener {
            run("69")
        }
        val button_26 = findViewById<Button>(R.id.element_26)
        button_26.setOnClickListener {
            run("26")
        }
        val button_60 = findViewById<Button>(R.id.element_60)
        button_60.setOnClickListener {
            run("60")
        }
        val button_65 = findViewById<Button>(R.id.element_65)
        button_65.setOnClickListener {
            run("65")
        }
        val button_71 = findViewById<Button>(R.id.element_71)
        button_71.setOnClickListener {
            run("71")
        }
        val button_05 = findViewById<Button>(R.id.element_05)
        button_05.setOnClickListener {
            run("05")
        }
        val button_54 = findViewById<Button>(R.id.element_54)
        button_54.setOnClickListener {
            run("54")
        }
        val button_33 = findViewById<Button>(R.id.element_33)
        button_33.setOnClickListener {
            run("33")
        }
        val button_22 = findViewById<Button>(R.id.element_22)
        button_22.setOnClickListener {
            run("22")
        }
        val button_06 = findViewById<Button>(R.id.element_06)
        button_06.setOnClickListener {
            run("06")
        }
        val button_72 = findViewById<Button>(R.id.element_72)
        button_72.setOnClickListener {
            run("72")
        }
        val button_39 = findViewById<Button>(R.id.element_39)
        button_39.setOnClickListener {
            run("39")
        }
        val button_63 = findViewById<Button>(R.id.element_63)
        button_63.setOnClickListener {
            run("63")
        }
        val button_55 = findViewById<Button>(R.id.element_55)
        button_55.setOnClickListener {
            run("55")
        }
        val button_31 = findViewById<Button>(R.id.element_31)
        button_31.setOnClickListener {
            run("31")
        }
        val button_81 = findViewById<Button>(R.id.element_81)
        button_81.setOnClickListener {
            run("81")
        }


    }
}

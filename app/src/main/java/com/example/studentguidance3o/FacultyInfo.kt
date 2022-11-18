package com.example.studentguidance3o

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class FacultyInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faculty_info)

        var img:ImageView=findViewById(R.id.img)
        var name:TextView=findViewById(R.id.textView2)
        var level:TextView=findViewById(R.id.textView62)
        var nextname:TextView=findViewById(R.id.textView68)
        var department:TextView=findViewById(R.id.textView69)
        var cabin:TextView=findViewById(R.id.textView70)
        var mailID:TextView=findViewById(R.id.textView71)

        var bundle:Bundle=intent.extras!!
        var imageRes:Int=bundle.getInt("image")

        img.setImageResource(imageRes)
        name.text=bundle.getString("name")
        level.text=bundle.getString("level")
        nextname.text=bundle.getString("name")
        department.text=bundle.getString("department")
        cabin.text=bundle.getString("cabin")
        mailID.text=bundle.getString("mailID")
    }
}



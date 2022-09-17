package com.example.practice_fitness

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.practice_fitness.fitness.Fitness_Hi

class SelectFitnessActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selectfitness)

        val hiButton = findViewById<Button>(R.id.hiButton)

        //selectFitness 화면에서 hiButton 선택 시
        hiButton.setOnClickListener{
            var intent = Intent(this, Fitness_Hi::class.java)
            startActivity(intent)
        }
    }
}
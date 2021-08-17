package com.praneeth.task1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.praneeth.task1.databinding.ActivityMainBinding

class LandingPageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mbRegisterButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, ProfilePageActivity::class.java)
            startActivity(intent)
        })

    }
}
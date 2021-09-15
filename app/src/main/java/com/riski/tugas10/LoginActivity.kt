package com.riski.tugas10

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.util.Log
import com.riski.tugas10.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var isPassVisible = false

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

            register.setOnClickListener {
                startActivity(Intent(this@LoginActivity, RegisterActivity::class.java))
            }

            visibility.setOnClickListener {
                if (isPassVisible) {
                    visibility.setImageResource(R.drawable.ic_baseline_visibility_off_24)
                    isPassVisible = false
                    edtPass.transformationMethod = PasswordTransformationMethod.getInstance()
                } else {
                    visibility.setImageResource(R.drawable.ic_baseline_visibility_24)
                    isPassVisible = true
                    edtPass.transformationMethod = HideReturnsTransformationMethod.getInstance()
                }
            }
        }
    }
}
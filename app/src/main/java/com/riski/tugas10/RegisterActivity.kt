package com.riski.tugas10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import com.riski.tugas10.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding
    private var isPassVisible = false
    private var isPassConfirmVisible = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnBack.setOnClickListener {
                onBackPressed()
            }

            passVisible.setOnClickListener {
                if (isPassVisible) {
                    passVisible.setImageResource(R.drawable.ic_baseline_visibility_off_24)
                    isPassVisible = false
                    edtPass.transformationMethod = PasswordTransformationMethod.getInstance()
                } else {
                    passVisible.setImageResource(R.drawable.ic_baseline_visibility_24)
                    isPassVisible = true
                    edtPass.transformationMethod = HideReturnsTransformationMethod.getInstance()
                }
            }

            passConfirmVisible.setOnClickListener {
                if (isPassConfirmVisible) {
                    passConfirmVisible.setImageResource(R.drawable.ic_baseline_visibility_off_24)
                    isPassConfirmVisible = false
                    edtPassConfirm.transformationMethod = PasswordTransformationMethod.getInstance()
                } else {
                    passConfirmVisible.setImageResource(R.drawable.ic_baseline_visibility_24)
                    isPassConfirmVisible = true
                    edtPassConfirm.transformationMethod = HideReturnsTransformationMethod.getInstance()
                }
            }
        }
    }
}
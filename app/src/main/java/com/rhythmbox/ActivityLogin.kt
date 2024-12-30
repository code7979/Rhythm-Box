package com.rhythmbox

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.rhythmbox.databinding.ActivityLoginBinding

class ActivityLogin : AppCompatActivity(), View.OnClickListener {
  private lateinit var binding: ActivityLoginBinding
  
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityLoginBinding.inflate(layoutInflater)
    setContentView(binding.root)
    binding.dotHaveAccount.setOnClickListener(this)
  }
  
  override fun onClick(v: View) {
    when (v.id) {
      R.id.dot_have_account -> {
        startActivity(Intent(ActivityLogin@ this, ActivitySignup::class.java))
      }
    }
  }
}
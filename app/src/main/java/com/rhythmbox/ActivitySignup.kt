package com.rhythmbox

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.rhythmbox.databinding.ActivityLoginBinding
import com.rhythmbox.databinding.ActivitySignupBinding

class ActivitySignup : AppCompatActivity(), View.OnClickListener {
  private lateinit var binding: ActivitySignupBinding
  
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivitySignupBinding.inflate(layoutInflater)
    setContentView(binding.root)
    
    
  }
  
  override fun onClick(v: View) {
  
  }
}
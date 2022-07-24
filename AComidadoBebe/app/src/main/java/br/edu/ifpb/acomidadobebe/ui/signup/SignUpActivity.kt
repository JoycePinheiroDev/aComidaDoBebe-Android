package br.edu.ifpb.acomidadobebe.ui.signup

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.edu.ifpb.acomidadobebe.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
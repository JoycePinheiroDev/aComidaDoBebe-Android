package br.edu.ifpb.acomidadobebe.ui.splash

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.edu.ifpb.acomidadobebe.databinding.ActivitySplashScreenBinding

class SplashScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}
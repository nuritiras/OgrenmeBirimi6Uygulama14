package tr.com.nuritiras.ogrenmebirimi6uygulama14

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import tr.com.nuritiras.ogrenmebirimi6uygulama14.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        enableEdgeToEdge()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun onClickGiris(view: View) {

        Singleton.kullaniciAdi = binding.editTextKullaniciAdi.text.toString()
        Singleton.kullaniciParola = binding.editTextSifre.text.toString()
        if (Singleton.kullaniciAdi.equals("admin") && Singleton.kullaniciParola.equals("123"))
        {
            val intent = Intent(this, AnaSayfa::class.java)
            startActivity(intent)
        }
        else
            Toast.makeText(this, "Kullanıcı adı veya şifre hatalı", Toast.LENGTH_SHORT).show()

    }
}
package tr.com.nuritiras.ogrenmebirimi6uygulama14

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import tr.com.nuritiras.ogrenmebirimi6uygulama14.databinding.ActivityAnaSayfaBinding

class AnaSayfa : AppCompatActivity() {

    private lateinit var binding: ActivityAnaSayfaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAnaSayfaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        enableEdgeToEdge()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.textViewKullaniciAdi.text = Singleton.kullaniciAdi
        binding.textViewKullaniciSifre.text = Singleton.kullaniciParola
    }
}
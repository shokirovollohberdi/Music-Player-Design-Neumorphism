package uz.authentication.musicplayerneumorphist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.authentication.adapter.RvAdapter
import uz.authentication.model.Music
import uz.authentication.musicplayerneumorphist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var music = ArrayList<Music>()
        music.add(Music("Michael Jackson", "Smooth Criminal", R.drawable.smooth))
        music.add(Music("Ramil ", "Сияй", R.drawable.siyay))
        music.add(Music("Michael Jackson", "They Don't Care About Us", R.drawable.dont_care))
        music.add(Music("Xxxtentacion", "Change", R.drawable.change))
        music.add(Music("The Limba & Andro", " X.O", R.drawable.xo))
        music.add(Music("Gafur ", "Февраль", R.drawable.fevral))
        music.add(Music("Rauf Faik ", "Childhood", R.drawable.childhool))
        music.add(Music("JONY", "Love your voice", R.drawable.loveyourvoice))
        music.add(Music("ЕГОР КРИД", "COSMOBOY (PUBG MOBILE)", R.drawable.cosmoboy))
        music.add(Music("JONY, The Limba", "Босс", R.drawable.boss))

        var adapter = RvAdapter(music,this)
        binding.rv.adapter = adapter



    }
}
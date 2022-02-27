package uz.authentication.musicplayerneumorphist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.authentication.model.Music
import uz.authentication.musicplayerneumorphist.databinding.ActivityMusicPlayBinding

class MusicPlayActivity : AppCompatActivity() {
    lateinit var binding: ActivityMusicPlayBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMusicPlayBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var music = intent.getSerializableExtra("key") as Music

        binding.textTitle.text = music.songName
        binding.musicImage.setImageResource(music.imageSong)
        binding.textArtist.text = music.singer
        binding.textArtist.setSingleLine()
        binding.textTitle.setSingleLine()

    }
}
package uz.authentication.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import maes.tech.intentanim.CustomIntent.customType
import uz.authentication.model.Music
import uz.authentication.musicplayerneumorphist.MusicPlayActivity
import uz.authentication.musicplayerneumorphist.databinding.ItemRvBinding

class RvAdapter(var list: ArrayList<Music>, var context: Context) :
    RecyclerView.Adapter<RvAdapter.Vh>() {
    inner class Vh(var itemRv: ItemRvBinding) : RecyclerView.ViewHolder(itemRv.root) {
        fun onBind(music: Music, position: Int) {
            itemRv.itemMusicName.text = music.songName
            itemRv.itemMusicSinger.text = music.singer
            itemRv.itemMusicImage.setImageResource(music.imageSong)
            itemRv.root.setOnClickListener {
                var intent = Intent(context, MusicPlayActivity::class.java)
                intent.putExtra("key",music)
                context.startActivity(intent)
                customType(context,"bottom-to-up");
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent?.context), parent, false))
    }


    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int = list.size
}
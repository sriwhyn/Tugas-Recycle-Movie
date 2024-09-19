package com.sriwahyuni.latihan6.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.sriwahyuni.latihan6.MovieActivity
import com.sriwahyuni.latihan6.R
import com.sriwahyuni.latihan6.model.ModelMovie

class MovieAdapter constructor(
    private val getActivity: MovieActivity, //ini agar item recycle bisa di klik
    private val movieList: List<ModelMovie>
) : RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {
    //    new*
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtMovie: TextView = itemView.findViewById(R.id.txtMovie)
        val imgMovie: ImageView = itemView.findViewById(R.id.imgMovie)
        val cardMovie: CardView = itemView.findViewById(R.id.cardMovie)
    }

    //    new*
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieAdapter.MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_movie_card, parent, false)
        return MyViewHolder(nView)
    }

    //    new*
    override fun onBindViewHolder(holder: MovieAdapter.MyViewHolder, position: Int) {
        holder.txtMovie.text = movieList[position].title
        holder.imgMovie.setImageResource(movieList[position].image)
//        agar bisa di klik
        holder.cardMovie.setOnClickListener() {
            Toast.makeText(getActivity, movieList[position].title, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

}
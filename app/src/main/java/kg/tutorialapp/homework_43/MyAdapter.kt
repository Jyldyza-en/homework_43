package kg.tutorialapp.homework_43

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlin.collections.ArrayList

class MyAdapter(private val context: Context, private val myList: ArrayList<String>): RecyclerView.Adapter<MyAdapter.ViewHolder>(){


    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(myItem: String) {
            val tvTitle = itemView.findViewById<TextView>(R.id.tv_text)
            tvTitle.text = myItem
            itemView.setOnClickListener {
                Toast.makeText(context, myItem, Toast.LENGTH_LONG).show()
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val myListItem = LayoutInflater.from(context).inflate(R.layout.item_recycler_view, parent, false)
        return ViewHolder(myListItem)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(myList[position])
    }

    override fun getItemCount(): Int {
        return myList.count()
    }


}
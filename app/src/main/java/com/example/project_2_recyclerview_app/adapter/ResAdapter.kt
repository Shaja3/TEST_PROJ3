package com.example.project_2_recyclerview_app.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.project_2_recyclerview_app.R
import com.example.project_2_recyclerview_app.model.Res

class ResAdapter (
    private val dataset: List<Res>,
    private val context: Context
)
    : RecyclerView.Adapter<ResAdapter.ResViewHolder>() {

    // Adapter helper class to arrange data in layout file
    class ResViewHolder(private val view : View) : RecyclerView.ViewHolder(view){
        val textView : TextView = view.findViewById(R.id.item_title)
        val imageView : ImageView = view.findViewById(R.id.item_imageView)
        val countView : TextView = view.findViewById(R.id.item_Count)
    }

    // 3 functions
    // تعرف ملف ال layout الخاص بالعنصر
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)

        return ResViewHolder(adapterLayout)
    }

    // تربط البيانات بالقالب الخاص بها بمساعدة ViewHolder
    override fun onBindViewHolder(holder: ResViewHolder, position: Int) {
        // save the position of them (which item i'm dealing with)
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.ResStringId)
        holder.imageView.setImageResource(item.ResImageId)
        holder.countView.text = context.resources.getText(item.ResCountId)
    }

    // تحدد عدد البيانات في القائمة
    override fun getItemCount() = dataset.size


}
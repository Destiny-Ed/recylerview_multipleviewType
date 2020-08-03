package com.destinyed.recyclerview.RecyclerViewHolder

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.destinyed.recyclerview.R

class viewAdapter(var ctx : Context, var arrList : ArrayList<viewModel>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        var layoutInflater = LayoutInflater.from(parent.context)
        var view : View

        if (viewType == 0){
            view = layoutInflater.inflate(R.layout.custom_model, parent, false)
            return viewHolderOne(view)
        }
        else{
            view = layoutInflater.inflate(R.layout.custom_model_second, parent, false)
            return viewHolderTwo(view)
        }
    }

    override fun getItemViewType(position: Int): Int {
        if (!arrList[position].title.toLowerCase().contains("javascript")){
            return 0
        }
        return 1
    }

    override fun getItemCount(): Int {
        return arrList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(!arrList[position].title.toLowerCase().contains("javascript")){
            var holder = holder as viewHolderOne
            return holder.bindItemsOne(arrList[position])
        }
        else{
            //bind the second viewHolder
            var holder = holder as viewHolderTwo
            return holder.bindItemsTwo(arrList[position])
        }
    }


    inner class viewHolderOne(itemView : View) : RecyclerView.ViewHolder(itemView) {

        fun bindItemsOne(item : viewModel) {
            var title = itemView.findViewById<TextView>(R.id.viewTitle)
            var subTitle = itemView.findViewById<TextView>(R.id.viewSubtitle)

            title.text = item.title
            subTitle.text = item.subTitle
        }
    }


    inner class viewHolderTwo(itemView: View) : RecyclerView.ViewHolder(itemView){

        fun bindItemsTwo(item : viewModel) {
            var image = itemView.findViewById<ImageView>(R.id.imageFirst)
            var title = itemView.findViewById<TextView>(R.id.titleSecond)

            title.text = item.title

        }

    }


}













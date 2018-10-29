package com.lab.mazerapp.cbi.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lab.mazerapp.cbi.R
import com.lab.mazerapp.cbi.models.Product
import kotlinx.android.synthetic.main.item_menu.view.*

class MenuAdapter() : RecyclerView.Adapter<MenuAdapter.ViewHolder>() {

    var listProducts : ArrayList<Product> = arrayListOf()

    fun addToList(listProducts : ArrayList<Product>){
        this.listProducts.addAll(listProducts)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_menu, parent,false))
    }

    override fun getItemCount(): Int {return listProducts.size}

    override fun onBindViewHolder(holder: ViewHolder, pos: Int) {
        holder.bindItems(listProducts[pos])
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindItems(product: Product){
            itemView.title_product.text = product.nameFood
            itemView.price_product.text = "R$ " + product.price.toString()
        }
    }
}
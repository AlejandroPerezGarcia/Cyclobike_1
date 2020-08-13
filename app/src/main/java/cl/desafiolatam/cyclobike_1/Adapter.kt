package cl.desafiolatam.cyclobike_1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CyclobikeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

class CycloAdapter :RecyclerView.Adapter<CyclobikeViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CyclobikeViewHolder {

        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return CyclobikeViewHolder(view)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: CyclobikeViewHolder, position: Int) {
        TODO("Not yet implemented")
    }


}
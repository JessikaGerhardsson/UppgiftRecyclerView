package se.jessikagerhardsson.uppgiftrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RowAdapter() : RecyclerView.Adapter<MyViewHolder>() {

    var nytt = mutableListOf<String>("Rad ")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val vh = MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_rowadapter, parent, false))
        return vh
    }
    override fun getItemCount(): Int {
        return nytt.size
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {



    }
}
class MyViewHolder (view: View) : RecyclerView.ViewHolder(view) {

    var hejsan = view.findViewById<TextView>(R.id.rowTV)

}
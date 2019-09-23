package layout

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lab7dialogrv_sec1_603021719_0.R
import kotlinx.android.synthetic.main.std_item_layout.view.*

class StudentsAdapte(val items :List<Student>,val context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view_item = LayoutInflater.from(parent.context).inflate(R.layout.std_item_layout, parent, false)
        return  ViewHolder(view_item)
    }

    override fun getItemCount(): Int {
        return items.size
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvID?.text = "ID: " + items[position].id
        holder.tvName?.text = "Name : " + items[position].name
        holder.tvAge?.text = "Age : " + items[position].age.toString()
    }
}
class ViewHolder (view: View) : RecyclerView.ViewHolder(view){
    val tvID = view.tv_id
    val tvName = view.tv_name
    val tvAge = view.tv_age
}

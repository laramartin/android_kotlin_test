package eu.laramartin.kotlintest

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.list_row.view.*

class NumbersAdapter(private val numbers: List<Int>) : RecyclerView.Adapter<NumbersAdapter.NumbersViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : NumbersViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_row, parent, false)
        return NumbersViewHolder(view)
    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        holder.bind(numbers[position])
    }

    override fun getItemCount(): Int = numbers.size

    class NumbersViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        fun bind(number: Int) {
            itemView.number_text_view.setText(number)
        }
    }

}

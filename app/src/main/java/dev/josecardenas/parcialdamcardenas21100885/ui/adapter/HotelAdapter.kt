package dev.josecardenas.parcialdamcardenas21100885.ui.adapter

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.josecardenas.parcialdamcardenas21100885.R
import dev.josecardenas.parcialdamcardenas21100885.ui.model.HotelModel

class HotelAdapter(private var lstHoteles: List<HotelModel>):
        RecyclerView.Adapter<HotelAdapter.HotelViewHolder>(){
            class HotelViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
                val tvNombre: TextView = itemView.findViewById(R.id.tvNombre)
                val tvPrecio: TextView = itemView.findViewById(R.id.tvPrecio)
                val tvReseña: TextView = itemView.findViewById(R.id.tvReseña)
                val tvDescripcion: TextView = itemView.findViewById(R.id.tvDescripcion)
            }
            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                return ViewHolder(layoutInflater.inflate(R.layout.item_hotel, parent, false))
            }

            override fun getItemCount(): Int {
                return lstHoteles.size
            }
            override fun onBindViewHolder(holder: ViewHolder, position: Int) {
                val item = lstHoteles[position]
                holder.ivHotel.setImageResource(item.imagen)
                holder.tvNombre.text = item.nombre
                holder.tvPrecio.text = item.precio.toString()
                holder.tvReseña.text = item.reseña.toString()
                holder.tvDescripcion.text = item.descripcion.toString()
            }
}
package dev.josecardenas.parcialdamcardenas21100885.ui.presupuesto

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import dev.josecardenas.parcialdamcardenas21100885.R

class PresupuestoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_presupuesto, container, false)
        val etCostVuelo = rootView.findViewById<EditText>(R.id.etCostVuelo)
        val etCostAlojamiento = rootView.findViewById<EditText>(R.id.etCostAlojamiento)
        val etCantNoches = rootView.findViewById<EditText>(R.id.etCantNoches)
        val etCostComidas = rootView.findViewById<EditText>(R.id.etCostComidas)
        val cbTerminos = rootView.findViewById<CheckBox>(R.id.cbTerminos)
        val btnCalcular = rootView.findViewById<Button>(R.id.btnCalcular)
        val tvResultado = rootView.findViewById<TextView>(R.id.tvResultado)

        btnCalcular.setOnClickListener {
            val costoVueloString = etCostVuelo.text.toString()
            val costoAlojamientoString = etCostAlojamiento.text.toString()
            val cantNochesString = etCantNoches.text.toString()
            val costoComidasString = etCostComidas.text.toString()

            if (costoVueloString.isNotEmpty() && costoAlojamientoString.isNotEmpty() && cantNochesString.isNotEmpty() && costoComidasString.isNotEmpty() && cbTerminos.isChecked) {
                val costoVuelo = costoVueloString.toDouble()
                val costoAlojamiento = costoAlojamientoString.toDouble()
                val cantNoches = cantNochesString.toInt()
                val costoComidas = costoComidasString.toDouble()

                val presupuestoTotal = costoVuelo + (costoAlojamiento * cantNoches) + (costoComidas * cantNoches)
                tvResultado.text = "El presupueto total es: $presupuestoTotal"
            } else {
                tvResultado.text = "Por favor, complete todos los campos y acepte los términos."
            }

        }
        return inflater.inflate(R.layout.fragment_presupuesto, container, false)
    }

}
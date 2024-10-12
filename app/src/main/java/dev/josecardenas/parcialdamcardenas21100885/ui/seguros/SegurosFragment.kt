package dev.josecardenas.parcialdamcardenas21100885.ui.seguros

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import dev.josecardenas.parcialdamcardenas21100885.R

class SegurosFragment : Fragment() {

    var arraySeguros = arrayOf(
        "GlobeGuarf Insurance","SafeJourney Coverage","TravelShield Protection",
        "VoyageSecure","WanderSure Travel Insurance"
    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_seguros, container, false)
        val lstSeguros: ListView = view.findViewById(R.id.lstSeguros)
        val adaptador = ArrayAdapter<String>(
            requireContext(),
            android.R.layout.simple_list_item_1,
            arraySeguros
        )
        lstSeguros.adapter = adaptador
        return view
    }

}
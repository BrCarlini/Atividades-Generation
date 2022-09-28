package br.com.brcarlini.todoandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.brcarlini.todoandroid.adapter.TarefaAdapter
import br.com.brcarlini.todoandroid.databinding.FragmentListBinding
import br.com.brcarlini.todoandroid.model.Tarefa
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentListBinding.inflate(layoutInflater, container, false)


        val listTarefas = listOf(
            Tarefa(
                "Lavar a louça",
                "Lavar a louça o dia todo",
                "Bruno",
                "2022-11-23",
                false,
                "Dia a Dia"
            ),
            Tarefa(
                "Estudar Kotlin",
                "Estudar Kotlin durante 2 horas",
                "Bruno",
                "2022-11-04",
                false,
                "Dia a Dia"
            ),
            Tarefa(
                "Jogar Warzone",
                "Jogar Wz após as 19 horas",
                "Bruno",
                "2022-11-13",
                false,
                "Lazer"
            ),
            Tarefa(
                "Fazer Academia",
                "Treinar durante 1:20",
                "Bruno",
                "2022-09-26",
                true,
                "Dia a Dia"
            )
        )

        // Configurações do RecyclerView
        val adapter = TarefaAdapter()
        binding.recyclerTarefa.layoutManager =  LinearLayoutManager(context)
        binding.recyclerTarefa.adapter = adapter
        binding.recyclerTarefa.setHasFixedSize(true)

        adapter.setList(listTarefas)

        binding.floatingAdd.setOnClickListener{
            findNavController().navigate(R.id.action_listFragment_to_formFragment)
        }



        return binding.root
    }

}
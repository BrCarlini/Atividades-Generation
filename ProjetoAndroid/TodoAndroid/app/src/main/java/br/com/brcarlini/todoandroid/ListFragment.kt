package br.com.brcarlini.todoandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.brcarlini.todoandroid.adapter.TarefaAdapter
import br.com.brcarlini.todoandroid.adapter.TaskClickListener
import br.com.brcarlini.todoandroid.databinding.FragmentListBinding
import br.com.brcarlini.todoandroid.model.Tarefa
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListFragment : Fragment(), TaskClickListener {

    private lateinit var binding: FragmentListBinding
    private val mainViewModel: MainViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentListBinding.inflate(layoutInflater, container, false)
        mainViewModel.listTarefa()


        // Configurações do RecyclerView
        val adapter = TarefaAdapter(this, mainViewModel, requireContext())
        binding.recyclerTarefa.layoutManager =  LinearLayoutManager(context)
        binding.recyclerTarefa.adapter = adapter
        binding.recyclerTarefa.setHasFixedSize(true)

        binding.floatingAdd.setOnClickListener{
            mainViewModel.tarefaSelecionada = null
            findNavController().navigate(R.id.action_listFragment_to_formFragment)
        }

        mainViewModel.myTarefaResponse.observe(viewLifecycleOwner){
            response -> if(response != null){
                adapter.setList(response.body()!!)
            }
        }



        return binding.root
    }

    override fun onTaskClickListner(tarefa: Tarefa) {
        mainViewModel.tarefaSelecionada = tarefa
        findNavController().navigate(R.id.action_listFragment_to_formFragment)
    }

}
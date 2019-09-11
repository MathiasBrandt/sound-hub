package com.mathiasbrandt.soundhub

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class MainFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // create view model
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        val binding = DataBindingUtil.inflate<FragmentLoginBinding>(inflater,
//            R.layout.fragment_login, container, false)
//        binding.lifecycleOwner = this
//        binding.viewModel = viewModel

//        return binding.root
        return View(context)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        btn_signup.setOnClickListener {
//            findNavController().navigate(LoginFragmentDirections.actionLoginToSignup())
//        }
    }
}
package com.example.wuyeapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.wuyeapp.R
import com.example.wuyeapp.databinding.FragmentUnlockBinding

class UnlockFragment : Fragment() {

    private var _binding: FragmentUnlockBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentUnlockBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnUnlock.setOnClickListener {
            Toast.makeText(context, "执行开锁操作", Toast.LENGTH_SHORT).show()
            // 实现开锁逻辑
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

package com.example.wuyeapp.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.wuyeapp.activities.SettingsActivity
import com.example.wuyeapp.R
import com.example.wuyeapp.databinding.FragmentMyBinding

class MyFragment : Fragment() {

    private var _binding: FragmentMyBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentMyBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 显示用户信息
        binding.tvPhone.text = "手机号: 13800000000"
        binding.tvAddress.text = "住址: 崔氏科技∙1区∙1栋∙1单元∙0102"

        // 功能选项点击事件
        binding.btnSwitchOwner.setOnClickListener {
            Toast.makeText(context, "切换业主", Toast.LENGTH_SHORT).show()
            // 实现切换业主逻辑
        }

        binding.btnFaceRecord.setOnClickListener {
            Toast.makeText(context, "人脸录制", Toast.LENGTH_SHORT).show()
            // 实现人脸录制逻辑
        }

        binding.btnSettings.setOnClickListener {
            val intent = Intent(activity, SettingsActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

package com.example.wuyeapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.wuyeapp.R
import com.example.wuyeapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 设置住址信息与状态
        binding.tvAddress.text = "崔氏科技∙1区∙1栋∙1单元∙0102"
        binding.tvStatus.text = "在线"

        // 设置主要功能按钮的点击事件
        binding.btnHht.setOnClickListener {
            Toast.makeText(context, "户户通功能", Toast.LENGTH_SHORT).show()
            // 处理户户通功能
        }
        binding.btnMonitor.setOnClickListener {
            Toast.makeText(context, "监视功能", Toast.LENGTH_SHORT).show()
            // 处理监视功能
        }
        binding.btnInviteVisitor.setOnClickListener {
            Toast.makeText(context, "邀请访客功能", Toast.LENGTH_SHORT).show()
            // 处理邀请访客功能
        }
        binding.btnCallElevator.setOnClickListener {
            Toast.makeText(context, "呼叫电梯功能", Toast.LENGTH_SHORT).show()
            // 处理呼叫电梯功能
        }
        binding.btnScanOpen.setOnClickListener {
            Toast.makeText(context, "扫码开门功能", Toast.LENGTH_SHORT).show()
            // 处理扫码开门功能
        }
        binding.btnCommunityNotify.setOnClickListener {
            Toast.makeText(context, "社区通知功能", Toast.LENGTH_SHORT).show()
            // 处理社区通知功能
        }
        binding.btnAlarmRecord.setOnClickListener {
            Toast.makeText(context, "报警记录功能", Toast.LENGTH_SHORT).show()
            // 处理报警记录功能
        }
        binding.btnMore.setOnClickListener {
            Toast.makeText(context, "更多功能", Toast.LENGTH_SHORT).show()
            // 处理更多功能
        }

        // 生活服务板块
        binding.btnHousekeeping.setOnClickListener {
            Toast.makeText(context, "家政服务", Toast.LENGTH_SHORT).show()
            // 处理家政服务
        }
        binding.btnExpress.setOnClickListener {
            Toast.makeText(context, "快递服务", Toast.LENGTH_SHORT).show()
            // 处理快递服务
        }
        binding.btnLocalLife.setOnClickListener {
            Toast.makeText(context, "本地生活", Toast.LENGTH_SHORT).show()
            // 处理本地生活服务
        }

        // 提示暂无通知
        binding.tvNoNotification.visibility = View.VISIBLE
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

package com.example.stikerrli

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.stikerrli.databinding.ActivityAdminDashboardBinding

class AdminDashboardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAdminDashboardBinding
    private lateinit var session: SessionManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdminDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        session = SessionManager(this)

        // Set admin name from session
        binding.tvAdminName.text = session.getUserName()

        binding.cardManageStickers.setOnClickListener {
            val intent = Intent(this, AdminStickerListActivity::class.java)
            startActivity(intent)
        }

        binding.cardSeeOrders.setOnClickListener {
            val intent = Intent(this, AdminOrderListActivity::class.java)
            startActivity(intent)
        }

        binding.btnLogout.setOnClickListener {
            session.logout()
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            finish()
        }
    }
}
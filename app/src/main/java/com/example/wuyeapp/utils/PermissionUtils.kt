package com.example.wuyeapp.utils

import android.app.Activity
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

object PermissionUtils {
    fun checkAndRequestPermissions(activity: Activity, permissions: Array<String>, requestCode: Int): Boolean {
        val listPermissionsNeeded = mutableListOf<String>()
        for (permission in permissions) {
            if (ContextCompat.checkSelfPermission(activity, permission) != PackageManager.PERMISSION_GRANTED) {
                listPermissionsNeeded.add(permission)
            }
        }
        return if (listPermissionsNeeded.isNotEmpty()) {
            ActivityCompat.requestPermissions(activity, listPermissionsNeeded.toTypedArray(), requestCode)
            false
        } else {
            true
        }
    }
}

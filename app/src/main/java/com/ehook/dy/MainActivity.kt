package com.ehook.dy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ehook.EasyHook
import com.ehook.utils.CmdUtil
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        CmdUtil.isRoot
        sample_test.setOnClickListener {
        }

    }

    override fun onDestroy() {
        super.onDestroy()
    }
    override fun onResume() {
        super.onResume()
        if (checkHook()) {
            val path = EasyHook.getApplicationApkPath(
                this,
                AppGlobal.TARGET_PACKAGE
            )
            sample_text.text = "hooked = true  \n  \n $path"
        }
    }

    fun checkHook(): Boolean {
        return false
    }

    override fun onBackPressed() {
        super.onBackPressed()
        System.exit(0)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }
}

package com.example.registeractivity

import android.content.ContentValues.TAG
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.widget.Toast
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.result.registerForActivityResult
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.registeractivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            /*val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)*/
            /*startActivityForResult(intent,100)*/

            cameraLauncher.launch(android.Manifest.permission.CAMERA)
            /*setUpPermission()*/
        }
    }

    val cameraLauncher = registerForActivityResult(ActivityResultContracts.RequestPermission()){
        if(it){
            Toast.makeText(this,"camera invoke successfully",Toast.LENGTH_LONG).show()
        }
        else{
            Toast.makeText(this,"camera invoke failed",Toast.LENGTH_LONG).show()
        }
    }

    /*private fun setUpPermission(){
        val permission = ContextCompat.checkSelfPermission(this,
            android.Manifest.permission.CAMERA)

        if (permission != PackageManager.PERMISSION_GRANTED) {
            Log.i(TAG, "Permission to record denied")
        }
    }*/

   /* var cameraLauncher: ActivityResultLauncher<Intent> = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult(), ActivityResultCallback {
            if (it.resultCode == RESULT_OK) {
               binding.imageview1.setImageBitmap(it.data?.extras?.get("data") as Bitmap)
            }
        })*/

/*private var launcher = registerForActivityResult(ActivityResultContracts.TakePicture()){
        if(it){
            Toast.makeText(this,"camera invoke successfully",Toast.LENGTH_LONG).show()
            *//*binding.imageview1.setImageBitmap(data.extras?.get("data") as Bitmap)*//*
        }
        else{
            Toast.makeText(this,"camera invoke failed",Toast.LENGTH_LONG).show()
        }
        *//*if (it.resultCode== RESULT_OK){
            val result = it.data
            val Data = result!!.getStringExtra("result").toString()
            binding.tv1.text = Data
        }*//*
    }*/

     /*override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
         super.onActivityResult(requestCode, resultCode, data)
         if(requestCode==100 && resultCode == RESULT_OK){
             *//*val Result = data?.getStringExtra("result").toString()*//*
             if (data != null) {
                 binding.imageview1.setImageBitmap(data.extras?.get("data") as Bitmap)
                 Toast.makeText(this,"camea invoke failed ",Toast.LENGTH_LONG).show()
             }
             else{
                 Toast.makeText(this,"camea invoke failed ",Toast.LENGTH_LONG).show()
             }

         }
     }*/
}
package com.example.androidtesting.core_unit

import android.content.Context
import androidx.annotation.StringRes

class ResourceComparer {

    fun isEqual(context: Context,@StringRes resId:Int, string: String ):Boolean{
      return  context.getString(resId) == string
    }
}
package com.example.androidtesting

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test


class ResourceComparerTest{

    lateinit var resourceComparer: ResourceComparer


    @Before
    fun setup(){
        resourceComparer = ResourceComparer()
    }


    @After
    fun clear(){
        // for example you test room database and i wanna to close database after each test case.
    }

    @Test
    fun whenStringResourceSameAsGivenString_returnTrue(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context,R.string.app_name,"Android Testing")
        assertThat(result).isTrue()
    }

    @Test
    fun whenStringResourceDifferentAsGivenString_returnFalse(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context,R.string.app_name,"wrong String")
        assertThat(result).isFalse()
    }



}
package com.anushka.viewmodeldemo1

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel :ViewModel() {

    var count = MutableLiveData<Int>()

    init {
        count.value = 0
    }

    fun update_counter(){
      //  count.value = count.value?.plus(1)
            count.value = (count.value?: 0) + 1
    }



}
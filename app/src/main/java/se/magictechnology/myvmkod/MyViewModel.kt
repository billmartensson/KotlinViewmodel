package se.magictechnology.myvmkod

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {

    private var counting = 0

    private val countingText = MutableLiveData<String>()

    fun getCountingText(): LiveData<String> {
        return countingText
    }


    fun addTonumber()
    {
        counting += 1
        if(counting > 5)
        {
            counting = 0

        }

        countingText.value = "** " + counting.toString() + " **"
    }
}
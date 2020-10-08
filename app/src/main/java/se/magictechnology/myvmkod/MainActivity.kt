package se.magictechnology.myvmkod

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        viewModel = ViewModelProvider(this).get(MyViewModel::class.java)
        //counterTV.text = viewModel.counting.toString()


        viewModel.getCountingText().observe(this, Observer { countingtext ->
            counterTV.text = countingtext
        })


        addBtn.setOnClickListener {
            viewModel.addTonumber()

            //counterTV.text = viewModel.counting.toString()
            //viewModel.addTonumber()
        }
    }

    /*
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("count", counting)

        Log.i("BILLDEBUG", "ON SAVE " + counting.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        counting = savedInstanceState.getInt("count")
        counterTV.text = counting.toString()

        Log.i("BILLDEBUG", "ON RESTORE " + counting.toString())
    }
    */
}
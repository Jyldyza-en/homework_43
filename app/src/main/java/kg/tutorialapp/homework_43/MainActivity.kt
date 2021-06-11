package kg.tutorialapp.homework_43

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList


class MainActivity : AppCompatActivity() {

    lateinit var etText: EditText
    lateinit var btSave: Button
    lateinit var recyclerView: RecyclerView
    lateinit var myAdapter: MyAdapter

    var myList = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etText = findViewById(R.id.editText)
        btSave = findViewById(R.id.button)
        recyclerView = findViewById(R.id.recyclerView)

        myAdapter = MyAdapter(this, myList)

        btSave.setOnClickListener {
            if (etText.text.toString().isEmpty()){
                myList.remove(etText.text.toString())
            }else {
                myList.add(etText.text.toString())
                myAdapter.notifyDataSetChanged()
            }
        }

        recyclerView.adapter = myAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)

    }


}




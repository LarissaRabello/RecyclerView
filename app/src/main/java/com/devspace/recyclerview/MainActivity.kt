package com.devspace.recyclerview

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val rvList = findViewById<RecyclerView>(R.id.rv_list)
        val ivList = findViewById<ImageView>(R.id.iv_list)
        val ivGrid = findViewById<ImageView>(R.id.iv_grid)
        val adapter = ContactListAdapter()

        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager(this)
        adapter.submitList(contacts)

        ivGrid.setOnClickListener {
            rvList.layoutManager = GridLayoutManager(this, 2)
        }

        ivList.setOnClickListener {
            rvList.layoutManager = LinearLayoutManager(this)
        }
    }
}

val contacts = listOf(
    Contact(
        "Larissa",
        "+55 (11) 1234-5678",
        R.drawable.sample15
    ),
    Contact(
        "Dante",
        "+55 (11) 2345-6789",
        R.drawable.sample8
    ),
    Contact(
        "Henrique",
        "+55 (11) 3456-7891",
        R.drawable.sample9
    ),
    Contact(
        "Thaís",
        "+55 (11) 4567-8910",
        R.drawable.sample3
    ),
    Contact(
        "Bianca",
        "+55 (11) 5678-9102",
        R.drawable.sample13
    ),
    Contact(
        "Aline",
        "+55 (11) 6789-0123",
        R.drawable.sample11
    ),
    Contact(
        "Stephanie",
        "+55 (11) 7890-1234",
        R.drawable.sample16
    ),
    Contact(
        "Karol",
        "+55 (11) 8901-2345",
        R.drawable.sample1
    ),
    Contact(
        "Sara",
        "+55 (11) 9021-3456",
        R.drawable.sample4
    ),
    Contact(
        "Paloma",
        "+55 (11) 0123-4567",
        R.drawable.sample5
    ),
    Contact(
        "Juliana",
        "+55 (11) 0987-6543",
        R.drawable.sample7
    ),
    Contact(
        "Sarah",
        "+55 (11) 9876-5432",
        R.drawable.sample6
    ),
    Contact(
        "Ramon",
        "+55 (11) 8765-4321",
        R.drawable.sample14
    ),
    Contact(
        "Roque",
        "+55 (11) 7654-3210",
        R.drawable.sample12
    ),
    Contact(
        "Gabriel",
        "+55 (11) 6543-2109",
        R.drawable.sample10
    ),
    Contact(
        "Júnior",
        "+55 (11) 5432-1098",
        R.drawable.sample2
    )

)
package br.com.alura.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.orgs.R
import br.com.alura.orgs.model.Produto
import br.com.alura.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity : AppCompatActivity(
    R.layout.activity_main
) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val nome = findViewById<TextView>(R.id.nome)
//        nome.text = "Cesta de frutas"
//        val descricao = findViewById<TextView>(R.id.descricao)
//        descricao.text = "Laranja, manga e maçã"
//        val valor = findViewById<TextView>(R.id.valor)
//        valor.text = "19,99"
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(
            context = this, produtos = listOf(
                Produto(
                    nome = "Teste",
                    descricao = "Teste desc",
                    valor = BigDecimal("19.99")
                ),
                Produto(
                    nome = "Teste 1",
                    descricao = "Teste desc 1",
                    valor = BigDecimal("29.99")
                ),Produto(
                    nome = "Teste 2",
                    descricao = "Teste desc 2",
                    valor = BigDecimal("39.99")
                ),
            )
        )
//        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}
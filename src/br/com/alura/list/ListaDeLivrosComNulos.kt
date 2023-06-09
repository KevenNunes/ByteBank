package br.com.alura.list

fun main() {
    listaDeLivros
        .groupBy { it.editora ?: "Editora Desconhecida"}
        .forEach { (editora: String, livros: List<Livro>) ->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }
}
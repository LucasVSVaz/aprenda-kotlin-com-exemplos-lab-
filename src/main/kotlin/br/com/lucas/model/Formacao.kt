package br.com.lucas.model

import br.com.lucas.enum.Nivel

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel) {



}

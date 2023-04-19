package br.com.lucas.model

import br.com.lucas.exception.ListaUsuariosVaziaException
import br.com.lucas.exception.UsuarioMatriculadoException

class Matricula {

    private val inscritos = mutableListOf<Usuario>();


    fun matricular(usuario: Usuario, formacao: Formacao) {
        if (inscritos.contains(usuario)) {
            throw UsuarioMatriculadoException("Usuário(a) ${usuario.name} já matriculado.");
        } else {
            val mensagem = "Usuário(a) ${usuario.name} matriculado(a) na formação: \n" +
                    " ${formacao.nome} - (${formacao.nivel}). \n" +
                    " Conteúdo: ${formacao.conteudos}"

            inscritos.add(usuario)
            println(mensagem)
        }
    }

    fun getAllUsuariosMatriculados() {
        if (inscritos.isEmpty()) {
            throw ListaUsuariosVaziaException("Não existem Usuários(as) cadastradas");
        } else {
            println("Lista de Usuários(as)\n $inscritos")
        }
    }
}
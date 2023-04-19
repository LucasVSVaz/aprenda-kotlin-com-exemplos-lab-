package br.com.lucas

import br.com.lucas.enum.Nivel
import br.com.lucas.exception.ListaUsuariosVaziaException
import br.com.lucas.exception.UsuarioMatriculadoException
import br.com.lucas.model.ConteudoEducacional
import br.com.lucas.model.Formacao
import br.com.lucas.model.Matricula
import br.com.lucas.model.Usuario

fun main() {

    //Cadastro de Usuário
    val user = Usuario("Lucas");
    val user2 = Usuario("Maria");

    //Cadastro de conteúdo
    val conteudo = ConteudoEducacional("POO - Kotlin");

    //Cadastro de Formação
    val form = Formacao("Kotlin", listOf(conteudo), Nivel.INTERMEDIARIO);

    //Cadastro de matrícula
    val mat = Matricula();
    mat.matricular(user, form)


    //Tentativa de matricular o mesmo usuário novamente
    try {
        mat.matricular(user2, form)
        mat.getAllUsuariosMatriculados();
    } catch (e: UsuarioMatriculadoException) {
        println(e.message)
    } catch (e: ListaUsuariosVaziaException) {
        println(e.message)
    }
}

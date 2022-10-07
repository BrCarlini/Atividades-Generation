package br.com.brcarlini.sql_local.data

import br.com.brcarlini.sql_local.Usuario

class UserRepository(private val userDao: UserDao) {

    val selectUsers = userDao.selectUsers()

    fun addUser(usuario: Usuario){
        userDao.addUser(usuario)
    }
}
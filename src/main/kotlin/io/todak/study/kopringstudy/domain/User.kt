package io.todak.study.kopringstudy.domain

import javax.persistence.*

@Entity
@Table(name = "users")
class User(username: String) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
    var username: String = username



}

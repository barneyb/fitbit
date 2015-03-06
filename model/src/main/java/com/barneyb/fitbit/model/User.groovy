package com.barneyb.fitbit.model

import javax.persistence.Entity
import javax.persistence.Table

/**
 *
 *
 * @author barneyb
 */
@Entity
@Table(name = "users")
class User {

    String nickname

}

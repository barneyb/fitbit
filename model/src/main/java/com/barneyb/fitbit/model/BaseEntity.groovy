package com.barneyb.fitbit.model

import org.joda.time.DateTime

import javax.persistence.Column
import javax.persistence.Id
import javax.persistence.MappedSuperclass

/**
 *
 *
 * @author barneyb
 */
@MappedSuperclass
class BaseEntity {

    @Id
    Long id

    @Column(name = "created_at")
    DateTime createdAt

    @Column(name = "updated_at")
    DateTime updatedAt

}

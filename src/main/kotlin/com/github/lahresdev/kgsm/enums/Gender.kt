package com.github.lahresdev.kgsm.enums

/**
 * Represents the gender of a person.
 *
 * @property label String representation
 */
enum class Gender(private val label: String) {
    FEMALE("female"), MALE("male");

    override fun toString() = label
}

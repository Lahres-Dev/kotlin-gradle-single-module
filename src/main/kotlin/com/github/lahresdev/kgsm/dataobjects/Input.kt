package com.github.lahresdev.kgsm.dataobjects

import com.github.lahresdev.kgsm.enums.Gender

/**
 * Class for sample Input.
 *
 * More information on Kdoc: [link](https://kotlinlang.org/docs/reference/kotlin-doc.html)
 *
 * @property name name of a person
 * @property age age of a person
 * @property gender gender of a person
 *
 * @constructor Builds the input object
 */
data class Input(val name: String, val age: Int, val gender: Gender)

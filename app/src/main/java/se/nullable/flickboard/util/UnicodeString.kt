package se.nullable.flickboard.util

import android.icu.lang.UCharacter
import android.icu.text.Normalizer2

fun String.singleCodePointOrNull(): Int? =
    when {
        UCharacter.codePointCount(this, 0, this.length) == 1 -> UCharacter.codePointAt(this, 0)
        else -> null
    }

fun String.dropInitialSpace(): String? =
    when {
        this.getOrNull(0) == ' ' -> this.drop(1)
        else -> null
    }

fun String.asCombiningMarkOrNull(): String? =
    singleCodePointOrNull()?.let { codePoint ->
        when (codePoint) {
            // Some standalone diacritics are not considered composed of their composing variants...
            '`'.code -> "\u0300"
            '^'.code -> "\u0302"
            '~'.code -> "\u0303"
            else -> Normalizer2.getNFKDInstance()
                .getRawDecomposition(codePoint)?.dropInitialSpace()
        }
    }
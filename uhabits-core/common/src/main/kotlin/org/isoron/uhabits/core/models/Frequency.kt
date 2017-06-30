/*
 * Copyright (C) 2015-2017 Álinson Santos Xavier <isoron@gmail.com>
 *
 * This file is part of Loop Habit Tracker.
 *
 * Loop Habit Tracker is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * Loop Habit Tracker is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package org.isoron.uhabits.core.models

/**
 * Represents how often is the habit repeated.
 */
data class Frequency(var numerator: Int, var denominator: Int) {
    init {
        if (numerator == denominator) {
            denominator = 1
            numerator = 1
        }
    }

    fun toDouble(): Double {
        return numerator.toDouble() / denominator
    }

    companion object {
        val DAILY = Frequency(1, 1)
        val FIVE_TIMES_PER_WEEK = Frequency(5, 7)
        val THREE_TIMES_PER_WEEK = Frequency(3, 7)
        val TWO_TIMES_PER_WEEK = Frequency(2, 7)
        val WEEKLY = Frequency(1, 7)
    }
}

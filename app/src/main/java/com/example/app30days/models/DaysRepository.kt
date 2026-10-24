package com.example.app30days.models

import com.example.app30days.R

object DaysRepository {
    private val nameResList = listOf(
        R.string.day1, R.string.day2, R.string.day3, R.string.day4, R.string.day5,
        R.string.day6, R.string.day7, R.string.day8, R.string.day9, R.string.day10,
        R.string.day11, R.string.day12, R.string.day13, R.string.day14, R.string.day15,
        R.string.day16, R.string.day17, R.string.day18, R.string.day19, R.string.day20,
        R.string.day21, R.string.day22, R.string.day23, R.string.day24, R.string.day25,
        R.string.day26, R.string.day27, R.string.day28, R.string.day29, R.string.day30
    )

    private val descriptionResList = listOf(
        R.string.description1, R.string.description2, R.string.description3, R.string.description4, R.string.description5,
        R.string.description6, R.string.description7, R.string.description8, R.string.description9, R.string.description10,
        R.string.description11, R.string.description12, R.string.description13, R.string.description14, R.string.description15,
        R.string.description16, R.string.description17, R.string.description18, R.string.description19, R.string.description20,
        R.string.description21, R.string.description22, R.string.description23, R.string.description24, R.string.description25,
        R.string.description26, R.string.description27, R.string.description28, R.string.description29, R.string.description30
    )

    private val imageResList = listOf(
        R.drawable.android_day1, R.drawable.android_day2, R.drawable.android_day3, R.drawable.android_day4, R.drawable.android_day5,
        R.drawable.android_day6, R.drawable.android_day7, R.drawable.android_day8, R.drawable.android_day9, R.drawable.android_day10,
        R.drawable.android_day11, R.drawable.android_day12, R.drawable.android_day13, R.drawable.android_day14, R.drawable.android_day15,
        R.drawable.android_day16, R.drawable.android_day17, R.drawable.android_day18, R.drawable.android_day19, R.drawable.android_day20,
        R.drawable.android_day21, R.drawable.android_day22, R.drawable.android_day23, R.drawable.android_day24, R.drawable.android_day25,
        R.drawable.android_day26, R.drawable.android_day27, R.drawable.android_day28, R.drawable.android_day29, R.drawable.android_day30
    )

    val days = (1..30).map {day->
        Day(
            number = day,
            nameRes = nameResList.getOrElse(day - 1) { R.string.day1 },
            descriptionRes = descriptionResList.getOrElse(day - 1) { R.string.description1 },
            imageRes = imageResList.getOrElse(day - 1) { R.drawable.android_day1 }
        )
    }
}
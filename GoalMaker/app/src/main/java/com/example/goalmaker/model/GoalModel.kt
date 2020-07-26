package com.example.goalmaker.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class GoalModel (
    @ColumnInfo(name = "goalID")
    @PrimaryKey
    val goalID: Int,

    @ColumnInfo(name = "goalName")
    val goalName: String,

    @ColumnInfo(name = "goalSpecifics")
    val goalSpecifics: List<String>,

    @ColumnInfo(name = "goalMeasures")
    val goalMeasures: List<String>,

    @ColumnInfo(name = "goalAcheivable")
    val goalAchievable: Boolean,

    @ColumnInfo(name = "goalResult")
    val goalResult: String,

    @ColumnInfo(name = "goalDeadline")
    val goalDeadline: Date,

    @ColumnInfo(name = "goalImageURL")
    val goalImageURL: String
)

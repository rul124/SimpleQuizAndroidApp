package com.example.simplequizapp

object Constants {
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // fill the question list
        val que1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina, // image will be treated as integer
            "Armenia",
            "Austria",
            "Argentina",
            "Australia",
            3
        )

        val que2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_austria, // image will be treated as integer
            "Iraq",
            "Austria",
            "China",
            "Australia",
            2
        )

        val que3 = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_german, // image will be treated as integer
            "America",
            "Australia",
            "Argentina",
            "German",
            4
        )

        val que4 = Question(
            4,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_america, // image will be treated as integer
            "Armenia",
            "America",
            "Italy",
            "France",
            2
        )

        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        return questionsList
    }
}
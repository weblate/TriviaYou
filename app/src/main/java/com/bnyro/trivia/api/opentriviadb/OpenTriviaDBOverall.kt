package com.bnyro.trivia.api.opentriviadb

data class OpenTriviaDBOverall(
    val total_num_of_pending_questions: Int? = null,
    val total_num_of_questions: Int? = null,
    val total_num_of_rejected_questions: Int? = null,
    val total_num_of_verified_questions: Int? = null
)

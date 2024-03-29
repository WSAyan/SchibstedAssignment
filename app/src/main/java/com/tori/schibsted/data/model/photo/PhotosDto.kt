package com.tori.schibsted.data.model.photo

data class PhotosDto(
    val page: Int,
    val pages: Int,
    val perpage: Int,
    val photo: List<PhotoDto>,
    val total: Int
)
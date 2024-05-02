package com.example.recyclerview08012024

class Cinema (
    var image: Int,
    var name: String,
    var address: String,
    var phone: String,
    var distance: Int
) {

    companion object {

        fun getDataMock(): List<Cinema> {
            return mutableListOf(
                Cinema(R.drawable.galaxy_nguyen_du, "Galaxy Nguyễn", "116 Nguyễn Du, Quận 1, Tp.HCM", "19002224", 461)
            )
        }
    }
}
package com.amelia.klinik.model

import com.amelia.klinik.R

data class ModelListDoctors(
    var imgDoctor : Int,
    var namaDoctor : String,
    var SpesDoctor : String,
    var JumlahReview : String,
    val angkaRating : String
)

object ListDoctor{
    fun getModel() : List<ModelListDoctors>{
        val item1 = ModelListDoctors(
            R.drawable.dokter1,
            "Dr. Widma Amelia",
            "Spesialis Jantung",
            "(150)",
            "4.8"
        )
        val item2 = ModelListDoctors(
            R.drawable.dokter2,
            "Dr. Dara Anggun Jelita",
            "Spesialis THT",
            "(170)",
            "4.9"
        )
        val item3 = ModelListDoctors(
            R.drawable.dokter3,
            "Dr. Bimbi Rubama",
            "Spesialis Hati",
            "(140)",
            "4.7"
        )
        val item4 = ModelListDoctors(
            R.drawable.dokter4,
            "Dr. Asifa Fahra",
            "Spesialis Bacok",
            "(100)",
            "2.5"
        )
        val item5 = ModelListDoctors(
            R.drawable.dokter5,
            "Dr. nur pajria",
            "Spesialis Paru-paru",
            "(150)",
            "4.8"
        )

        val itemList : ArrayList<ModelListDoctors> = ArrayList()
        itemList.add(item1)
        itemList.add(item2)
        itemList.add(item3)
        itemList.add(item4)
        itemList.add(item5)

        return itemList
    }
}

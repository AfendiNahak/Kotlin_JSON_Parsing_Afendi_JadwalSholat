package afendin490.gmail.com.kotlin_json_parsing_afendi

//class data yang akan digunakan untuk meyimpan data kota dalam bentuk String
class Kota {
    var id: Int? = null
    var nama: String? = null

    override fun toString(): String {
        return nama.toString()
    }
}

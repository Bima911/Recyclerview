package com.bimarandy.recyclerview

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bimarandy.recyclerview.adapter.AdapterTemBola
import com.bimarandy.recyclerview.databinding.ActivityMainBinding
import com.bimarandy.recyclerview.model.Pemain

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listPemain = ArrayList<Pemain>()
        listPemain.add(Pemain( "Alisson Ramses Becker", R.drawable.alisson, "Alisson", "Oct 2, 1992", "Novo Hamburgo, Brazil", "30", "1,93 m", "Goalkeeper"))
        listPemain.add(Pemain( "Adrián San Miguel del Castillo", R.drawable.adrian, "Adrián", "Jan 3, 1987", "Sevilla, Spain", "36", "1,90 m", "Goalkeeper"))
        listPemain.add(Pemain( "Caoimhín Odhran Kelleher", R.drawable.kelleher, "Kelleher", "Nov 23, 1998", "Cork, Ireland", "24", "1,88 m", "Goalkeeper"))
        listPemain.add(Pemain( "Virgil van Dijk", R.drawable.virgil, "Van Dijk", "Jul 8, 1991", "Breda, Netherlands", "31", "1,93 m", "Defender - Centre-Back"))
        listPemain.add(Pemain( "Ibrahima Konaté", R.drawable.konate, "Konaté", "May 25, 1999", "Paris, France", "23", "1,94 m", "Defender - Centre-Back"))
        listPemain.add(Pemain( "Joseph Dave Gomez", R.drawable.gomez, "Joe Gomez", "May 23, 1997", "London, England", "25", "1,88 m", "Defender - Centre-Back"))
        listPemain.add(Pemain( "Joel André Matip Job", R.drawable.matip, "Matip", "Aug 8, 1991", "Bochum, Germany", "31", "1,95 m", "Defender - Centre-Back"))
        listPemain.add(Pemain( "Nathaniel Harry Phillips", R.drawable.phillips, "Nathan", "Mar 21, 1997", "Bolton, England", "26", "1,90 m", "Defender - Centre-Back"))
        listPemain.add(Pemain( "Rhys Williams", R.drawable.williams, "Williams", "Feb 3, 2001", "Preston, England", "22", "1,95 m", "Defender - Centre-Back"))
        listPemain.add(Pemain( "Konstantinos Tsimikas", R.drawable.tsimikas, "Tsimikas", "May 12, 1996", "Thessaloniki, Greece", "27", "1,79 m", "Defender - Centre-Back"))
        listPemain.add(Pemain( "Andrew Henry Robertson", R.drawable.robertson, "Robertson", "Mar 11, 1994", "Glasgow, Scotland", "29", "1,78 m", "Defender - Left-Back"))
        listPemain.add(Pemain( "Trent John Alexander-Arnold", R.drawable.arnold, "Alexander-Arnold", "Oct 7, 1998", "Liverpool, England", "24", "1,80 m", "Defender - Right-Back"))
        listPemain.add(Pemain( "Calvin William Ramsay", R.drawable.ramsay, "Ramsay", "Jul 31, 2003", "Aberdeen, Scotland", "19", "1,77 m", "Defender - Right-Back"))
        listPemain.add(Pemain( "Stefan Bajčetić Maquieira", R.drawable.bajcetic, "Bajčetić", "Oct 22, 2004", "Vigo, Spain", "18", "1,85 m", "Midfield - Defensive Midfield"))
        listPemain.add(Pemain( "Fabio Henrique Tavares", R.drawable.fabinho, "Fabinho", "Oct 23, 1993", "Campinas, Brazil", "29", "1,88 m", "Midfield - Defensive Midfield"))
        listPemain.add(Pemain( "Thiago Alcántara do Nascimento", R.drawable.thiago, "Thiago", "Apr 11, 1991", "San Pietro Vernotico, Italy", "32", "1,74 m", "Midfield - Central Midfield"))
        listPemain.add(Pemain( "James Philip Milner", R.drawable.milner, "Milner", "Jan 4, 1986", "Leeds, England", "37", "1,75 m", "Midfield - Central Midfield"))
        listPemain.add(Pemain( "Naby Laye Keïta", R.drawable.keita, "Naby Keïta", "Feb 10, 1995", "Conakry, Guinea", "28", "1,72 m", "Midfield - Central Midfield"))
        listPemain.add(Pemain( "Jordan Brian Henderson", R.drawable.henderson, "Henderson", "Jun 17, 1990", "Sunderland, England", "32", "1,87 m", "Midfield - Central Midfield"))
        listPemain.add(Pemain( "Alexander Mark David Oxlade-Chamberlain", R.drawable.chamberlain, "Chamberlain", "Aug 15, 1993", "Portsmouth, England", "29", "1,75 m", "Midfield - Central Midfield"))
        listPemain.add(Pemain( "Curtis Jones", R.drawable.jones, "Curtis Jones", "Jan 30, 2001", "Liverpool, England", "22", "1,85 m", "Midfield - Central Midfield"))
        listPemain.add(Pemain( "Harvey Scott Elliott", R.drawable.elliott, "Elliott", "Apr 4, 2003", "London, England", "20", "1,70 m", "Midfield - Central Midfield"))
        listPemain.add(Pemain( "Fábio Leandro Freitas Gouveia Carvalho", R.drawable.carvalho, "Carvalho", "Aug 30, 2002", "Torres Vedras, Portugal", "20", "1,70 m", "Midfield - Central Midfield"))
        listPemain.add(Pemain( "Arthur Henrique Ramos de Oliveira Melo", R.drawable.arthur, "Arthur Melo", "Aug 12, 1996", "Goiânia, Brazil", "26", "1,72 m", "Midfield - Central Midfield"))
        listPemain.add(Pemain( "Diogo José Teixeira da Silva", R.drawable.jota, "Diogo Jota", "Dec 4, 1996", "Porto, Portugal", "26", "1,78 m", "Attack - Left Winger"))
        listPemain.add(Pemain( "Luis Fernando Díaz Marulanda", R.drawable.diaz, "Luis Díaz", "Jan 13, 1997", "Barrancas, Colombia", "26", "1,80 m", "Attack - Left Winger"))
        listPemain.add(Pemain( "Cody Mathès Gakpo", R.drawable.gakpo, "Gakpo", "May 7, 1999", "Eindhoven, Netherlands", "24", "1,93 m", "Attack - Left Winger"))
        listPemain.add(Pemain( "Mohamed Salah Hamed Ghaly", R.drawable.salah, "Mohamed Salah", "Jun 15, 1992", "Basyoun, Egypt", "30", "1,75 m", "Attack - Right Winger"))
        listPemain.add(Pemain( "Darwin Gabriel Núñez Ribeiro", R.drawable.nunez, "Núñez", "Jun 24, 1999", "Artigas, Uruguay", "23", "1,87 m", "Attack - Centre-Forward"))
        listPemain.add(Pemain( "Roberto Firmino Barbosa de Oliveira", R.drawable.firmino, "Firmino", "Oct 2, 1991", "Maceió, Brazil", "31", "1,81 m", "Attack - Centre-Forward"))
        listPemain.add(Pemain( "Jürgen Norbert Klopp", R.drawable.klopp, "Klopp", "Jun 16, 1967", "Stuttgart, Germany", "55", "1,91 m", "Manager"))

        binding.list.adapter = AdapterTemBola(this, listPemain,object : AdapterTemBola.OnClickListener{
            override fun detailData(item: Pemain?) {
                Dialog(this@MainActivity).apply {
                    requestWindowFeature(Window.FEATURE_NO_TITLE)
                    setCancelable(true)
                    setContentView(R.layout.detail_data_pemain)

                    val image = this.findViewById<ImageView>(R.id.image_pemain)
                    val nama = this.findViewById<TextView>(R.id.txtNamaPemain)
                    val nickname = this.findViewById<TextView>(R.id.txtNickname)
                    val tgllahir = this.findViewById<TextView>(R.id.txtTanggalLahir)
                    val tempatlahir = this.findViewById<TextView>(R.id.txtTempatLahir)
                    val umur = this.findViewById<TextView>(R.id.txtUmur)
                    val tinggi = this.findViewById<TextView>(R.id.txtTinggi)
                    val posisi = this.findViewById<TextView>(R.id.txtPosisi)
                    val btn = this.findViewById<Button>(R.id.btnClose)

                    image.setImageResource(item?.foto ?:0)
                    nama.text = "${item?.nama}"
                    nickname.text = "${item?.nickname}"
                    tgllahir.text = "${item?.tgllahir}"
                    tempatlahir.text = "${item?.tempatlahir}"
                    umur.text = "${item?.umur}"
                    tinggi.text = "${item?.tinggi}"
                    posisi.text = "${item?.posisi}"

                    btn.setOnClickListener {
                        this.dismiss()
                    }

                }.show()
            }

        })
    }
}
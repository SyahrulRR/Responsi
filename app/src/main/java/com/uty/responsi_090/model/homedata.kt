package com.uty.responsi_090.model

import com.uty.responsi_090.R

object homedata {
    private val presidentName = arrayOf(
        "Soekarno",
        "Soeharto",
        "BJ Habibie",
        "Abdurrahman Wahid",
        "Megawati Soekarnoputri",
        "Susilo Bambang Yudhoyono",
        "Joko Widodo",
        "Recep Tayyip Erdoğan",
        "Vladimir Putin",
        "Barack Hussein Obama "

    )

    private val detail = arrayOf(
        "Presiden pertama Indonesia adalah Ir. Soekarno. Ia lahir di Surabaya, 6 Juni 1901 dengan nama asli Koesno Sosrodihardjo. Soekarno kemudian meninggal di Jakarta, 21 Juni 1970 di usia yang ke-69 tahun.",
        "Presiden kedua Indonesia adalah Soeharto. Ia lahir di Bantul, Yogyakarta pada 8 Juni 1921. Soeharto kemudian meninggal di Jakarta, 27 Januari 2008 di usia yang ke-86 tahun.",
        "Presiden ketiga Indonesia adalah BJ Habibie. Ia lahir di Parepare, 25 Juni 1936 dengan nama Bacharuddin Jusuf Habibie. Sebelumnya ia menjadi wakil presiden dari Soeharto.",
        "Presiden keempat Indonesia adalah Gus Dur. Ia lahir di Jombang, 7 September 1940 dengan nama asli Abdurrahman Wahid, namun kemudian lebih akrab dipanggil Gus Dur. Gus Dur kemudian meninggal di Jakarta, 30 Desember 2009 di usia yang ke-69 tahun.",
        "Presiden kelima Indonesia adalah Megawati Soekarnoputri. Ia lahir di Yogyakarta, 23 Januari 1947 dengan nama lengkap Dyah Pertama Megawati Setyawati Soekarnoputri. Ia merupakan anak dari Soekarno yang merupakan presiden pertama Indonesia.",
        "Presiden keenam Indonesia adalah Susilo Bambang Yudhoyono. Ia lahir di Pacitan, 9 September 1949. Ia lebih dikenal dengan nama inisialnya, yaitu SBY.",
        "Presiden ketujuh Indonesia adalah Joko Widodo. Ia lahir di Surakarta, 21 Juni 1961. Ia lebih akrab dipanggil dengan nama Jokowi.",
        "Presiden Ke duabelas Turkey adalah Endrogan. Erdoğan terpilih sebagai Wali kota Istanbul dalam pemilu lokal pada 27 Maret 1994. Dia dipenjara pada 12 Desember 1997 karena puisinya yang bermasalah. Setelah empat bulan di penjara, Erdoğan mendirikan Partai Keadilan dan Pembangunan (AKP) pada tanggal 14 Agustus 2001. Dari tahun pertama, AKP menjadi gerakan politik terbesar yang didukung publik di Turki. Pada pemilihan umum tahun 2002, AKP memenangkan dua pertiga kursi di parlemen, membentuk pemerintahan partai tunggal setelah 11 tahun.",
        "Presiden Ke dua dan empat Russia adalah Putin. Putin menjadi pejabat intelijensi asing KGB selama 16 tahun, naik pangkat menjadi Letnan Kolonel sebelum pensiun pada 1991 untuk masuk politik di kampung halamannya Saint Petersburg. Ia berpindah ke Moskwa pada 1996 dan bergabung dengan pemerintahan Presiden Boris Yeltsin, dengan cepat meraih berbagai jabatan dan menjadi Pelaksana Jabatan pada 31 Desember 1999, saat Yeltsin mengundurkan diri. Putin memenangkan pemilihan presiden 2000 dengan perolehan suara sejumlah 52% sampai 30%, mengalahkan lawannya dari Partai Komunis, Gennady Zyuganov.[7] Ia terpilih kembali menjadi Presiden pada 2004 dengan perolehan suara sejumlah 72%. ",
        "Presiden Ke empat puluh empat USA adalah Obama. Lahir di Honolulu, Hawaii, Obama merupakan lulusan Universitas Columbia dan Harvard Law School, tempat ia menjadi presiden Harvard Law Review. Ia dulunya seorang penggerak masyarakat di Chicago sebelum mendapat gelar hukumnya. Ia bekerja sebagai jaksa hak-hak sipil di Chicago dan mengajar hukum konstitusi di University of Chicago Law School sejak 1992 sampai 2004. Ia tiga kali mewakili Distrik ke-13 di Senat Illinois mulai tahun 1997 hingga 2004, namun tidak lolos ke tahap Dewan Perwakilan Rakyat Amerika Serikat tahun 2000."
    )

    private val presidentPoster = intArrayOf(
        R.drawable.president1,
        R.drawable.president2,
        R.drawable.president3,
        R.drawable.president4,
        R.drawable.president5,
        R.drawable.president6,
        R.drawable.president7,
        R.drawable.president8,
        R.drawable.president9,
        R.drawable.president10
    )

    val listPresident: ArrayList<home>
        get() {
            val list = arrayListOf<home>()
            for (position in presidentName.indices) {
                val president = home()
                president.name = presidentName[position]
                president.detail = detail[position]
                president.poster = presidentPoster[position]
                list.add(president)
            }
            return list
        }
}
package com.graha.jelajahapps;

import java.util.ArrayList;

public class MountData {
    private static String[] mountNames = {
            "Puncak Jaya",
            "Gunung Gede Pangrango",
            "Gunung Bromo",
            "Gunung Kelimutu",
            "Gunung Kerinci",
            "Gunung Merbabu",
            "Gunung Papandayan",
            "Gunung Patuha",
            "Gunung Prau",
            "Gunung Rinjani",
            "Gunung Semeru"
    };
    private static String[] mountDetails = {
            "Dataran tinggi di sekitar puncak awalnya sudah dihuni sebelum adanya kontak dengan bangsa Eropa, dan puncaknya dikenal sebagai Nemangkawi di Amungkal. Puncak Jaya sebelumnya bernama Piramida Carstensz setelah penjelajah Belanda Jan Carstenszoon menamainya ketika pertama kali melihat gletser di puncak gunung pada hari yang cerah pada tahun 1623.\n" +
                    "\n" +
             "Padang salju (gletser) Puncak Jaya berhasil didaki pada awal tahun 1909 oleh seorang penjelajah Belanda, Hendrikus Albertus Lorentz dengan enam orang suku Kenyah yang direkrut dari Apau Kayan di Kalimantan Utara. Taman Nasional Lorentz yang juga meliputi Piramida Carstensz, didirikan pada tahun 1919 menyusul laporan ekspedisi ini.\n" + "\n" + "Puncak Jaya atau Carstensz Pyramid ialah sebuah puncak yang menjadi bagian dari Barisan Sudirman yang terdapat di Provinsi Papua, Indonesia. Puncak Jaya mempunyai ketinggian 4.884 m dan di sekitarnya terdapat gletser Carstensz, satu-satunya gletser tropika di Indonesia, yang kemungkinan besar segera akan lenyap akibat pemanasan global.",
            "Gunung Gede merupakan salah satu gunung paling “laris” di Jawa Barat. Sebabnya apalagi kalau bukan pemandangan indah yang dimilikinya. Tempat yang paling indah di Gunung Gede adalah Alun-alun Suryakencana. Tempat ini merupakan padang rumput yang dipenuhi bunga edelweis. Alun-alun Suryakencana merupakan salah satu tempat terbaik untuk menikmati pemandangan sang bunda abadi, Edelweis.\n" + "\n" +
            "Gunung Gede (Aksara Sunda Baku: ᮌᮥᮔᮥᮀ ᮌᮨᮓᮦ, Gunung Gedé) merupakan sebuah gunung api bertipe stratovolcano yang berada di Pulau Jawa, Indonesia. Gunung Gede berada dalam ruang lingkup Taman Nasional Gede Pangrango, yang merupakan salah satu dari lima taman nasional yang pertama kali diumumkan di Indonesia pada tahun 1980. Gunung ini berada di dua wilayah kabupaten yaitu Kabupaten Cianjur dan Sukabumi, dengan ketinggian 1.000 - 2.958 m. dpl, dan berada pada lintang 106°51' - 107°02' BT dan 64°1' - 65°1 LS. Suhu rata-rata di puncak gunung Gede 18 °C dan di malam hari suhu puncak berkisar 5 °C, dengan curah hujan rata-rata 3.600 mm/tahun. Gerbang utama menuju gunung ini adalah dari Cibodas dan Cipanas.",
            "Pemerintah Jawa Timur menjadikan Gunung Bromo sebagai salah satu destinasi wisata unggulan. Tentu saja, penunjukan ini disebabkan karna Gunung Bromo memiliki pemandangan yang layak untuk dipromosikan secara luas. Gunung Bromo sendiri selama ini dikenal sebagai salah satu gunung yang memiliki pemandangan sunsrise yang sangat indah. Lokasinya berada di kawasan Taman Nasional Bromo Tengger Semeru. Pemandangan sunrise di Bromo semakin cantik karna kita bisa melihat rangkaian puncak-puncak gunung di sekitar Taman Nasional Bromo Tengger Semeru.",
            "Kabupaten Ende di Nusa Tenggara Timur juga memiliki sebuah gunung dengan pemandangan yang sangat menawan. Gunung tersebut adalah Gunung Kelimutu. Tinggu Gunung Kelimutu sendiri hanya 1.639 mdpl namun pemandangan yang ditawarkan benar-benar keren. Di puncak gunung ini terdapat tiga buah danau yang dikenal dengan Danau Tiga Warna karna masing-masing air di danau tersebut memiliki warna yang berbeda-beda. Warna air di danau ini kadang juga berubah seiring waktu.",
            "Gunung Kerinci merupakan gunung berapi aktif tertinggi se-Asia Tenggara. Gunung Kerinci dengan ketinggian 3.805 mdpl ini masih begitu asri dan alami. Bahkan di puncak gunung ini kita akan disuguhkan oleh pemandangan kawah dengan air berwarna kekuningan yang sungguh mempesona. Sedangkan di utaranya, terdapat danau cantik nan jernih yang seakan belum terjamah manusia, yakni Danau Bento.",
            "Selain Gunung Prau, gunung lain di Jawa Tengah yang memiliki pemandangan luar biasa indah adalah Gunung Merbabu. Gunung ini berada di antara perbatasan Kabupaten Magelang, Boyolali serta Semarang. Gunung Merbabu menyajikan keindahan berupa padang sabana yang bisa kita nikmati dari lereng-lereng puncak serta puncak. Gunung Merbabu sendiri punya beberapa jalur pendakian. Namun, jalur yang dikenal memiliki view paling indah adalah jalur Selo yang berada di kabupaten Boyolali. Mendaki Gunung Merbabu via Selo kita akan disuguhi oleh pemandangan padang sabana yang akan membuat rasa lelah tak begitu terasa.",
            "Selain Gunung Gede dan Pangrango yang terkenal dengan Alun-alun Suryakencana serta Mandalawangi, gunung lain di Jawa Barat yang memililiki keindahan serupa (padang bunga edelweis) adalah Gunung Papandayan. Di Gunung Papandayan, tempat dimana bunga-bunga edelweis tumbuh dan memamerkan keindahannya dikenal dengan Tegal Alun. Sebagaimana Suryakencana dan Mandalawangi, Tegal Alun juga merupakan salah satu tempat terbaik di Indonesia untuk melihat indahnya Bunga Edelweis.",
            "Gunung yang juga memiliki pemandangan alam sangat indah adalah Gunung Patuha. Nama gunung ini mungkin masih cukup asing. Namun, jika disebutkan Kawah Putih, semua pasti sudah tahu dimana gunung ini berada. Yap, Gunung Patuha merupakan sebuah gunung yang berada di kabupaten Bandung, Jawa Barat. Kawah Putih merupakan bagian dari Gunung Patuha yang lebih dikenal orang daripada Gunung Patuha itu sendiri. Danau kawah dengan air berwarna biru toska tersebut menjadi sebuah tempat yang disukai banyak wisatawan. Keindahannya juga menggoda banyak pasangan muda untuk melakukan foto pre-wedding.",
            "Gunung Prau memiliki puncak berupa padang rumput yang sangat luas. Di sekitar puncak kita akan melihat barisan bukit-bukit yang sering disebut sebagai Bukit Teletubies. Yang menarik dari Gunung Prau adalah tingginya yang “hanya” 2.565 mdpl dengan track pendakian yang tidak terlalu sulit sehingga siapapun bisa mendaki gunung ini dan menikmati keindahan dari puncaknya.",
            "Gunung Rinjani adalah gunung yang komplit. Ia punya padang sabana cantik yang ditumbuhi bunda edelweis, ia juga punya pemandangan sunrise yang menawan. Dari semua keindahan yang ada di Gunung Rinjani, Danau Segara Anak adalah yang paling dicari. Danau yang berada di ketinggian 2.000 mdpl ini merupakan permata paling indah di Gunung Rinjani." + "Pesona unggulan Taman Nasional Gunung Rinjani yang sangat prospektif adalah Danau Segara Anak, lokasi ini dapat ditempuh dari dua jalur resmi pendakian yaitu jalur pendakian Senaru dan jalur pendakian Sembalun.\n" +
                    "\n" +
                    "Untuk mengunjungi Danau Segara Anak dari jalur Senaru dibutuhkan waktu tempuh sekitar 7 – 10 jam berjalan kaki (± 8 Km) dari pintu gerbang jalur pendakian Senaru. Sedangkan dari jalur pendakian Sembalun ditempuh dalam waktu 8 – 10 jam. Danau segara anak dengan ketinggian ± 2.010 m dpl dan kedalaman danau sekitar ± 230 meter mempunyai bentuk seperti bulan sabit dengan luasan sekitar 1.100 Ha.\n" +
                    "\n" +
                    "Disekitar Danau Segara Anak terdapat lahan yang cukup luas dan datar, dapat digunakan untuk tempat berkemping/berkemah, juga pengunjung bisa memancing ikan di danau atau berendam di air panas yang mengandung belerang.\n" +
                    "\n" +
                    "Objek lainnya di sekitar Danau Segara Anak adalah Hulu Sungai Koko Puteq ± 150 meter dari Danau Segara Anak. Selain itu terdapat pula Goa Susu, Goa Manik, Goa Payung, Goa Susu dipercaya dapat dijadikan media becermin diri serta sering pula dipergunakan sebagai tempat bermeditasi. Sedangkan di bagian bawah Danau Segara Anak terdapat sumber air panas (Aik Kalak Pengkereman Jembangan) yang biasa digunakan untuk menguji dan memandikan benda-benda bertuah (Pedang, Keris, Badik, Tombak, Golok, dll) dimana jika benda-benda tersebut menjadi lengket apabila direndam itu menandakan benda-benda tersebut jelek/tidak memiliki kekuatan supranatural, sebaliknya apabila benda-benda tersebut tetap utuh berarti benda tersebut memiliki kekuatan supranatural/dipercaya memiliki keampuhan.",
            "Gunung Semeru merupakan gunung paling indah sekaligus paling tinggi di Pulau Jawa. Gunung ini telah menjadi legenda sejak lama. Mulai dari jaman Su Hok Gie hingga jamannya pendaki kekinian seperti sekarang. Keindahan gunung ini tak pernah lekang termakan waktu. Keindahan gunung ini membuat para pendaki dari berbagai daerah rela datang jauh-jauh. Gunung Semeru juga merupakan salah satu gunung paling ramai. Maksimal kuota pendakian yang hanya 500 membuat para pendaki kadang harus antre di Ranu Pani.\n" + "\n" + "Diperlukan waktu sekitar empat hari untuk mendaki puncak gunung Semeru pergi-pulang. Untuk mendaki gunung dapat ditempuh lewat kota Malang atau Lumajang. Dari terminal Kota Malang naik angkutan umum menuju desa Tumpang. Disambung lagi dengan jeep atau truk/pickup yang banyak terdapat di belakang pasar terminal Tumpang dengan biaya per orang Rp60.000,00 - Rp100.000,0 hingga Pos Ranu Pani.\n" +
                    "\n" +
                    "Sebelumnya mampir di Gubugklakah untuk memperoleh surat izin, dengan perincian, biaya surat izin Rp6.000,00 untuk maksimal 10 orang, karcis masuk taman Rp2.000,00 per orang, asuransi per orang Rp2.000,00 (perkiraan biaya sudah termasuk transportasi jip atau truk sayuran).\n" +
                    "\n" +
                    "Dengan menggunakan truk sayuran atau jip perjalanan dimulai dari Tumpang menuju Ranu Pani, desa terakhir di kaki Semeru. Adapun dari arah Lumajang dapat dijangkau dengan menggunakan kendaraan pribadi atau naik ojek di sekitar pasar Senduro menuju ke Pos Ranu Pani.\n" +
                    "\n" +
                    "Di sini terdapat pos pemeriksaan, terdapat juga warung dan pondok penginapan. Setiap orang yang ingin melakukan pendakian dikenakan biaya Rp17.500 per orang per hari untuk hari biasa, dan Rp22.500 per orang per hari untuk hari libur. Di pos ini pun dapat mencari portir (warga lokal untuk membantu menunjukkan arah pendakian, mengangkat barang dan memasak). Pendaki juga dapat bermalam di pos penjagaan. Di pos Ranu Pani juga terdapat dua buah danau yakni Ranu Pani (1 ha) dan Ranu Regulo (0,75 ha) yang terletak pada ketinggian 2.200 mdpl.\n" +
                    "\n" +
                    "Setelah sampai di gapura \"Selamat Datang\", perjalanan berlanjut terus ke kiri ke arah bukit, tetapi jangan mengikuti jalanan yang lebar ke arah kebun penduduk. Selain jalur yang biasa dilewati para pendaki, juga ada jalur pintas yang biasa dipakai para pendaki lokal, tetapi jalur ini sangat curam.\n" +
                    "\n" +
                    "Jalur awal landai, menyusuri lereng bukit yang didominasi dengan tumbuhan alang-alang. Tidak ada tanda penunjuk arah jalan, tetapi terdapat tanda ukuran jarak pada setiap 100 m. Banyak terdapat pohon tumbang, dan ranting-ranting di atas kepala.\n" +
                    "\n" +
                    "Setelah berjalan sekitar 5 km menyusuri lereng bukit yang banyak ditumbuhi bunga edelweis, lalu akan sampai di Watu Rejeng. Di sini terdapat batu terjal yang sangat indah. Pemandangan sangat indah ke arah lembah dan bukit-bukit, yang ditumbuhi hutan cemara dan pinus. Kadangkala dapat menyaksikan kepulan asap dari puncak Semeru. Untuk menuju Ranu Kumbolo masih harus menempuh jarak sekitar 4,5 km.\n" +
                    "\n" +
                    "Di Ranu Kumbolo dapat didirikan tenda. Juga terdapat pondok pendaki (shelter). Terdapat danau dengan air yang bersih dan memiliki pemandangan indah terutama di pagi hari dapat menyaksikan matahari terbit disela-sela bukit. Banyak terdapat ikan, kadang burung belibis liar. Ranu Kumbolo berada pada ketinggian 2.400 m dengan luas 14 ha.\n" +
                    "\n" +
                    "Dari Ranu Kumbolo sebaiknya menyiapkan air sebanyak mungkin. Meninggalkan Ranu Kumbolo kemudian mendaki bukit terjal, dengan pemandangan yang sangat indah di belakang ke arah danau. Di depan bukit terbentang padang rumput yang luas yang dinamakan oro-oro ombo. Oro-oro ombo dikelilingi bukit dan gunung dengan pemandangan yang sangat indah, padang rumput luas dengan lereng yang ditumbuhi pohon pinus seperti di Eropa. Dari balik Gn. Kepolo tampak puncak Gn. Semeru menyemburkan asap wedus gembel."
    };

    private static int[] mountImages = {
            R.drawable.jaya,
            R.drawable.gepang,
            R.drawable.bromo,
            R.drawable.kelimutu,
            R.drawable.kerinci,
            R.drawable.merbabu,
            R.drawable.papandayan,
            R.drawable.patuha,
            R.drawable.prau,
            R.drawable.rinjani,
            R.drawable.semeru
    };
    static ArrayList<Mount> getListData(){
        ArrayList<Mount> list = new ArrayList<>();
        for (int position = 0; position < mountNames.length; position++){
            Mount mount = new Mount();
            mount.setName(mountNames[position]);
            mount.setDetail(mountDetails[position]);
            mount.setPhoto(mountImages[position]);
            list.add(mount);
        }
        return list;
    }
}

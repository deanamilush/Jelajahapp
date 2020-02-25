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
            "Puncak Jaya atau Carstensz Pyramid ialah sebuah puncak yang menjadi bagian dari Barisan Sudirman yang terdapat di Provinsi Papua, Indonesia. Puncak Jaya mempunyai ketinggian 4.884 m dan di sekitarnya terdapat gletser Carstensz, satu-satunya gletser tropika di Indonesia, yang kemungkinan besar segera akan lenyap akibat pemanasan global.",
            "Gunung Gede merupakan salah satu gunung paling “laris” di Jawa Barat. Sebabnya apalagi kalau bukan pemandangan indah yang dimilikinya. Tempat yang paling indah di Gunung Gede adalah Alun-alun Suryakencana. Tempat ini merupakan padang rumput yang dipenuhi bunga edelweis. Alun-alun Suryakencana merupakan salah satu tempat terbaik untuk menikmati pemandangan sang bunda abadi, Edelweis.",
            "Pemerintah Jawa Timur menjadikan Gunung Bromo sebagai salah satu destinasi wisata unggulan. Tentu saja, penunjukan ini disebabkan karna Gunung Bromo memiliki pemandangan yang layak untuk dipromosikan secara luas. Gunung Bromo sendiri selama ini dikenal sebagai salah satu gunung yang memiliki pemandangan sunsrise yang sangat indah. Lokasinya berada di kawasan Taman Nasional Bromo Tengger Semeru. Pemandangan sunrise di Bromo semakin cantik karna kita bisa melihat rangkaian puncak-puncak gunung di sekitar Taman Nasional Bromo Tengger Semeru.",
            "Kabupaten Ende di Nusa Tenggara Timur juga memiliki sebuah gunung dengan pemandangan yang sangat menawan. Gunung tersebut adalah Gunung Kelimutu. Tinggu Gunung Kelimutu sendiri hanya 1.639 mdpl namun pemandangan yang ditawarkan benar-benar keren. Di puncak gunung ini terdapat tiga buah danau yang dikenal dengan Danau Tiga Warna karna masing-masing air di danau tersebut memiliki warna yang berbeda-beda. Warna air di danau ini kadang juga berubah seiring waktu.",
            "Gunung Kerinci merupakan gunung berapi aktif tertinggi se-Asia Tenggara. Gunung Kerinci dengan ketinggian 3.805 mdpl ini masih begitu asri dan alami. Bahkan di puncak gunung ini kita akan disuguhkan oleh pemandangan kawah dengan air berwarna kekuningan yang sungguh mempesona. Sedangkan di utaranya, terdapat danau cantik nan jernih yang seakan belum terjamah manusia, yakni Danau Bento.",
            "Selain Gunung Prau, gunung lain di Jawa Tengah yang memiliki pemandangan luar biasa indah adalah Gunung Merbabu. Gunung ini berada di antara perbatasan Kabupaten Magelang, Boyolali serta Semarang. Gunung Merbabu menyajikan keindahan berupa padang sabana yang bisa kita nikmati dari lereng-lereng puncak serta puncak. Gunung Merbabu sendiri punya beberapa jalur pendakian. Namun, jalur yang dikenal memiliki view paling indah adalah jalur Selo yang berada di kabupaten Boyolali. Mendaki Gunung Merbabu via Selo kita akan disuguhi oleh pemandangan padang sabana yang akan membuat rasa lelah tak begitu terasa.",
            "Selain Gunung Gede dan Pangrango yang terkenal dengan Alun-alun Suryakencana serta Mandalawangi, gunung lain di Jawa Barat yang memililiki keindahan serupa (padang bunga edelweis) adalah Gunung Papandayan. Di Gunung Papandayan, tempat dimana bunga-bunga edelweis tumbuh dan memamerkan keindahannya dikenal dengan Tegal Alun. Sebagaimana Suryakencana dan Mandalawangi, Tegal Alun juga merupakan salah satu tempat terbaik di Indonesia untuk melihat indahnya Bunga Edelweis.",
            "Gunung yang juga memiliki pemandangan alam sangat indah adalah Gunung Patuha. Nama gunung ini mungkin masih cukup asing. Namun, jika disebutkan Kawah Putih, semua pasti sudah tahu dimana gunung ini berada. Yap, Gunung Patuha merupakan sebuah gunung yang berada di kabupaten Bandung, Jawa Barat. Kawah Putih merupakan bagian dari Gunung Patuha yang lebih dikenal orang daripada Gunung Patuha itu sendiri. Danau kawah dengan air berwarna biru toska tersebut menjadi sebuah tempat yang disukai banyak wisatawan. Keindahannya juga menggoda banyak pasangan muda untuk melakukan foto pre-wedding.",
            "Gunung Prau memiliki puncak berupa padang rumput yang sangat luas. Di sekitar puncak kita akan melihat barisan bukit-bukit yang sering disebut sebagai Bukit Teletubies. Yang menarik dari Gunung Prau adalah tingginya yang “hanya” 2.565 mdpl dengan track pendakian yang tidak terlalu sulit sehingga siapapun bisa mendaki gunung ini dan menikmati keindahan dari puncaknya.",
            "Gunung Rinjani adalah gunung yang komplit. Ia punya padang sabana cantik yang ditumbuhi bunda edelweis, ia juga punya pemandangan sunrise yang menawan. Dari semua keindahan yang ada di Gunung Rinjani, Danau Segara Anak adalah yang paling dicari. Danau yang berada di ketinggian 2.000 mdpl ini merupakan permata paling indah di Gunung Rinjani.",
            "Gunung Semeru merupakan gunung paling indah sekaligus paling tinggi di Pulau Jawa. Gunung ini telah menjadi legenda sejak lama. Mulai dari jaman Su Hok Gie hingga jamannya pendaki kekinian seperti sekarang. Keindahan gunung ini tak pernah lekang termakan waktu. Keindahan gunung ini membuat para pendaki dari berbagai daerah rela datang jauh-jauh. Gunung Semeru juga merupakan salah satu gunung paling ramai. Maksimal kuota pendakian yang hanya 500 membuat para pendaki kadang harus antre di Ranu Pani."
    };

    private static int[] mountImages = {
            R.drawable.jaya,
            R.drawable.gede,
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

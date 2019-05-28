package com.radensaleh.androidpemula.data;

import com.radensaleh.androidpemula.entity.Wisata;

import java.util.ArrayList;

public class WisataData {
    public static String[][] data = new String[][]{
            {"w01", "Keraton Kasepuhan", "Keraton Kasepuhan Cirebon ini merupakan sebuah keraton yang didirikan oleh Pangeran Cakrabuana pada masa penyebaran agama islam sekitar tahun 1529.", "https://wisatalengkap.com/wp-content/uploads/2017/02/keraton-kasepuhan-cirebon.jpg", "Tiket Masuk : Rp.5000 sd Rp.10000 /orang", "Jalan Kasepuhan No 43, Kampung Mandalangan, Kel. Kasepuhan, Kec. Lemah Wungkuk, Cirebon, Jawa Barat."},
            {"w02", "Keraton Kanoman", "Keraton Kanoman Cirebon didirikan oleh Pangeran Mohamad Badridin alias Pangeran Kertawijaya, pangeran tersebut bergelar Sultan Anom I, di angkat pada tahun 1678 M.", "https://wisatalengkap.com/wp-content/uploads/2017/02/Kompleks-Keraton-Kanoman-Kota-Cirebon-1.jpg", "Tiket Masuk : Gratis", "Jalan. Winaon Kampung Kanoman, Kanoman, Lemahwungkuk, Kota Cirebon, Jawa Barat."},
            {"w03", "Ade Irma Suryana", "Ade Irma Suryani Waterland merupakan destinasi list_wisata air terbaru yang terdapat di Cirebon. Lokasi tempat list_wisata Ade Irma Suryani Waterlad berada di tepi pantai utara Cirebon.", "https://wisatalengkap.com/wp-content/uploads/2017/02/PESONACRB.jpg", "Tiket Masuk : Rp.50000 sd Rp.65000 /orang", "Jalan Yos Sudarso No.1, Lemahwungkuk, Kota Cirebon, Jawa Barat."},
            {"w04", "Pantai Kejawanan", "Pantai Kejawanan merupakan salah satu tempat list_wisata pantai di daerah Kota Cirebon. Pantai Kejawanan juga merupakan Tempat Pengelolaan Ikan (TPI Kejawanan) dan obyek list_wisata terapi.", "https://wisatalengkap.com/wp-content/uploads/2017/02/dsc01616-copy-kejawanan.jpg", "Tiket Masuk : Gratis", "Pegambiran, Lemahwungkuk, Kota Cirebon, Jawa Barat."},
            {"w05", "Bukit Gronggong", "Bukit Gronggong merupakan destinasi list_wisata romantis yang dapat menarik perhatian wisatawan, terutama wisatawan lokal dan sekitarnya. Bukit Gronggong terletak di jalur utama Cirebon dan Kuningan.", "https://wisatalengkap.com/wp-content/uploads/2017/02/Pesona-Wisata-Malam-Bukit-Gronggong-Romantis-dengan-Gemerlapnya-3-1.jpg", "Tiket Masuk : Rp.2000 /orang", "Patapan, Beber, Cirebon, Jawa Barat."},
            {"w06", "Hutan Kera Plangon", "Kawasan hutan seluas 48 hektare ini merupakan salah satu objek list_wisata purbakala. Selain dipenuhi monyet atau kera, kamu bisa mengunjungi makam Pangeran Panjunan dan Pangeran Kejaksan.", "https://wisatalengkap.com/wp-content/uploads/2017/02/obyek-wisata-plangon-680x300.jpg", "Tiket Masuk : Rp.3000 /orang", "Babakan, kecamatan Sumber, Cirebon, Jawa Barat."},
            {"w07", "Masjid Agung Sang Cipta Rasa", "Masjid Agung Sang Cipta Rasa atau biasa dikenal dengan Masjid Agung Kasepuhan, merupakan salah satu masjid tua yang berada di kompleks Keraton Kasepuhan Kota Cirebon.", "https://wisatalengkap.com/wp-content/uploads/2017/02/masjid-agung-sang-cita-rasa-2.jpg", "Tiket Masuk : Gratis", "Jalan. Jagasatu, Kesepuhan, Lemahwungkuk, Kota Cirebon, Jawa Barat."},
            {"w08", "Makam Sunan Gunung Jati", "Makam Sunan Gunung Jati atau syeikh Syarif Hidayatullah memiliki arsitektur unik yang merupakan kombinasi antara gaya arsitektur Cina, Arab dan Jawa.", "https://wisatalengkap.com/wp-content/uploads/2017/02/19351622016-0702-18045000780x390-1.jpg", "Tiket Masuk : Gratis", " Jalan. Raya Sunan Gunung Jati, Gunung Jati, Astana, Cirebon, Jawa Barat."},
            {"w09", "Gua Sunyaragi", "Goa Sunyaragi atau juga disebut dengan Taman Sari Goa Sunyaragi, merupakan sebuah tempat pertapaan sekaligus tempat pelatihan tentara kesultanan Cirebon pada zaman dahulu kala.", "https://wisatalengkap.com/wp-content/uploads/2017/02/81gua-sunyaragi-3.jpg", "Tiket Masuk : Rp.10000 /orang", "Sunyaragi, Kesambi, Sunyaragi, Kesambi, Kota Cirebon, Jawa Barat."},
            {"w10", "Situ Sedong", "Tempat ini merupakan waduk peninggalan zaman kolonial Belanda yang dibangun pada 1918.", "https://wisatalengkap.com/wp-content/uploads/2017/02/12912357_570516876448698_904572518_n-3.jpg", "Tiket Masuk : Gratis", "JSetu Sedong, kecamatan Sedong, Kabupaten Cirebon, Jawa Barat."}
    };

    public static ArrayList<Wisata> getListData(){
        Wisata wisata = null;
        ArrayList<Wisata> list = new ArrayList<>();
        for (String[] aData : data) {
            wisata = new Wisata();
            wisata.setId(aData[0]);
            wisata.setNama(aData[1]);
            wisata.setPenjelasan(aData[2]);
            wisata.setFoto(aData[3]);
            wisata.setTiketMasuk(aData[4]);
            wisata.setAlamat(aData[5]);

            list.add(wisata);
        }

        return list;
    }
}


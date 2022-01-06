package com.example.foodapplication;

import android.content.Context;

import java.util.ArrayList;


public class FoodData {
    public static ArrayList<Food> getData(Context context) {
        ArrayList<Food> list = new ArrayList<Food>();
        list.add(new Food("Batagor", "Secara umum, batagor dibuat dari tahu yang dilembutkan dan diisi dengan adonan berbahan ikan tenggiri dan tepung tapioka lalu dibentuk menyerupai bola yang digoreng dalam minyak panas selama beberapa menit hingga matang. Variasi lainnya yaitu siomay, digoreng dan dihidangkan bersama batagor dan dikombinasikan dengan bumbu kacang, kecap manis, sambal, dan air perasan jeruk nipis sebagai pelengkap.", 10000, context.getDrawable(R.drawable.batagor),R.drawable.batagor));
        list.add(new Food("Black Salad", "Sehatnya salad buah ditambah dengan manfaat dari Charcoal active cocok banget untuk jadi salah satu alternatif makanan sehari2\n" +
                ".\n" +
                ".\n" +
                "dengan isian\n" +
                "⏺️ anggur\n" +
                "⏺️ puding jelly blueberry\n" +
                "⏺️ apel\n" +
                "⏺️ pir \n" +
                "⏺️ melon orange\n" +
                "⏺️ saos salad\n" +
                ".\n" +
                "ketahanan 2-3 hari tergantung suhu kulkas ( bukan freezer ) \uD83D\uDE0A",  38000, context.getDrawable(R.drawable.black_salad),R.drawable.black_salad));
        list.add(new Food("Caphuchino", "Cappuccino merupakan kopi yang populer dari Italia karena lebih sering dan lebih banyak dikonsumsi. Rasanya yang tidak terlalu pahit seperti espresso, membuat cappuccino lebih mudah diterima oleh lidah semua orang khususnya kalangan muda. Komposisinya terdiri atas espresso dan tambahan susu cair serta busa di atasnya.", 15000, context.getDrawable(R.drawable.cappuchino),R.drawable.cappuchino));
        list.add(new Food("Cheesecake", "Cheesecake adalah kue yang biasanya dimakan sebagai hidangan penutup, dibuat dengan mencampurkan keju yang bertekstur lembut, telur, susu, dan gula. Keju yang umumnya digunakan untuk membuat cheesecake adalah keju krim, tetapi dapat juga menggunakan keju lainnya seperti cottage cheese, ricotta, mascarpone, neufchâtel ataupun keju quark.", 100000, context.getDrawable(R.drawable.cheesecake),R.drawable.cheesecake));
        list.add(new Food("Kopi Hitam", "Kopi hitam, merupakan hasil ektraksi langsung dari perebusan biji kopi yang disajikan tanpa penambahan perisa apapun. Espreso, merupakan kopi yang dibuat dengan mengekstraksi biji kopi menggunakan uap panas pada tekanan tinggi.", 3000, context.getDrawable(R.drawable.kopi_hitam),R.drawable.kopi_hitam));
        list.add(new Food("Mie Goreng", "Mi goreng berarti \"mi yang digoreng\" adalah hidangan mie yang dimasak dengan digoreng tumis khas Indonesia. Mi goreng juga populer dan juga digemari di Malaysia, dan Singapura. Mi goreng terbuat dari mi kuning yang digoreng dengan sedikit minyak goreng, dan ditambahkan bawang putih, bawang merah, udang serta daging ayam atau daging sapi, irisan bakso, cabai, sayuran, tomat, telur ayam, dan acar. Makanan ini sangat populer dan dapat ditemui di mana-mana di Indonesia, mulai dari pedagang pinggir jalan (kaki lima) sampai restoran mewah. Mi goreng juga dapat ditemukan di warung mamak di Malaysia dan Singapura. Versi mi instan dari mi goreng juga sangat populer, seperti Indomie Mi goreng.", 10000, context.getDrawable(R.drawable.mie_goreng),R.drawable.mie_goreng));
        list.add(new Food("Nasi Goreng", "Nasi goreng adalah sebuah makanan berupa nasi yang digoreng dan diaduk dalam minyak goreng, margarin, atau mentega. Biasanya ditambah kecap manis, bawang merah, bawang putih, asam jawa, lada dan bumbu-bumbu lainnya; seperti telur, ayam, dan kerupuk. Ada pula nasi goreng jenis lain yang dibuat bersama ikan asin yang juga populer di seluruh Indonesia.", 15000, context.getDrawable(R.drawable.nasigoreng),R.drawable.nasigoreng));
        return list;
    }

    public static void tambahData(Context context){
        Database database = new Database(context);
        ArrayList<Food> foods =getData(context);

        for (Food product: foods){
            database.InsertData(product);
        }

    }
}

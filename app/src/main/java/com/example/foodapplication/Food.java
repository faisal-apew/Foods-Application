package com.example.foodapplication;

import android.graphics.drawable.Drawable;

public class Food {
    String judul;
    String deskripsi;
    int harga;
    Drawable image;
    int img;

    Food(String judul, String deskripsi, int harga, Drawable image, int img) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.image = image;
        this.img = img;
    }
}

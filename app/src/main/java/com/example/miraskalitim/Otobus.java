package com.example.miraskalitim;

import android.widget.Toast;

public class Otobus extends Arac{
    int yolcuSayisi;

    private int yolcuAl;

    public int getYolcuAl() {
        return yolcuAl;
    }

    public void setYolcuAl(int yolcuAl) {
        yolcuSayisi = yolcuAl+yolcuSayisi;
        this.yolcuAl = yolcuSayisi;
    }

    public int getYolcuIndir() {
        return yolcuIndir;
    }

    public void setYolcuIndir(int inenYolcuSayisi) {
            this.yolcuSayisi -= inenYolcuSayisi;
    }

    private int yolcuIndir;
}

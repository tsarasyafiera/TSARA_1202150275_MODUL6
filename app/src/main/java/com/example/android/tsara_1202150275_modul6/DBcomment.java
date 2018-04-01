package com.example.android.tsara_1202150275_modul6;

import com.google.firebase.database.IgnoreExtraProperties;

//Enkapsulasi data comment
@IgnoreExtraProperties
public class DBcomment {
    String user, comment, foto;

    //Dibutuhkan kosong untuk membaca data
    public DBcomment(){

    }

    //Constructor dari class ini
    public DBcomment(String user, String comment, String foto) {
        this.user = user;
        this.comment = comment;
        this.foto = foto;
    }

    //Sisany getter untuk variabel dari class ini
    public String getFoto() {
        return foto;
    }

    public String getUser() {return user; }

    public String getComment() {
        return comment;
    }

}


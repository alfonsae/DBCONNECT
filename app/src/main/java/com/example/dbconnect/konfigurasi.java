package com.example.dbconnect;

public class konfigurasi {
    //Di bawah ini merupakan pengalamatan dimana lokasi script CRUD PHP disimpan
    //Pada tutorial kali ini, karena kita membuat localhost maka alamatnya tertuju ke IP komputer dimana file PHP tersebut berada
    //PENTING! JANGAN LUPA GANTI IP SESUAI DENGAN IP KOMPUTER DIMANA DATA PHP BERADA
    public static final String URL_ADD="http://192.168.70.223/DBCONNECT/tambahpgw.php";

    //Di bawah ini merupakan kunci yang akan digunakan untuk mengirim permintaan ke script PHP
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAMA = "name";
    public static final String KEY_EMP_POSISI = "desg"; //desg variabel untuk posisi
    public static final String KEY_EMP_GAJI = "salary"; //salary variabel untuk gaji

    //JSON Tags
    public static final String TAG_JSON_ARRAY = "result";
    public static final String TAG_ID = "idt";
    public static final String TAG_NAME = "name";
    public static final String TAG_POSISI = "desg";
    public static final String TAG_GAJI = "salary";

    //ID Karyawan
    //EMP singkatan dari Employee
    public static final String EMP_ID = "emp_id";
}

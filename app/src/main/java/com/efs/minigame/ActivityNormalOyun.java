package com.efs.minigame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class ActivityNormalOyun extends AppCompatActivity {

    private TextView textViewBilgi,textViewIpucu;
    private EditText editTextTahminGir;

    private String[] iller = {"Adana", "Adıyaman", "Afyonkarahisar", "Ağrı", "Aksaray", "Amasya",
            "Ankara", "Antalya", "Ardahan", "Artvin", "Aydın", "Balıkesir",
            "Bartın", "Batman", "Bayburt", "Bilecik", "Bingöl", "Bitlis",
            "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum",
            "Denizli", "Diyarbakır", "Düzce", "Elazığ", "Edirne", "Erzincan",
            "Erzurum", "Eskişehir", "Gaziantep", "Giresun", "Gümüşhane", "Hakkari",
            "Hatay", "Iğdır", "Isparta", "Istanbul", "Izmir", "Kahramanmaraş",
            "Karabük", "Karaman", "Kars", "Kastamonu", "Kayseri", "Kırıkkale",
            "Kırklareli", "Kırşehir", "Kilis", "Kocaeli", "Konya", "Kütahya",
            "Malatya", "Manisa", "Mardin", "Mersin", "Muğla", "Muş",
            "Nevşehir", "Niğde", "Ordu", "Osmaniye", "Rize", "Sakarya",
            "Samsun", "Siirt", "Sinop", "Sivas", "Şanlıurfa", "Şırnak",
            "Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Uşak", "Van",
            "Yalova", "Yozgat", "Zonguldak"};

    private Random randomIl,randomHarf;
    private int randomIlNumber,randomHarfNumber;
    private String il, ilBoyutu = "";
    private ArrayList<Character> ilHarf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_oyun);

        textViewBilgi = (TextView)findViewById(R.id.textViewBilgi);
        textViewIpucu = (TextView)findViewById(R.id.textViewIpucu);
        editTextTahminGir = (EditText)findViewById(R.id.editTextTahminGir);



        randomIl = new Random();
        randomHarf = new Random();
        randomIlNumber = randomIl.nextInt(iller.length);
        il = iller[randomIlNumber];

        textViewBilgi.setText(il.length() + " Harfli İlimiz");

        for (int i = 0;i<il.length();i++){
            if (i<il.length()-1){
                ilBoyutu += "_ ";
            }
            else {
                ilBoyutu += "_";
            }
        }
        textViewIpucu.setText(ilBoyutu);

        ilHarf = new ArrayList<>();

        for (char c : il.toCharArray()){
            ilHarf.add(c);
        }


    }

    public void btnHarfAl(){

       if (ilHarf.size()>0){
           randomHarfNumber = randomHarf.nextInt(ilHarf.size());
           ilHarf.remove(randomHarfNumber);
       }

    }
    public void  btnTahminEt(){

    }
}
package com.example.formviewmodel.viewmodel;

import android.util.Log;

import com.example.formviewmodel.model.Mahasiswa;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FormViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    public MutableLiveData<String> nama = new MutableLiveData<>();
    public MutableLiveData<String> nim = new MutableLiveData<>();
    public MutableLiveData<String> alamat = new MutableLiveData<>();
    public MutableLiveData<Mahasiswa> mahasiswaMutableLiveData = new MutableLiveData<>();
    public Mahasiswa mhs = new Mahasiswa();

    public void onClicked() {
        mhs = new Mahasiswa(nama.getValue(), nim.getValue(), alamat.getValue());
        mahasiswaMutableLiveData.setValue(mhs);
        Log.d("Add Mahasiswa Nama : ", String.valueOf(mhs.getNama()));
        Log.d("Add Mahasiswa NIM : ", String.valueOf(mhs.getNim()));
        Log.d("Add Mahasiswa Alamat : ", String.valueOf(mhs.getAlamat()));
    }
}
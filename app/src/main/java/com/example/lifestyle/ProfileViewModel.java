package com.example.lifestyle;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.AndroidViewModel;

import com.example.lifestyle.data.ProfileData;

public class ProfileViewModel extends AndroidViewModel {

    private MutableLiveData<ProfileData> jsonData;
    private ProfileRepository mProfileRepository;

    public ProfileViewModel(Application application){
        super(application);
        mProfileRepository = new ProfileRepository(application);
        jsonData = mProfileRepository.getData();
    }

    public LiveData<ProfileData> getData(){return jsonData;}


    public void storeUserData(String profileData) {
        mProfileRepository.storeUserData(profileData);
    }

    public void fetchUserData() {
        mProfileRepository.fetchUserData();
    }
}

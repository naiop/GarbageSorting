package com.example.garbagesorting.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("垃圾分类的目的是提高垃圾的资源价值和经济价值，力争物尽其用，减少垃圾处理量和处理设备的使用，降低处理成本，减少土地资源的消耗，具有社会、经济、生态等几方面的效益。");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
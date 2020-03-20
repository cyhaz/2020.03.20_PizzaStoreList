package kr.co.youhyun.a20200320_pizzastorelist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import kr.co.youhyun.a20200320_pizzastorelist.databinding.ActivityLogoViewBinding;

public class LogoViewActivity extends BaseActivity {

    ActivityLogoViewBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_logo_view);
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

    }
}

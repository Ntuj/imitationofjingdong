package com.bawei.imitationofjingdong.Overall;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bawei.imitationofjingdong.Overall.Classification.ClassificationFragment;
import com.bawei.imitationofjingdong.Overall.Home.HomeFragment;
import com.bawei.imitationofjingdong.Overall.find.FindFragment;
import com.bawei.imitationofjingdong.Overall.my.MyFragment;
import com.bawei.imitationofjingdong.Overall.shoppingcart.ShoppingcartFragment;
import com.bawei.imitationofjingdong.R;
import com.hjm.bottomtabbar.BottomTabBar;

/*
* 开始时间：2017/12/25
* 目的：仿京东
* 时间：2017/12/26
* 此页面是：整体布局
*
* BottomTabBar
* */
public class OverallActivity extends AppCompatActivity {

    private BottomTabBar tab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overall);
        tab = findViewById(R.id.overall_tab);
        tab.init(getSupportFragmentManager())
                .addTabItem("首页", R.drawable.a2, R.drawable.a1, HomeFragment.class)
                .addTabItem("分类", R.drawable.b2, R.drawable.b1, ClassificationFragment.class)
                .addTabItem("发现", R.drawable.c2, R.drawable.c1, FindFragment.class)
                .addTabItem("购物车", R.drawable.d2, R.drawable.d1, ShoppingcartFragment.class)
                .addTabItem("我的", R.drawable.e2, R.drawable.e1, MyFragment.class);


    }
}

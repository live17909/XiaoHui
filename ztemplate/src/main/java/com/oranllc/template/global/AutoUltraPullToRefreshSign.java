package com.oranllc.template.global;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

import com.lzy.okgo.request.base.Request;
import com.zbase.adapter.ZBaseRecyclerAdapter;
import com.zbase.request.BaseAutoUltraPullToRefresh;
import com.zbase.request.IRequestPage;
import com.zbase.view.LoadMoreFooter;

import in.srain.cube.views.ptr.PtrClassicFrameLayout;


/**
 * 创建人：郑晓辉
 * 创建日期：2016/8/4
 * 描述：
 */
public class AutoUltraPullToRefreshSign extends BaseAutoUltraPullToRefresh {
    /**
     * ListView下拉刷新的构造方法
     *
     * @param context
     * @param requestPage    下拉刷新的请求参数
     * @param clazz                 返回的Json类的clazz对象
     * @param ptrClassicFrameLayout
     * @param recyclerView          数据为空显示提示的RecyclerView
     * @param zBaseRecyclerAdapter  适配器
     */
    public AutoUltraPullToRefreshSign(Context context, IRequestPage requestPage, Class clazz, PtrClassicFrameLayout ptrClassicFrameLayout, RecyclerView recyclerView, ZBaseRecyclerAdapter zBaseRecyclerAdapter) {
        super(context, requestPage, clazz, ptrClassicFrameLayout, recyclerView, zBaseRecyclerAdapter);
    }

    @Override
    protected void setLoadMoreFooter() {
        LoadMoreFooter loadMoreFooter = new LoadMoreFooter(context);
//        loadMoreFooter.setBackgroundColor(context.getResources().getColor(R.color.c4));
        zBaseRecyclerAdapter.setLoadMoreFooter(loadMoreFooter);
    }

    @Override
    protected void sign(Request request) {
//        String appKey = HttpConstant.APP_KEY;
//        String timeStamp = String.valueOf(System.currentTimeMillis());
//        String nonce = String.valueOf(UUID.randomUUID()).replaceAll("-", "");
//        String[] ArrTmp = {appKey, timeStamp, nonce};
//        Arrays.sort(ArrTmp);
//        String tmpStr = "";
//        for (int i = 0; i < ArrTmp.length; i++) {
//            tmpStr += ArrTmp[i];
//        }
//        tmpStr = tmpStr + HttpConstant.APP_SECRET;
//        String sign = MD5Encryption.getPassword32(tmpStr);
//        request.params("appKey", appKey);
//        request.params("timeStamp", timeStamp);
//        request.params("nonce", nonce);
//        request.params("sign", sign);
    }
}

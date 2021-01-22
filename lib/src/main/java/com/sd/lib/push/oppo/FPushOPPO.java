package com.sd.lib.push.oppo;

import android.content.Context;

import com.heytap.msp.push.HeytapPushManager;
import com.heytap.msp.push.callback.ICallBackResultService;

public class FPushOPPO
{
    private FPushOPPO()
    {
    }

    public static boolean init(Context context, String appKey, String appSecret, ICallBackResultService callback)
    {
        if (!HeytapPushManager.isSupportPush())
            return false;

        HeytapPushManager.init(context, false);
        HeytapPushManager.register(context, appKey, appSecret, callback);
        return true;
    }
}

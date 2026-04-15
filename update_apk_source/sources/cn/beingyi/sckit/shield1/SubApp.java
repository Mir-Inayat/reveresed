package cn.beingyi.sckit.shield1;

import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class SubApp extends Application {
    static {
        System.loadLibrary("ScKitShieldV1");
    }

    public static native void attach(Context context);

    public static native void create(Context context);

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        attach(context);
    }

    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        create(getApplicationContext());
    }
}

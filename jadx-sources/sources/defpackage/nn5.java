package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.unity3d.services.core.di.UnityAdsModule;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class nn5 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Context y;
    public final /* synthetic */ String z;

    public /* synthetic */ nn5(Context context, String str, byte b) {
        this.x = b;
        this.y = context;
        this.z = str;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        String str = this.z;
        Context context = this.y;
        switch (b) {
            case 0:
                SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
                sharedPreferences.getClass();
                return sharedPreferences;
            default:
                return UnityAdsModule.c(context, str);
        }
    }
}

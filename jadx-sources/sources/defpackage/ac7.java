package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ac7 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SharedPreferences b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ac7(SharedPreferences sharedPreferences, String str, Object obj, byte b) {
        this.a = b;
        this.b = sharedPreferences;
        this.c = str;
        this.d = obj;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        byte b = this.a;
        Object obj = this.d;
        String str = this.c;
        SharedPreferences sharedPreferences = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
            case 1:
                return Integer.valueOf(sharedPreferences.getInt(str, ((Integer) obj).intValue()));
            case 2:
                return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
            default:
                return sharedPreferences.getString(str, (String) obj);
        }
    }
}

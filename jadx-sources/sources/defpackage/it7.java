package defpackage;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class it7 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nt7 b;
    public final /* synthetic */ String c;

    public /* synthetic */ it7(nt7 nt7Var, String str, byte b) {
        this.a = b;
        this.b = nt7Var;
        this.c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte b = this.a;
        String str = this.c;
        nt7 nt7Var = this.b;
        switch (b) {
            case 0:
                return new ow7(new it7(nt7Var, str, (byte) 1));
            case 1:
                fl7 fl7Var = nt7Var.y.z;
                z18.T(fl7Var);
                ns7 P0 = fl7Var.P0(str);
                HashMap hashMap = new HashMap();
                hashMap.put("platform", AndroidStaticDeviceInfoDataSource.PLATFORM_ANDROID);
                hashMap.put("package_name", str);
                ((gu7) nt7Var.x).A.R();
                hashMap.put("gmp_version", 161000L);
                if (P0 != null) {
                    String O = P0.O();
                    if (O != null) {
                        hashMap.put("app_version", O);
                    }
                    hashMap.put("app_version_int", Long.valueOf(P0.Q()));
                    hashMap.put("dynamite_version", Long.valueOf(P0.b()));
                }
                return hashMap;
            default:
                ht7 ht7Var = new ht7((Object) nt7Var, (Object) str);
                rz7 rz7Var = new rz7("internal.remoteConfig", (byte) 0);
                rz7Var.y.put("getValue", new ow7(rz7Var, ht7Var));
                return rz7Var;
        }
    }
}

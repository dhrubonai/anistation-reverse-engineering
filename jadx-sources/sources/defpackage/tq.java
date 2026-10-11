package defpackage;

import android.content.Context;
import com.anistation.model.update.AppUpdateCheck;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tq implements rq {
    public final Context a;
    public final oq b;
    public final yq c;
    public final in d;

    public tq(Context context, oq oqVar, yq yqVar) {
        this.a = context;
        this.b = oqVar;
        this.c = yqVar;
        this.d = yqVar.c;
    }

    public final Object a(AppUpdateCheck appUpdateCheck, b0 b0Var, c0 c0Var) {
        String apkUrl = appUpdateCheck.getApkUrl();
        if (apkUrl != null) {
            String apkSha256 = appUpdateCheck.getApkSha256();
            if (apkSha256 != null) {
                ja1 ja1Var = rh1.a;
                return tl7.V(j91.y, new sc(this.b, apkUrl, this.a, apkSha256, b0Var, null, (byte) 1), c0Var);
            }
            ze0.k("Missing APK checksum");
            return null;
        }
        ze0.k("Missing APK URL");
        return null;
    }
}

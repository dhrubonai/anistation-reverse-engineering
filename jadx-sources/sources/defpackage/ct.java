package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ct implements s12 {
    public final /* synthetic */ byte a;

    public /* synthetic */ ct(byte b) {
        this.a = b;
    }

    @Override // defpackage.s12
    public final t12 a(Object obj, mg4 mg4Var, kz4 kz4Var) {
        byte b = 0;
        byte b2 = 1;
        byte b3 = 2;
        switch (this.a) {
            case 0:
                lp6 lp6Var = (lp6) obj;
                Bitmap.Config[] configArr = pq6.a;
                if (!a34.i(lp6Var.c, "file") || !a34.i(yo0.m0(ct5.i(lp6Var)), "android_asset")) {
                    return null;
                }
                return new dt(lp6Var, mg4Var, b);
            case 1:
                return new n60((Bitmap) obj);
            case 2:
                return new tb0((byte[]) obj, mg4Var, b);
            case 3:
                return new tb0((ByteBuffer) obj, mg4Var, b2);
            case 4:
                lp6 lp6Var2 = (lp6) obj;
                if (!a34.i(lp6Var2.c, HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)) {
                    return null;
                }
                return new dt(lp6Var2, mg4Var, b2);
            case 5:
                lp6 lp6Var3 = (lp6) obj;
                if (!a34.i(lp6Var3.c, "data")) {
                    return null;
                }
                return new dt(lp6Var3, mg4Var, b3);
            case 6:
                return new tb0((Drawable) obj, mg4Var, b3);
            case 7:
                lp6 lp6Var4 = (lp6) obj;
                String str = lp6Var4.c;
                if ((str != null && !str.equals("file")) || lp6Var4.e == null) {
                    return null;
                }
                Bitmap.Config[] configArr2 = pq6.a;
                if (a34.i(lp6Var4.c, "file") && a34.i(yo0.m0(ct5.i(lp6Var4)), "android_asset")) {
                    return null;
                }
                return new dt(lp6Var4, mg4Var, (byte) 3);
            case 8:
                lp6 lp6Var5 = (lp6) obj;
                if (!a34.i(lp6Var5.c, "jar:file")) {
                    return null;
                }
                return new dt(lp6Var5, mg4Var, (byte) 4);
            default:
                lp6 lp6Var6 = (lp6) obj;
                if (!a34.i(lp6Var6.c, "android.resource")) {
                    return null;
                }
                return new dt(lp6Var6, mg4Var, (byte) 5);
        }
    }
}

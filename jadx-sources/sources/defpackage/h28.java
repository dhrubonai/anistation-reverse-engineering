package defpackage;

import android.content.Context;
import android.os.Parcel;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class h28 implements g25 {
    public static final Object y = new Object();
    public static volatile t15 z;
    public final String x;

    public h28(Context context, j28 j28Var) {
        String r;
        if (j28Var.s()) {
            r = ox7.b(context, j28Var.r());
        } else {
            r = j28Var.r();
        }
        this.x = r;
    }

    @Override // defpackage.g25
    public void accept(Object obj, Object obj2) {
        int i = ww7.k;
        kw7 kw7Var = new kw7((p76) obj2);
        xw7 xw7Var = (xw7) ((yw7) obj).m();
        Parcel K = xw7Var.K();
        tm7.c(K, kw7Var);
        K.writeString(this.x);
        xw7Var.M(K, 5);
    }

    public /* synthetic */ h28(String str) {
        this.x = str;
    }
}

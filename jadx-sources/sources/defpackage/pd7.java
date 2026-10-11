package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pd7 extends sa7 implements cf7 {
    public final boolean P() {
        boolean z;
        Parcel a = a(K(), 7);
        int i = fn7.a;
        if (a.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        a.recycle();
        return z;
    }
}

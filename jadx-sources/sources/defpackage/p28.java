package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class p28 extends sa7 {
    public final tt2 P(ic4 ic4Var, String str, int i, ic4 ic4Var2) {
        Parcel K = K();
        fn7.b(K, ic4Var);
        K.writeString(str);
        K.writeInt(i);
        fn7.b(K, ic4Var2);
        Parcel a = a(K, 2);
        tt2 L = ic4.L(a.readStrongBinder());
        a.recycle();
        return L;
    }

    public final tt2 Q(ic4 ic4Var, String str, int i, ic4 ic4Var2) {
        Parcel K = K();
        fn7.b(K, ic4Var);
        K.writeString(str);
        K.writeInt(i);
        fn7.b(K, ic4Var2);
        Parcel a = a(K, 3);
        tt2 L = ic4.L(a.readStrongBinder());
        a.recycle();
        return L;
    }
}

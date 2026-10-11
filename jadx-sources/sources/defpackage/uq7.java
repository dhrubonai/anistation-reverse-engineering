package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uq7 extends sa7 implements cr7 {
    public uq7(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", (byte) 3);
    }

    @Override // defpackage.cr7
    public final void A(mm7 mm7Var, b48 b48Var) {
        Parcel K = K();
        tm7.b(K, mm7Var);
        tm7.b(K, b48Var);
        M(K, 1);
    }

    @Override // defpackage.cr7
    public final void C(yh7 yh7Var, b48 b48Var) {
        Parcel K = K();
        tm7.b(K, yh7Var);
        tm7.b(K, b48Var);
        M(K, 12);
    }

    @Override // defpackage.cr7
    public final void E(b48 b48Var) {
        Parcel K = K();
        tm7.b(K, b48Var);
        M(K, 4);
    }

    @Override // defpackage.cr7
    public final void G(b48 b48Var, Bundle bundle, gr7 gr7Var) {
        Parcel K = K();
        tm7.b(K, b48Var);
        tm7.b(K, bundle);
        tm7.c(K, gr7Var);
        M(K, 31);
    }

    @Override // defpackage.cr7
    public final void I(b48 b48Var) {
        Parcel K = K();
        tm7.b(K, b48Var);
        M(K, 25);
    }

    @Override // defpackage.cr7
    public final List e(String str, String str2, String str3, boolean z) {
        Parcel K = K();
        K.writeString(null);
        K.writeString(str2);
        K.writeString(str3);
        ClassLoader classLoader = tm7.a;
        K.writeInt(z ? 1 : 0);
        Parcel b = b(K, 15);
        ArrayList createTypedArrayList = b.createTypedArrayList(e28.CREATOR);
        b.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.cr7
    public final void g(b48 b48Var) {
        Parcel K = K();
        tm7.b(K, b48Var);
        M(K, 20);
    }

    @Override // defpackage.cr7
    public final String h(b48 b48Var) {
        Parcel K = K();
        tm7.b(K, b48Var);
        Parcel b = b(K, 11);
        String readString = b.readString();
        b.recycle();
        return readString;
    }

    @Override // defpackage.cr7
    public final void i(e28 e28Var, b48 b48Var) {
        Parcel K = K();
        tm7.b(K, e28Var);
        tm7.b(K, b48Var);
        M(K, 2);
    }

    @Override // defpackage.cr7
    public final void j(b48 b48Var, e18 e18Var, kr7 kr7Var) {
        Parcel K = K();
        tm7.b(K, b48Var);
        tm7.b(K, e18Var);
        tm7.c(K, kr7Var);
        M(K, 29);
    }

    @Override // defpackage.cr7
    public final List l(String str, String str2, b48 b48Var) {
        Parcel K = K();
        K.writeString(str);
        K.writeString(str2);
        tm7.b(K, b48Var);
        Parcel b = b(K, 16);
        ArrayList createTypedArrayList = b.createTypedArrayList(yh7.CREATOR);
        b.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.cr7
    public final jk7 m(b48 b48Var) {
        Parcel K = K();
        tm7.b(K, b48Var);
        Parcel b = b(K, 21);
        jk7 jk7Var = (jk7) tm7.a(b, jk7.CREATOR);
        b.recycle();
        return jk7Var;
    }

    @Override // defpackage.cr7
    public final void n(long j, String str, String str2, String str3) {
        Parcel K = K();
        K.writeLong(j);
        K.writeString(str);
        K.writeString(str2);
        K.writeString(str3);
        M(K, 10);
    }

    @Override // defpackage.cr7
    public final List p(String str, String str2, boolean z, b48 b48Var) {
        Parcel K = K();
        K.writeString(str);
        K.writeString(str2);
        ClassLoader classLoader = tm7.a;
        K.writeInt(z ? 1 : 0);
        tm7.b(K, b48Var);
        Parcel b = b(K, 14);
        ArrayList createTypedArrayList = b.createTypedArrayList(e28.CREATOR);
        b.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.cr7
    public final void q(b48 b48Var) {
        Parcel K = K();
        tm7.b(K, b48Var);
        M(K, 27);
    }

    @Override // defpackage.cr7
    public final List r(String str, String str2, String str3) {
        Parcel K = K();
        K.writeString(null);
        K.writeString(str2);
        K.writeString(str3);
        Parcel b = b(K, 17);
        ArrayList createTypedArrayList = b.createTypedArrayList(yh7.CREATOR);
        b.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.cr7
    public final void s(b48 b48Var) {
        Parcel K = K();
        tm7.b(K, b48Var);
        M(K, 18);
    }

    @Override // defpackage.cr7
    public final byte[] t(String str, mm7 mm7Var) {
        Parcel K = K();
        tm7.b(K, mm7Var);
        K.writeString(str);
        Parcel b = b(K, 9);
        byte[] createByteArray = b.createByteArray();
        b.recycle();
        return createByteArray;
    }

    @Override // defpackage.cr7
    public final void v(Bundle bundle, b48 b48Var) {
        Parcel K = K();
        tm7.b(K, bundle);
        tm7.b(K, b48Var);
        M(K, 19);
    }

    @Override // defpackage.cr7
    public final void w(b48 b48Var) {
        Parcel K = K();
        tm7.b(K, b48Var);
        M(K, 6);
    }

    @Override // defpackage.cr7
    public final void x(b48 b48Var) {
        Parcel K = K();
        tm7.b(K, b48Var);
        M(K, 26);
    }

    @Override // defpackage.cr7
    public final void y(b48 b48Var, mg7 mg7Var) {
        Parcel K = K();
        tm7.b(K, b48Var);
        tm7.b(K, mg7Var);
        M(K, 30);
    }
}

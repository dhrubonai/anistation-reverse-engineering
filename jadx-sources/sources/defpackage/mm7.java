package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mm7 extends y2 {
    public static final Parcelable.Creator<mm7> CREATOR = new c55(27);
    public final long A;
    public final long B;
    public final String x;
    public final im7 y;
    public final String z;

    public mm7(mm7 mm7Var, long j, long j2) {
        a34.x(mm7Var);
        this.x = mm7Var.x;
        this.y = mm7Var.y;
        this.z = mm7Var.z;
        this.A = j;
        this.B = j2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.y);
        String str = this.z;
        int length = String.valueOf(str).length();
        String str2 = this.x;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + valueOf.length());
        qx1.x(sb, "origin=", str, ",name=", str2);
        return h11.k(sb, ",params=", valueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        c55.a(this, parcel, i);
    }

    public mm7(String str, im7 im7Var, String str2, long j, long j2) {
        this.x = str;
        this.y = im7Var;
        this.z = str2;
        this.A = j;
        this.B = j2;
    }
}

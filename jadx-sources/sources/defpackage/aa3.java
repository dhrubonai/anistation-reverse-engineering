package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class aa3 extends y2 {
    public static final Parcelable.Creator<aa3> CREATOR = new c55(28);
    public final l21 A;
    public final boolean x;
    public final String y;
    public final boolean z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public aa3() {
        /*
            r5 = this;
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.util.regex.Pattern r1 = defpackage.qi0.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 20
            r1.<init>(r2)
            java.lang.String r2 = r0.getLanguage()
            r1.append(r2)
            java.lang.String r2 = r0.getCountry()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            r4 = 45
            if (r3 != 0) goto L26
            r1.append(r4)
            r1.append(r2)
        L26:
            java.lang.String r0 = r0.getVariant()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L36
            r1.append(r4)
            r1.append(r0)
        L36:
            java.lang.String r0 = r1.toString()
            r1 = 0
            r2 = 0
            r5.<init>(r2, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aa3.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aa3)) {
            return false;
        }
        aa3 aa3Var = (aa3) obj;
        if (this.x == aa3Var.x && qi0.c(this.y, aa3Var.y) && this.z == aa3Var.z && qi0.c(this.A, aa3Var.A)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.x), this.y, Boolean.valueOf(this.z), this.A});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LaunchOptions(relaunchIfRunning=");
        sb.append(this.x);
        sb.append(", language=");
        sb.append(this.y);
        sb.append(", androidReceiverCompatible: ");
        return qx1.r(sb, this.z, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.r0(parcel, 2, 4);
        parcel.writeInt(this.x ? 1 : 0);
        z51.m0(parcel, 3, this.y);
        z51.r0(parcel, 4, 4);
        parcel.writeInt(this.z ? 1 : 0);
        z51.l0(parcel, 5, this.A, i);
        z51.t0(parcel, s0);
    }

    public aa3(boolean z, String str, boolean z2, l21 l21Var) {
        this.x = z;
        this.y = str;
        this.z = z2;
        this.A = l21Var;
    }
}

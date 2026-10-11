package o5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class x0 extends c5.a {
    public static final Parcelable.Creator<x0> CREATOR = new t0(17);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8292a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f8293b;

    public x0(byte[] bArr, boolean z9) {
        this.f8292a = z9;
        this.f8293b = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        if (this.f8292a != x0Var.f8292a || !Arrays.equals(this.f8293b, x0Var.f8293b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f8292a), this.f8293b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = p7.a0.t0(20293, parcel);
        p7.a0.d0(parcel, 1, this.f8292a);
        p7.a0.f0(parcel, 2, this.f8293b, false);
        p7.a0.u0(t02, parcel);
    }
}

package o5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class y0 extends c5.a {
    public static final Parcelable.Creator<y0> CREATOR = new t0(25);

    /* renamed from: a, reason: collision with root package name */
    public final long f8303a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f8304b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f8305c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f8306d;

    public y0(long j4, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f8303a = j4;
        w7.b.s(bArr);
        this.f8304b = bArr;
        w7.b.s(bArr2);
        this.f8305c = bArr2;
        w7.b.s(bArr3);
        this.f8306d = bArr3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        if (this.f8303a != y0Var.f8303a || !Arrays.equals(this.f8304b, y0Var.f8304b) || !Arrays.equals(this.f8305c, y0Var.f8305c) || !Arrays.equals(this.f8306d, y0Var.f8306d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f8303a), this.f8304b, this.f8305c, this.f8306d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = p7.a0.t0(20293, parcel);
        p7.a0.k0(parcel, 1, this.f8303a);
        p7.a0.f0(parcel, 2, this.f8304b, false);
        p7.a0.f0(parcel, 3, this.f8305c, false);
        p7.a0.f0(parcel, 4, this.f8306d, false);
        p7.a0.u0(t02, parcel);
    }
}

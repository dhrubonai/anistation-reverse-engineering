package o5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class w0 extends c5.a {
    public static final Parcelable.Creator<w0> CREATOR = new t0(16);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f8282a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f8283b;

    public w0(byte[] bArr, byte[] bArr2) {
        this.f8282a = bArr;
        this.f8283b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (!Arrays.equals(this.f8282a, w0Var.f8282a) || !Arrays.equals(this.f8283b, w0Var.f8283b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8282a, this.f8283b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = p7.a0.t0(20293, parcel);
        p7.a0.f0(parcel, 1, this.f8282a, false);
        p7.a0.f0(parcel, 2, this.f8283b, false);
        p7.a0.u0(t02, parcel);
    }
}

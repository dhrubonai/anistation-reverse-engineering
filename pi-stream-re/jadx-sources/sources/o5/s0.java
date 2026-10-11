package o5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class s0 extends c5.a {
    public static final Parcelable.Creator<s0> CREATOR = new com.google.android.gms.common.api.y(26);

    /* renamed from: a, reason: collision with root package name */
    public final byte[][] f8274a;

    public s0(byte[][] bArr) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (bArr != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.j(z9);
        if (1 != ((bArr.length & 1) ^ 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        w7.b.j(z10);
        for (int i10 = 0; i10 < bArr.length; i10 += 2) {
            if (i10 != 0 && bArr[i10] == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            w7.b.j(z11);
            int i11 = i10 + 1;
            if (bArr[i11] != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            w7.b.j(z12);
            int length = bArr[i11].length;
            if (length != 32 && length != 64) {
                z13 = false;
            } else {
                z13 = true;
            }
            w7.b.j(z13);
        }
        this.f8274a = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s0)) {
            return false;
        }
        return Arrays.deepEquals(this.f8274a, ((s0) obj).f8274a);
    }

    public final int hashCode() {
        int i10 = 0;
        for (byte[] bArr : this.f8274a) {
            i10 ^= Arrays.hashCode(new Object[]{bArr});
        }
        return i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = p7.a0.t0(20293, parcel);
        byte[][] bArr = this.f8274a;
        if (bArr != null) {
            int t03 = p7.a0.t0(1, parcel);
            parcel.writeInt(bArr.length);
            for (byte[] bArr2 : bArr) {
                parcel.writeByteArray(bArr2);
            }
            p7.a0.u0(t03, parcel);
        }
        p7.a0.u0(t02, parcel);
    }
}

package g1;

import android.os.Parcel;
import android.os.Parcelable;
import c1.m0;
import c1.o0;
import c1.v;
import f1.b0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements o0 {
    public static final Parcelable.Creator<a> CREATOR = new android.support.v4.media.a(18);

    /* renamed from: a, reason: collision with root package name */
    public final String f4293a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f4294b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4295c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4296d;

    public a(String str, byte[] bArr, int i10, int i11) {
        this.f4293a = str;
        this.f4294b = bArr;
        this.f4295c = i10;
        this.f4296d = i11;
    }

    @Override // c1.o0
    public final /* synthetic */ void a(m0 m0Var) {
    }

    @Override // c1.o0
    public final /* synthetic */ v b() {
        return null;
    }

    @Override // c1.o0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f4293a.equals(aVar.f4293a) && Arrays.equals(this.f4294b, aVar.f4294b) && this.f4295c == aVar.f4295c && this.f4296d == aVar.f4296d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f4294b) + ((this.f4293a.hashCode() + 527) * 31)) * 31) + this.f4295c) * 31) + this.f4296d;
    }

    public final String toString() {
        String n9;
        boolean z9;
        boolean z10;
        byte[] bArr = this.f4294b;
        int i10 = this.f4296d;
        if (i10 != 1) {
            if (i10 != 23) {
                if (i10 != 67) {
                    int i11 = b0.f3799a;
                    StringBuilder sb = new StringBuilder(bArr.length * 2);
                    for (int i12 = 0; i12 < bArr.length; i12++) {
                        sb.append(Character.forDigit((bArr[i12] >> 4) & 15, 16));
                        sb.append(Character.forDigit(bArr[i12] & 15, 16));
                    }
                    n9 = sb.toString();
                } else {
                    int i13 = b0.f3799a;
                    if (bArr.length == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    w7.b.g(z10);
                    n9 = String.valueOf(bArr[3] | (bArr[1] << 16) | (bArr[0] << 24) | (bArr[2] << 8));
                }
            } else {
                int i14 = b0.f3799a;
                if (bArr.length == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                w7.b.g(z9);
                n9 = String.valueOf(Float.intBitsToFloat((bArr[3] & 255) | ((bArr[1] & 255) << 16) | (bArr[0] << 24) | ((bArr[2] & 255) << 8)));
            }
        } else {
            n9 = b0.n(bArr);
        }
        return "mdta: key=" + this.f4293a + ", value=" + n9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4293a);
        parcel.writeByteArray(this.f4294b);
        parcel.writeInt(this.f4295c);
        parcel.writeInt(this.f4296d);
    }

    public a(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = b0.f3799a;
        this.f4293a = readString;
        this.f4294b = parcel.createByteArray();
        this.f4295c = parcel.readInt();
        this.f4296d = parcel.readInt();
    }
}

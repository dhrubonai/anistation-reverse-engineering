package q2;

import android.os.Parcel;
import android.os.Parcelable;
import f1.b0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class n extends k {
    public static final Parcelable.Creator<n> CREATOR = new b(7);

    /* renamed from: b, reason: collision with root package name */
    public final String f9115b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f9116c;

    public n(String str, byte[] bArr) {
        super("PRIV");
        this.f9115b = str;
        this.f9116c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (b0.a(this.f9115b, nVar.f9115b) && Arrays.equals(this.f9116c, nVar.f9116c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f9115b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f9116c) + ((527 + i10) * 31);
    }

    @Override // q2.k
    public final String toString() {
        return this.f9106a + ": owner=" + this.f9115b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f9115b);
        parcel.writeByteArray(this.f9116c);
    }

    public n(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i10 = b0.f3799a;
        this.f9115b = readString;
        this.f9116c = parcel.createByteArray();
    }
}

package q2;

import android.os.Parcel;
import android.os.Parcelable;
import c1.m0;
import f1.b0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a extends k {
    public static final Parcelable.Creator<a> CREATOR = new android.support.v4.media.a(29);

    /* renamed from: b, reason: collision with root package name */
    public final String f9077b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9078c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9079d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f9080e;

    public a(int i10, String str, String str2, byte[] bArr) {
        super("APIC");
        this.f9077b = str;
        this.f9078c = str2;
        this.f9079d = i10;
        this.f9080e = bArr;
    }

    @Override // q2.k, c1.o0
    public final void a(m0 m0Var) {
        m0Var.a(this.f9080e, this.f9079d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f9079d == aVar.f9079d && b0.a(this.f9077b, aVar.f9077b) && b0.a(this.f9078c, aVar.f9078c) && Arrays.equals(this.f9080e, aVar.f9080e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (527 + this.f9079d) * 31;
        int i12 = 0;
        String str = this.f9077b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i11 + i10) * 31;
        String str2 = this.f9078c;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return Arrays.hashCode(this.f9080e) + ((i13 + i12) * 31);
    }

    @Override // q2.k
    public final String toString() {
        return this.f9106a + ": mimeType=" + this.f9077b + ", description=" + this.f9078c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f9077b);
        parcel.writeString(this.f9078c);
        parcel.writeInt(this.f9079d);
        parcel.writeByteArray(this.f9080e);
    }

    public a(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i10 = b0.f3799a;
        this.f9077b = readString;
        this.f9078c = parcel.readString();
        this.f9079d = parcel.readInt();
        this.f9080e = parcel.createByteArray();
    }
}

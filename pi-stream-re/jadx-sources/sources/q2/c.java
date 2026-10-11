package q2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c extends k {
    public static final Parcelable.Creator<c> CREATOR = new b(0);

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f9082b;

    public c(String str, byte[] bArr) {
        super(str);
        this.f9082b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f9106a.equals(cVar.f9106a) && Arrays.equals(this.f9082b, cVar.f9082b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9082b) + ((this.f9106a.hashCode() + 527) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f9106a);
        parcel.writeByteArray(this.f9082b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = f1.b0.f3799a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            r2.f9082b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.c.<init>(android.os.Parcel):void");
    }
}

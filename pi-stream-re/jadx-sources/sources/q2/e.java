package q2;

import android.os.Parcel;
import android.os.Parcelable;
import f1.b0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e extends k {
    public static final Parcelable.Creator<e> CREATOR = new b(2);

    /* renamed from: b, reason: collision with root package name */
    public final String f9089b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9090c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9091d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f9092e;

    /* renamed from: f, reason: collision with root package name */
    public final k[] f9093f;

    public e(String str, boolean z9, boolean z10, String[] strArr, k[] kVarArr) {
        super("CTOC");
        this.f9089b = str;
        this.f9090c = z9;
        this.f9091d = z10;
        this.f9092e = strArr;
        this.f9093f = kVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f9090c == eVar.f9090c && this.f9091d == eVar.f9091d && b0.a(this.f9089b, eVar.f9089b) && Arrays.equals(this.f9092e, eVar.f9092e) && Arrays.equals(this.f9093f, eVar.f9093f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((527 + (this.f9090c ? 1 : 0)) * 31) + (this.f9091d ? 1 : 0)) * 31;
        String str = this.f9089b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f9089b);
        parcel.writeByte(this.f9090c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f9091d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f9092e);
        k[] kVarArr = this.f9093f;
        parcel.writeInt(kVarArr.length);
        for (k kVar : kVarArr) {
            parcel.writeParcelable(kVar, 0);
        }
    }

    public e(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i10 = b0.f3799a;
        this.f9089b = readString;
        this.f9090c = parcel.readByte() != 0;
        this.f9091d = parcel.readByte() != 0;
        this.f9092e = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f9093f = new k[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            this.f9093f[i11] = (k) parcel.readParcelable(k.class.getClassLoader());
        }
    }
}

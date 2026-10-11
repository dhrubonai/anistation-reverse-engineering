package q2;

import android.os.Parcel;
import android.os.Parcelable;
import f1.b0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m extends k {
    public static final Parcelable.Creator<m> CREATOR = new b(6);

    /* renamed from: b, reason: collision with root package name */
    public final int f9110b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9111c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9112d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f9113e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f9114f;

    public m(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f9110b = i10;
        this.f9111c = i11;
        this.f9112d = i12;
        this.f9113e = iArr;
        this.f9114f = iArr2;
    }

    @Override // q2.k, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f9110b == mVar.f9110b && this.f9111c == mVar.f9111c && this.f9112d == mVar.f9112d && Arrays.equals(this.f9113e, mVar.f9113e) && Arrays.equals(this.f9114f, mVar.f9114f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9114f) + ((Arrays.hashCode(this.f9113e) + ((((((527 + this.f9110b) * 31) + this.f9111c) * 31) + this.f9112d) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f9110b);
        parcel.writeInt(this.f9111c);
        parcel.writeInt(this.f9112d);
        parcel.writeIntArray(this.f9113e);
        parcel.writeIntArray(this.f9114f);
    }

    public m(Parcel parcel) {
        super("MLLT");
        this.f9110b = parcel.readInt();
        this.f9111c = parcel.readInt();
        this.f9112d = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i10 = b0.f3799a;
        this.f9113e = createIntArray;
        this.f9114f = parcel.createIntArray();
    }
}

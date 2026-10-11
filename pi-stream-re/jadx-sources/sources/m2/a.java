package m2;

import a3.g;
import android.os.Parcel;
import android.os.Parcelable;
import c1.m0;
import c1.o0;
import c1.v;

/* loaded from: classes.dex */
public final class a implements o0 {
    public static final Parcelable.Creator<a> CREATOR = new android.support.v4.media.a(23);

    /* renamed from: a, reason: collision with root package name */
    public final int f7143a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7144b;

    public a(int i10, String str) {
        this.f7143a = i10;
        this.f7144b = str;
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

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.f7143a);
        sb.append(",url=");
        return g.t(sb, this.f7144b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f7144b);
        parcel.writeInt(this.f7143a);
    }
}

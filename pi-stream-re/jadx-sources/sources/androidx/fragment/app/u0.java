package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u0 implements Parcelable {
    public static final Parcelable.Creator<u0> CREATOR = new android.support.v4.media.a(12);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f999a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f1000b;

    /* renamed from: c, reason: collision with root package name */
    public b[] f1001c;

    /* renamed from: d, reason: collision with root package name */
    public int f1002d;

    /* renamed from: e, reason: collision with root package name */
    public String f1003e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f1004f;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f1005x;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f1006y;

    public u0() {
        this.f1003e = null;
        this.f1004f = new ArrayList();
        this.f1005x = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f999a);
        parcel.writeStringList(this.f1000b);
        parcel.writeTypedArray(this.f1001c, i10);
        parcel.writeInt(this.f1002d);
        parcel.writeString(this.f1003e);
        parcel.writeStringList(this.f1004f);
        parcel.writeTypedList(this.f1005x);
        parcel.writeTypedList(this.f1006y);
    }

    public u0(Parcel parcel) {
        this.f1003e = null;
        this.f1004f = new ArrayList();
        this.f1005x = new ArrayList();
        this.f999a = parcel.createStringArrayList();
        this.f1000b = parcel.createStringArrayList();
        this.f1001c = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f1002d = parcel.readInt();
        this.f1003e = parcel.readString();
        this.f1004f = parcel.createStringArrayList();
        this.f1005x = parcel.createTypedArrayList(c.CREATOR);
        this.f1006y = parcel.createTypedArrayList(p0.CREATOR);
    }
}

package s2;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final long f9872a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9873b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9874c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9875d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9876e;

    /* renamed from: f, reason: collision with root package name */
    public final List f9877f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f9878g;

    /* renamed from: h, reason: collision with root package name */
    public final long f9879h;

    /* renamed from: i, reason: collision with root package name */
    public final int f9880i;

    /* renamed from: j, reason: collision with root package name */
    public final int f9881j;

    /* renamed from: k, reason: collision with root package name */
    public final int f9882k;

    public h(long j4, boolean z9, boolean z10, boolean z11, ArrayList arrayList, long j10, boolean z12, long j11, int i10, int i11, int i12) {
        this.f9872a = j4;
        this.f9873b = z9;
        this.f9874c = z10;
        this.f9875d = z11;
        this.f9877f = Collections.unmodifiableList(arrayList);
        this.f9876e = j10;
        this.f9878g = z12;
        this.f9879h = j11;
        this.f9880i = i10;
        this.f9881j = i11;
        this.f9882k = i12;
    }

    public h(Parcel parcel) {
        this.f9872a = parcel.readLong();
        this.f9873b = parcel.readByte() == 1;
        this.f9874c = parcel.readByte() == 1;
        this.f9875d = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(new g(parcel.readInt(), parcel.readLong()));
        }
        this.f9877f = Collections.unmodifiableList(arrayList);
        this.f9876e = parcel.readLong();
        this.f9878g = parcel.readByte() == 1;
        this.f9879h = parcel.readLong();
        this.f9880i = parcel.readInt();
        this.f9881j = parcel.readInt();
        this.f9882k = parcel.readInt();
    }
}

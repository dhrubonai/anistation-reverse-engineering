package s2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends b {
    public static final Parcelable.Creator<e> CREATOR = new q2.b(15);
    public final long A;
    public final int B;
    public final int C;
    public final int D;

    /* renamed from: a, reason: collision with root package name */
    public final long f9861a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9862b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9863c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9864d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9865e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9866f;

    /* renamed from: x, reason: collision with root package name */
    public final long f9867x;

    /* renamed from: y, reason: collision with root package name */
    public final List f9868y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f9869z;

    public e(long j4, boolean z9, boolean z10, boolean z11, boolean z12, long j10, long j11, List list, boolean z13, long j12, int i10, int i11, int i12) {
        this.f9861a = j4;
        this.f9862b = z9;
        this.f9863c = z10;
        this.f9864d = z11;
        this.f9865e = z12;
        this.f9866f = j10;
        this.f9867x = j11;
        this.f9868y = Collections.unmodifiableList(list);
        this.f9869z = z13;
        this.A = j12;
        this.B = i10;
        this.C = i11;
        this.D = i12;
    }

    @Override // s2.b
    public final String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.f9866f + ", programSplicePlaybackPositionUs= " + this.f9867x + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f9861a);
        parcel.writeByte(this.f9862b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f9863c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f9864d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f9865e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f9866f);
        parcel.writeLong(this.f9867x);
        List list = this.f9868y;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            d dVar = (d) list.get(i11);
            parcel.writeInt(dVar.f9858a);
            parcel.writeLong(dVar.f9859b);
            parcel.writeLong(dVar.f9860c);
        }
        parcel.writeByte(this.f9869z ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
    }

    public e(Parcel parcel) {
        this.f9861a = parcel.readLong();
        this.f9862b = parcel.readByte() == 1;
        this.f9863c = parcel.readByte() == 1;
        this.f9864d = parcel.readByte() == 1;
        this.f9865e = parcel.readByte() == 1;
        this.f9866f = parcel.readLong();
        this.f9867x = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(new d(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f9868y = Collections.unmodifiableList(arrayList);
        this.f9869z = parcel.readByte() == 1;
        this.A = parcel.readLong();
        this.B = parcel.readInt();
        this.C = parcel.readInt();
        this.D = parcel.readInt();
    }
}

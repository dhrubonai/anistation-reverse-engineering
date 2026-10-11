package u5;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.p3;

/* loaded from: classes.dex */
public final class b extends n0.b {
    public static final Parcelable.Creator<b> CREATOR = new p3(5);

    /* renamed from: c, reason: collision with root package name */
    public boolean f10277c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10278d;

    /* renamed from: e, reason: collision with root package name */
    public int f10279e;

    /* renamed from: f, reason: collision with root package name */
    public float f10280f;

    /* renamed from: x, reason: collision with root package name */
    public boolean f10281x;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z9;
        boolean z10;
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f10277c = z9;
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f10278d = z10;
        this.f10279e = parcel.readInt();
        this.f10280f = parcel.readFloat();
        this.f10281x = parcel.readByte() != 0;
    }

    @Override // n0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f7897a, i10);
        parcel.writeByte(this.f10277c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f10278d ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f10279e);
        parcel.writeFloat(this.f10280f);
        parcel.writeByte(this.f10281x ? (byte) 1 : (byte) 0);
    }
}

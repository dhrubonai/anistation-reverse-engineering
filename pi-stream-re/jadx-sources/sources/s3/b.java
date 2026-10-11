package s3;

import a3.g;
import android.os.Parcel;
import android.util.SparseIntArray;
import n.e;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f9889d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f9890e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9891f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9892g;

    /* renamed from: h, reason: collision with root package name */
    public final String f9893h;

    /* renamed from: i, reason: collision with root package name */
    public int f9894i;

    /* renamed from: j, reason: collision with root package name */
    public int f9895j;

    /* renamed from: k, reason: collision with root package name */
    public int f9896k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new e(), new e(), new e());
    }

    @Override // s3.a
    public final b a() {
        Parcel parcel = this.f9890e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f9895j;
        if (i10 == this.f9891f) {
            i10 = this.f9892g;
        }
        return new b(parcel, dataPosition, i10, g.t(new StringBuilder(), this.f9893h, "  "), this.f9886a, this.f9887b, this.f9888c);
    }

    @Override // s3.a
    public final boolean e(int i10) {
        while (this.f9895j < this.f9892g) {
            int i11 = this.f9896k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            int i12 = this.f9895j;
            Parcel parcel = this.f9890e;
            parcel.setDataPosition(i12);
            int readInt = parcel.readInt();
            this.f9896k = parcel.readInt();
            this.f9895j += readInt;
        }
        if (this.f9896k == i10) {
            return true;
        }
        return false;
    }

    @Override // s3.a
    public final void i(int i10) {
        int i11 = this.f9894i;
        SparseIntArray sparseIntArray = this.f9889d;
        Parcel parcel = this.f9890e;
        if (i11 >= 0) {
            int i12 = sparseIntArray.get(i11);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i12);
            parcel.writeInt(dataPosition - i12);
            parcel.setDataPosition(dataPosition);
        }
        this.f9894i = i10;
        sparseIntArray.put(i10, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i10);
    }

    public b(Parcel parcel, int i10, int i11, String str, e eVar, e eVar2, e eVar3) {
        super(eVar, eVar2, eVar3);
        this.f9889d = new SparseIntArray();
        this.f9894i = -1;
        this.f9896k = -1;
        this.f9890e = parcel;
        this.f9891f = i10;
        this.f9892g = i11;
        this.f9895j = i10;
        this.f9893h = str;
    }
}

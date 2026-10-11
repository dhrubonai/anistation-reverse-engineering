package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new android.support.v4.media.a(9);
    public final int A;
    public final CharSequence B;
    public final ArrayList C;
    public final ArrayList D;
    public final boolean E;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f838a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f839b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f840c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f841d;

    /* renamed from: e, reason: collision with root package name */
    public final int f842e;

    /* renamed from: f, reason: collision with root package name */
    public final String f843f;

    /* renamed from: x, reason: collision with root package name */
    public final int f844x;

    /* renamed from: y, reason: collision with root package name */
    public final int f845y;

    /* renamed from: z, reason: collision with root package name */
    public final CharSequence f846z;

    public b(a aVar) {
        int size = aVar.f812a.size();
        this.f838a = new int[size * 6];
        if (aVar.f818g) {
            this.f839b = new ArrayList(size);
            this.f840c = new int[size];
            this.f841d = new int[size];
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                a1 a1Var = (a1) aVar.f812a.get(i10);
                int i12 = i11 + 1;
                this.f838a[i11] = a1Var.f829a;
                ArrayList arrayList = this.f839b;
                y yVar = a1Var.f830b;
                arrayList.add(yVar != null ? yVar.f1037e : null);
                int[] iArr = this.f838a;
                int i13 = i12 + 1;
                iArr[i12] = a1Var.f831c ? 1 : 0;
                int i14 = i13 + 1;
                iArr[i13] = a1Var.f832d;
                int i15 = i14 + 1;
                iArr[i14] = a1Var.f833e;
                int i16 = i15 + 1;
                iArr[i15] = a1Var.f834f;
                iArr[i16] = a1Var.f835g;
                this.f840c[i10] = a1Var.f836h.ordinal();
                this.f841d[i10] = a1Var.f837i.ordinal();
                i10++;
                i11 = i16 + 1;
            }
            this.f842e = aVar.f817f;
            this.f843f = aVar.f819h;
            this.f844x = aVar.f828r;
            this.f845y = aVar.f820i;
            this.f846z = aVar.f821j;
            this.A = aVar.f822k;
            this.B = aVar.f823l;
            this.C = aVar.f824m;
            this.D = aVar.f825n;
            this.E = aVar.o;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f838a);
        parcel.writeStringList(this.f839b);
        parcel.writeIntArray(this.f840c);
        parcel.writeIntArray(this.f841d);
        parcel.writeInt(this.f842e);
        parcel.writeString(this.f843f);
        parcel.writeInt(this.f844x);
        parcel.writeInt(this.f845y);
        TextUtils.writeToParcel(this.f846z, parcel, 0);
        parcel.writeInt(this.A);
        TextUtils.writeToParcel(this.B, parcel, 0);
        parcel.writeStringList(this.C);
        parcel.writeStringList(this.D);
        parcel.writeInt(this.E ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.f838a = parcel.createIntArray();
        this.f839b = parcel.createStringArrayList();
        this.f840c = parcel.createIntArray();
        this.f841d = parcel.createIntArray();
        this.f842e = parcel.readInt();
        this.f843f = parcel.readString();
        this.f844x = parcel.readInt();
        this.f845y = parcel.readInt();
        this.f846z = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.A = parcel.readInt();
        this.B = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.C = parcel.createStringArrayList();
        this.D = parcel.createStringArrayList();
        this.E = parcel.readInt() != 0;
    }
}

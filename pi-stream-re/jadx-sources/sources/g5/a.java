package g5;

import android.os.Parcel;
import p7.a0;

/* loaded from: classes.dex */
public final class a extends c5.a {
    public static final f CREATOR = new f();
    public i A;
    public final b B;

    /* renamed from: a, reason: collision with root package name */
    public final int f4436a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4437b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4438c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4439d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4440e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4441f;

    /* renamed from: x, reason: collision with root package name */
    public final int f4442x;

    /* renamed from: y, reason: collision with root package name */
    public final Class f4443y;

    /* renamed from: z, reason: collision with root package name */
    public final String f4444z;

    public a(int i10, int i11, boolean z9, int i12, boolean z10, String str, int i13, String str2, f5.b bVar) {
        this.f4436a = i10;
        this.f4437b = i11;
        this.f4438c = z9;
        this.f4439d = i12;
        this.f4440e = z10;
        this.f4441f = str;
        this.f4442x = i13;
        if (str2 == null) {
            this.f4443y = null;
            this.f4444z = null;
        } else {
            this.f4443y = e.class;
            this.f4444z = str2;
        }
        if (bVar == null) {
            this.B = null;
            return;
        }
        f5.a aVar = bVar.f3927b;
        if (aVar != null) {
            this.B = aVar;
            return;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public static a d(int i10, String str) {
        return new a(7, true, 7, true, str, i10, null);
    }

    public final String toString() {
        z3.e eVar = new z3.e(this);
        eVar.f(Integer.valueOf(this.f4436a), "versionCode");
        eVar.f(Integer.valueOf(this.f4437b), "typeIn");
        eVar.f(Boolean.valueOf(this.f4438c), "typeInArray");
        eVar.f(Integer.valueOf(this.f4439d), "typeOut");
        eVar.f(Boolean.valueOf(this.f4440e), "typeOutArray");
        eVar.f(this.f4441f, "outputFieldName");
        eVar.f(Integer.valueOf(this.f4442x), "safeParcelFieldId");
        String str = this.f4444z;
        if (str == null) {
            str = null;
        }
        eVar.f(str, "concreteTypeName");
        Class cls = this.f4443y;
        if (cls != null) {
            eVar.f(cls.getCanonicalName(), "concreteType.class");
        }
        b bVar = this.B;
        if (bVar != null) {
            eVar.f(bVar.getClass().getCanonicalName(), "converterName");
        }
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.h0(parcel, 1, this.f4436a);
        a0.h0(parcel, 2, this.f4437b);
        a0.d0(parcel, 3, this.f4438c);
        a0.h0(parcel, 4, this.f4439d);
        a0.d0(parcel, 5, this.f4440e);
        a0.n0(parcel, 6, this.f4441f, false);
        a0.h0(parcel, 7, this.f4442x);
        f5.b bVar = null;
        String str = this.f4444z;
        if (str == null) {
            str = null;
        }
        a0.n0(parcel, 8, str, false);
        b bVar2 = this.B;
        if (bVar2 != null) {
            if (bVar2 instanceof f5.a) {
                bVar = new f5.b((f5.a) bVar2);
            } else {
                throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
            }
        }
        a0.m0(parcel, 9, bVar, i10, false);
        a0.u0(t02, parcel);
    }

    public a(int i10, boolean z9, int i11, boolean z10, String str, int i12, Class cls) {
        this.f4436a = 1;
        this.f4437b = i10;
        this.f4438c = z9;
        this.f4439d = i11;
        this.f4440e = z10;
        this.f4441f = str;
        this.f4442x = i12;
        this.f4443y = cls;
        if (cls == null) {
            this.f4444z = null;
        } else {
            this.f4444z = cls.getCanonicalName();
        }
        this.B = null;
    }
}

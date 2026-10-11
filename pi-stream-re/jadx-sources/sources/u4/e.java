package u4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p7.a0;

/* loaded from: classes.dex */
public final class e extends zzbz {
    public static final Parcelable.Creator<e> CREATOR = new q2.b(26);

    /* renamed from: x, reason: collision with root package name */
    public static final HashMap f10260x;

    /* renamed from: a, reason: collision with root package name */
    public final Set f10261a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10262b;

    /* renamed from: c, reason: collision with root package name */
    public f f10263c;

    /* renamed from: d, reason: collision with root package name */
    public String f10264d;

    /* renamed from: e, reason: collision with root package name */
    public String f10265e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10266f;

    static {
        HashMap hashMap = new HashMap();
        f10260x = hashMap;
        hashMap.put("authenticatorInfo", new g5.a(11, false, 11, false, "authenticatorInfo", 2, f.class));
        hashMap.put("signature", new g5.a(7, false, 7, false, "signature", 3, null));
        hashMap.put("package", new g5.a(7, false, 7, false, "package", 4, null));
    }

    public e(HashSet hashSet, int i10, f fVar, String str, String str2, String str3) {
        this.f10261a = hashSet;
        this.f10262b = i10;
        this.f10263c = fVar;
        this.f10264d = str;
        this.f10265e = str2;
        this.f10266f = str3;
    }

    @Override // g5.c
    public final void addConcreteTypeInternal(g5.a aVar, String str, g5.c cVar) {
        int i10 = aVar.f4442x;
        if (i10 == 2) {
            this.f10263c = (f) cVar;
            this.f10261a.add(Integer.valueOf(i10));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i10), cVar.getClass().getCanonicalName()));
    }

    @Override // g5.c
    public final /* synthetic */ Map getFieldMappings() {
        return f10260x;
    }

    @Override // g5.c
    public final Object getFieldValue(g5.a aVar) {
        int i10 = aVar.f4442x;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return this.f10265e;
                    }
                    throw new IllegalStateException("Unknown SafeParcelable id=" + aVar.f4442x);
                }
                return this.f10264d;
            }
            return this.f10263c;
        }
        return Integer.valueOf(this.f10262b);
    }

    @Override // g5.c
    public final boolean isFieldSet(g5.a aVar) {
        return this.f10261a.contains(Integer.valueOf(aVar.f4442x));
    }

    @Override // g5.c
    public final void setStringInternal(g5.a aVar, String str, String str2) {
        int i10 = aVar.f4442x;
        if (i10 != 3) {
            if (i10 == 4) {
                this.f10265e = str2;
            } else {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i10)));
            }
        } else {
            this.f10264d = str2;
        }
        this.f10261a.add(Integer.valueOf(i10));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        Set set = this.f10261a;
        if (set.contains(1)) {
            a0.h0(parcel, 1, this.f10262b);
        }
        if (set.contains(2)) {
            a0.m0(parcel, 2, this.f10263c, i10, true);
        }
        if (set.contains(3)) {
            a0.n0(parcel, 3, this.f10264d, true);
        }
        if (set.contains(4)) {
            a0.n0(parcel, 4, this.f10265e, true);
        }
        if (set.contains(5)) {
            a0.n0(parcel, 5, this.f10266f, true);
        }
        a0.u0(t02, parcel);
    }
}

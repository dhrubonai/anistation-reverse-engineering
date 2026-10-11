package u4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p7.a0;

/* loaded from: classes.dex */
public final class b extends zzbz {
    public static final Parcelable.Creator<b> CREATOR = new q2.b(24);

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f10247f;

    /* renamed from: a, reason: collision with root package name */
    public final Set f10248a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10249b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f10250c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10251d;

    /* renamed from: e, reason: collision with root package name */
    public d f10252e;

    static {
        HashMap hashMap = new HashMap();
        f10247f = hashMap;
        hashMap.put("authenticatorData", new g5.a(11, true, 11, true, "authenticatorData", 2, e.class));
        hashMap.put("progress", new g5.a(11, false, 11, false, "progress", 4, d.class));
    }

    public b(HashSet hashSet, int i10, ArrayList arrayList, int i11, d dVar) {
        this.f10248a = hashSet;
        this.f10249b = i10;
        this.f10250c = arrayList;
        this.f10251d = i11;
        this.f10252e = dVar;
    }

    @Override // g5.c
    public final void addConcreteTypeArrayInternal(g5.a aVar, String str, ArrayList arrayList) {
        int i10 = aVar.f4442x;
        if (i10 == 2) {
            this.f10250c = arrayList;
            this.f10248a.add(Integer.valueOf(i10));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", Integer.valueOf(i10), arrayList.getClass().getCanonicalName()));
    }

    @Override // g5.c
    public final void addConcreteTypeInternal(g5.a aVar, String str, g5.c cVar) {
        int i10 = aVar.f4442x;
        if (i10 == 4) {
            this.f10252e = (d) cVar;
            this.f10248a.add(Integer.valueOf(i10));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i10), cVar.getClass().getCanonicalName()));
    }

    @Override // g5.c
    public final /* synthetic */ Map getFieldMappings() {
        return f10247f;
    }

    @Override // g5.c
    public final Object getFieldValue(g5.a aVar) {
        int i10 = aVar.f4442x;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 4) {
                    return this.f10252e;
                }
                throw new IllegalStateException("Unknown SafeParcelable id=" + aVar.f4442x);
            }
            return this.f10250c;
        }
        return Integer.valueOf(this.f10249b);
    }

    @Override // g5.c
    public final boolean isFieldSet(g5.a aVar) {
        return this.f10248a.contains(Integer.valueOf(aVar.f4442x));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        Set set = this.f10248a;
        if (set.contains(1)) {
            a0.h0(parcel, 1, this.f10249b);
        }
        if (set.contains(2)) {
            a0.s0(parcel, 2, this.f10250c, true);
        }
        if (set.contains(3)) {
            a0.h0(parcel, 3, this.f10251d);
        }
        if (set.contains(4)) {
            a0.m0(parcel, 4, this.f10252e, i10, true);
        }
        a0.u0(t02, parcel);
    }
}

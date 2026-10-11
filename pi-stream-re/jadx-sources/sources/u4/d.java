package u4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p7.a0;

/* loaded from: classes.dex */
public final class d extends zzbz {
    public static final Parcelable.Creator<d> CREATOR = new q2.b(25);

    /* renamed from: x, reason: collision with root package name */
    public static final n.e f10253x;

    /* renamed from: a, reason: collision with root package name */
    public final int f10254a;

    /* renamed from: b, reason: collision with root package name */
    public List f10255b;

    /* renamed from: c, reason: collision with root package name */
    public List f10256c;

    /* renamed from: d, reason: collision with root package name */
    public List f10257d;

    /* renamed from: e, reason: collision with root package name */
    public List f10258e;

    /* renamed from: f, reason: collision with root package name */
    public List f10259f;

    static {
        n.e eVar = new n.e();
        f10253x = eVar;
        eVar.put("registered", g5.a.d(2, "registered"));
        eVar.put("in_progress", g5.a.d(3, "in_progress"));
        eVar.put("success", g5.a.d(4, "success"));
        eVar.put("failed", g5.a.d(5, "failed"));
        eVar.put("escrowed", g5.a.d(6, "escrowed"));
    }

    public d(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        this.f10254a = i10;
        this.f10255b = arrayList;
        this.f10256c = arrayList2;
        this.f10257d = arrayList3;
        this.f10258e = arrayList4;
        this.f10259f = arrayList5;
    }

    @Override // g5.c
    public final Map getFieldMappings() {
        return f10253x;
    }

    @Override // g5.c
    public final Object getFieldValue(g5.a aVar) {
        switch (aVar.f4442x) {
            case 1:
                return Integer.valueOf(this.f10254a);
            case 2:
                return this.f10255b;
            case 3:
                return this.f10256c;
            case 4:
                return this.f10257d;
            case 5:
                return this.f10258e;
            case 6:
                return this.f10259f;
            default:
                throw new IllegalStateException("Unknown SafeParcelable id=" + aVar.f4442x);
        }
    }

    @Override // g5.c
    public final boolean isFieldSet(g5.a aVar) {
        return true;
    }

    @Override // g5.c
    public final void setStringsInternal(g5.a aVar, String str, ArrayList arrayList) {
        int i10 = aVar.f4442x;
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        if (i10 == 6) {
                            this.f10259f = arrayList;
                            return;
                        }
                        throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", Integer.valueOf(i10)));
                    }
                    this.f10258e = arrayList;
                    return;
                }
                this.f10257d = arrayList;
                return;
            }
            this.f10256c = arrayList;
            return;
        }
        this.f10255b = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.h0(parcel, 1, this.f10254a);
        a0.p0(parcel, 2, this.f10255b);
        a0.p0(parcel, 3, this.f10256c);
        a0.p0(parcel, 4, this.f10257d);
        a0.p0(parcel, 5, this.f10258e);
        a0.p0(parcel, 6, this.f10259f);
        a0.u0(t02, parcel);
    }
}

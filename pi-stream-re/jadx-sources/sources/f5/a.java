package f5;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.api.y;
import java.util.ArrayList;
import java.util.HashMap;
import p7.a0;

/* loaded from: classes.dex */
public final class a extends c5.a implements g5.b {
    public static final Parcelable.Creator<a> CREATOR = new y(11);

    /* renamed from: a, reason: collision with root package name */
    public final int f3923a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3924b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f3925c = new SparseArray();

    public a(int i10, ArrayList arrayList) {
        this.f3923a = i10;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            c cVar = (c) arrayList.get(i11);
            String str = cVar.f3929b;
            HashMap hashMap = this.f3924b;
            int i12 = cVar.f3930c;
            hashMap.put(str, Integer.valueOf(i12));
            this.f3925c.put(i12, str);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.h0(parcel, 1, this.f3923a);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = this.f3924b;
        for (String str : hashMap.keySet()) {
            arrayList.add(new c(str, ((Integer) hashMap.get(str)).intValue()));
        }
        a0.s0(parcel, 2, arrayList, false);
        a0.u0(t02, parcel);
    }
}

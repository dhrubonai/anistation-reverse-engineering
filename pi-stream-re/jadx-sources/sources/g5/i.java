package g5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p7.a0;

/* loaded from: classes.dex */
public final class i extends c5.a {
    public static final Parcelable.Creator<i> CREATOR = new y(14);

    /* renamed from: a, reason: collision with root package name */
    public final int f4458a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4459b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4460c;

    public i(int i10, String str, ArrayList arrayList) {
        this.f4458a = i10;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) arrayList.get(i11);
            String str2 = gVar.f4453b;
            HashMap hashMap2 = new HashMap();
            ArrayList arrayList2 = gVar.f4454c;
            w7.b.s(arrayList2);
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                h hVar = (h) arrayList2.get(i12);
                hashMap2.put(hVar.f4456b, hVar.f4457c);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f4459b = hashMap;
        w7.b.s(str);
        this.f4460c = str;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            Map map = (Map) hashMap.get((String) it.next());
            Iterator it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                ((a) map.get((String) it2.next())).A = this;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = this.f4459b;
        for (String str : hashMap.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map map = (Map) hashMap.get(str);
            for (String str2 : map.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.h0(parcel, 1, this.f4458a);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = this.f4459b;
        for (String str : hashMap.keySet()) {
            arrayList.add(new g(str, (Map) hashMap.get(str)));
        }
        a0.s0(parcel, 2, arrayList, false);
        a0.n0(parcel, 3, this.f4460c, false);
        a0.u0(t02, parcel);
    }
}

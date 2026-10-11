package g5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.y;
import java.util.ArrayList;
import java.util.Map;
import p7.a0;

/* loaded from: classes.dex */
public final class g extends c5.a {
    public static final Parcelable.Creator<g> CREATOR = new y(15);

    /* renamed from: a, reason: collision with root package name */
    public final int f4452a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4453b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4454c;

    public g(int i10, String str, ArrayList arrayList) {
        this.f4452a = i10;
        this.f4453b = str;
        this.f4454c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.h0(parcel, 1, this.f4452a);
        a0.n0(parcel, 2, this.f4453b, false);
        a0.s0(parcel, 3, this.f4454c, false);
        a0.u0(t02, parcel);
    }

    public g(String str, Map map) {
        ArrayList arrayList;
        this.f4452a = 1;
        this.f4453b = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new h((a) map.get(str2), str2));
            }
        }
        this.f4454c = arrayList;
    }
}

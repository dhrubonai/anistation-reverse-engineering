package u4;

import a3.g;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p7.a0;

/* loaded from: classes.dex */
public final class f extends zzbz {
    public static final Parcelable.Creator<f> CREATOR = new q2.b(27);

    /* renamed from: y, reason: collision with root package name */
    public static final HashMap f10267y;

    /* renamed from: a, reason: collision with root package name */
    public final Set f10268a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10269b;

    /* renamed from: c, reason: collision with root package name */
    public String f10270c;

    /* renamed from: d, reason: collision with root package name */
    public int f10271d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f10272e;

    /* renamed from: f, reason: collision with root package name */
    public final PendingIntent f10273f;

    /* renamed from: x, reason: collision with root package name */
    public final a f10274x;

    static {
        HashMap hashMap = new HashMap();
        f10267y = hashMap;
        hashMap.put("accountType", new g5.a(7, false, 7, false, "accountType", 2, null));
        hashMap.put("status", new g5.a(0, false, 0, false, "status", 3, null));
        hashMap.put("transferBytes", new g5.a(8, false, 8, false, "transferBytes", 4, null));
    }

    public f(HashSet hashSet, int i10, String str, int i11, byte[] bArr, PendingIntent pendingIntent, a aVar) {
        this.f10268a = hashSet;
        this.f10269b = i10;
        this.f10270c = str;
        this.f10271d = i11;
        this.f10272e = bArr;
        this.f10273f = pendingIntent;
        this.f10274x = aVar;
    }

    @Override // g5.c
    public final /* synthetic */ Map getFieldMappings() {
        return f10267y;
    }

    @Override // g5.c
    public final Object getFieldValue(g5.a aVar) {
        int i10 = aVar.f4442x;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return this.f10272e;
                    }
                    throw new IllegalStateException("Unknown SafeParcelable id=" + aVar.f4442x);
                }
                return Integer.valueOf(this.f10271d);
            }
            return this.f10270c;
        }
        return Integer.valueOf(this.f10269b);
    }

    @Override // g5.c
    public final boolean isFieldSet(g5.a aVar) {
        return this.f10268a.contains(Integer.valueOf(aVar.f4442x));
    }

    @Override // g5.c
    public final void setDecodedBytesInternal(g5.a aVar, String str, byte[] bArr) {
        int i10 = aVar.f4442x;
        if (i10 == 4) {
            this.f10272e = bArr;
            this.f10268a.add(Integer.valueOf(i10));
            return;
        }
        throw new IllegalArgumentException(g.o("Field with id=", i10, " is not known to be an byte array."));
    }

    @Override // g5.c
    public final void setIntegerInternal(g5.a aVar, String str, int i10) {
        int i11 = aVar.f4442x;
        if (i11 == 3) {
            this.f10271d = i10;
            this.f10268a.add(Integer.valueOf(i11));
            return;
        }
        throw new IllegalArgumentException(g.o("Field with id=", i11, " is not known to be an int."));
    }

    @Override // g5.c
    public final void setStringInternal(g5.a aVar, String str, String str2) {
        int i10 = aVar.f4442x;
        if (i10 == 2) {
            this.f10270c = str2;
            this.f10268a.add(Integer.valueOf(i10));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i10)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        Set set = this.f10268a;
        if (set.contains(1)) {
            a0.h0(parcel, 1, this.f10269b);
        }
        if (set.contains(2)) {
            a0.n0(parcel, 2, this.f10270c, true);
        }
        if (set.contains(3)) {
            a0.h0(parcel, 3, this.f10271d);
        }
        if (set.contains(4)) {
            a0.f0(parcel, 4, this.f10272e, true);
        }
        if (set.contains(5)) {
            a0.m0(parcel, 5, this.f10273f, i10, true);
        }
        if (set.contains(6)) {
            a0.m0(parcel, 6, this.f10274x, i10, true);
        }
        a0.u0(t02, parcel);
    }
}

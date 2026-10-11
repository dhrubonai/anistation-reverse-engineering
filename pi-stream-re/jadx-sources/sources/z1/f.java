package z1;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import f1.b0;
import f1.v;
import java.util.HashMap;
import java.util.Locale;
import r6.n1;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11900a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f11901b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11902c;

    /* renamed from: d, reason: collision with root package name */
    public final v f11903d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11904e;

    public f(Context context) {
        Context applicationContext;
        String h02;
        TelephonyManager telephonyManager;
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.f11900a = applicationContext;
        int i10 = b0.f3799a;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                h02 = j5.a.h0(networkCountryIso);
                int[] a10 = g.a(h02);
                HashMap hashMap = new HashMap(8);
                hashMap.put(0, 1000000L);
                n1 n1Var = g.f11905n;
                hashMap.put(2, (Long) n1Var.get(a10[0]));
                hashMap.put(3, (Long) g.o.get(a10[1]));
                hashMap.put(4, (Long) g.f11906p.get(a10[2]));
                hashMap.put(5, (Long) g.f11907q.get(a10[3]));
                hashMap.put(10, (Long) g.f11908r.get(a10[4]));
                hashMap.put(9, (Long) g.f11909s.get(a10[5]));
                hashMap.put(7, (Long) n1Var.get(a10[0]));
                this.f11901b = hashMap;
                this.f11902c = 2000;
                this.f11903d = f1.a.f3794a;
                this.f11904e = true;
            }
        }
        h02 = j5.a.h0(Locale.getDefault().getCountry());
        int[] a102 = g.a(h02);
        HashMap hashMap2 = new HashMap(8);
        hashMap2.put(0, 1000000L);
        n1 n1Var2 = g.f11905n;
        hashMap2.put(2, (Long) n1Var2.get(a102[0]));
        hashMap2.put(3, (Long) g.o.get(a102[1]));
        hashMap2.put(4, (Long) g.f11906p.get(a102[2]));
        hashMap2.put(5, (Long) g.f11907q.get(a102[3]));
        hashMap2.put(10, (Long) g.f11908r.get(a102[4]));
        hashMap2.put(9, (Long) g.f11909s.get(a102[5]));
        hashMap2.put(7, (Long) n1Var2.get(a102[0]));
        this.f11901b = hashMap2;
        this.f11902c = 2000;
        this.f11903d = f1.a.f3794a;
        this.f11904e = true;
    }
}

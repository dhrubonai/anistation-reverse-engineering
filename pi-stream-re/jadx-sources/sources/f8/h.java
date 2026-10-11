package f8;

import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import msr.pistream.app.ui.player.PlayerActivity;
import r6.h0;
import y8.g0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3961a;

    public /* synthetic */ h(Object obj) {
        this.f3961a = obj;
    }

    public final void a(PlayerActivity playerActivity, LinearLayout linearLayout, List list, ArrayList arrayList, int i10, t8.b bVar) {
        boolean z9;
        boolean z10;
        String str;
        if (arrayList.isEmpty()) {
            TextView l10 = w8.i.l(playerActivity, "No sources in this mode yet", 13, w8.i.f11068h, 0);
            l10.setPadding(0, w8.i.e(playerActivity, 8), 0, 0);
            r.f.i(-1, -2, linearLayout, l10);
            return;
        }
        Iterator it = arrayList.iterator();
        String str2 = null;
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (intValue >= 0 && intValue < list.size() && (str = ((a8.h) list.get(intValue)).f199b) != null) {
                if (str2 == null) {
                    str2 = str;
                } else if (!str2.equals(str)) {
                }
            }
            z9 = false;
        }
        z9 = true;
        if (z9 && str2 != null) {
            TextView l11 = w8.i.l(playerActivity, "One stream for this title — pick quality from Quality", 13, w8.i.f11068h, 0);
            l11.setPadding(0, w8.i.e(playerActivity, 8), 0, 0);
            r.f.i(-1, -2, linearLayout, l11);
            return;
        }
        ArrayList g10 = com.bumptech.glide.d.g(list, arrayList);
        for (int i11 = 0; i11 < g10.size(); i11++) {
            String str3 = (String) g10.get(i11);
            int intValue2 = ((Integer) arrayList.get(i11)).intValue();
            if (intValue2 == i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            linearLayout.addView(((n8.a) this.f3961a).s(str3, z10, new f1.k(intValue2, list, bVar)));
        }
    }

    public final synchronized void b(g0 g0Var) {
        h0.u(g0Var, "route");
        ((Set) this.f3961a).remove(g0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r5.equals(r8.f184b) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (com.bumptech.glide.d.t(r3) == com.bumptech.glide.d.t(r8)) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(a8.e r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f3961a
            n8.a r0 = (n8.a) r0
            java.util.List r0 = r0.e()
            r1 = 0
            r2 = r1
        La:
            int r3 = r0.size()
            if (r2 >= r3) goto L3b
            java.lang.Object r3 = r0.get(r2)
            a8.e r3 = (a8.e) r3
            if (r3 == 0) goto L34
            if (r8 != 0) goto L1b
            goto L34
        L1b:
            r4 = 1
            java.lang.String r5 = r3.f184b
            if (r5 == 0) goto L29
            java.lang.String r6 = r8.f184b
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L29
            goto L35
        L29:
            int r3 = com.bumptech.glide.d.t(r3)
            int r5 = com.bumptech.glide.d.t(r8)
            if (r3 != r5) goto L34
            goto L35
        L34:
            r4 = r1
        L35:
            if (r4 == 0) goto L38
            return r2
        L38:
            int r2 = r2 + 1
            goto La
        L3b:
            int r8 = r0.indexOf(r8)
            int r8 = java.lang.Math.max(r1, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.h.c(a8.e):int");
    }

    public final void d(String str) {
        String trim;
        Object obj = this.f3961a;
        if (str == null) {
            trim = "";
        } else {
            trim = str.trim();
        }
        if (trim.isEmpty()) {
            return;
        }
        try {
            int parseInt = Integer.parseInt(trim);
            Iterator it = ((ArrayList) ((n8.a) obj).e()).iterator();
            while (it.hasNext()) {
                a8.e eVar = (a8.e) it.next();
                if (com.bumptech.glide.d.t(eVar) == parseInt) {
                    ((n8.a) obj).w(eVar);
                    ((n8.a) obj).u();
                    return;
                }
            }
        } catch (Exception e10) {
            Log.e("PlayerActivity", "exception", e10);
        }
    }

    public h(TimeUnit timeUnit) {
        h0.u(timeUnit, "timeUnit");
        this.f3961a = new c9.l(b9.f.f1563i, timeUnit);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(int i10) {
        this(TimeUnit.MINUTES);
        if (i10 != 6) {
        } else {
            this.f3961a = new LinkedHashSet();
        }
    }
}

package d2;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public long f3191a;

    public final void a(Context context, j1.p pVar, a8.e eVar) {
        String str;
        String trim;
        if (pVar != null && eVar != null) {
            boolean z9 = true;
            if (!com.bumptech.glide.c.b0(context).getBoolean("player_remember_last_episode", true)) {
                return;
            }
            j1.d0 d0Var = (j1.d0) pVar;
            long max = Math.max(0L, d0Var.D());
            long max2 = Math.max(0L, d0Var.y());
            if (max > 0 && max2 > 3000) {
                int max3 = (int) Math.max(1L, Math.min(100L, (max2 * 100) / max));
                if (max3 >= 95) {
                    a8.b bVar = new a8.b();
                    bVar.D = eVar.f188f;
                    r6.h0.x0(context, bVar);
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.f3191a < 4500) {
                    return;
                }
                this.f3191a = currentTimeMillis;
                a8.b bVar2 = new a8.b();
                bVar2.f168a = com.bumptech.glide.d.u(eVar);
                String str2 = eVar.f190y;
                if (str2 != null && !str2.trim().isEmpty()) {
                    str = str2.trim();
                } else {
                    str = null;
                }
                String str3 = eVar.f188f;
                if (str3 == null) {
                    trim = "";
                } else {
                    trim = str3.trim();
                }
                if (str == null) {
                    if (trim.matches("\\d+")) {
                        str = r6.h0.i0(trim);
                    } else {
                        str = trim;
                    }
                }
                bVar2.f169b = str;
                String str4 = eVar.f185c;
                bVar2.f170c = str4;
                bVar2.A = str4;
                String str5 = eVar.f183a;
                bVar2.f174x = str5;
                bVar2.G = str5;
                String str6 = eVar.f184b;
                bVar2.F = str6;
                bVar2.D = str;
                bVar2.H = max2;
                bVar2.I = max;
                bVar2.J = max3;
                bVar2.K = currentTimeMillis;
                if (!r6.h0.h0(str6)) {
                    String j02 = r6.h0.j0(bVar2);
                    ArrayList d10 = r6.h0.d(context);
                    if (j02.matches("\\d+")) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = d10.iterator();
                        boolean z10 = false;
                        while (it.hasNext()) {
                            a8.b bVar3 = (a8.b) it.next();
                            if (r6.h0.j0(bVar3).equals(j02)) {
                                if (!z10) {
                                    arrayList.add(bVar3);
                                    z10 = true;
                                }
                            } else {
                                arrayList.add(bVar3);
                            }
                        }
                        d10 = arrayList;
                    }
                    int i10 = 0;
                    while (true) {
                        if (i10 < d10.size()) {
                            if (j02.equals(r6.h0.j0((a8.b) d10.get(i10)))) {
                                d10.set(i10, r6.h0.D(bVar2));
                                break;
                            }
                            i10++;
                        } else {
                            z9 = false;
                            break;
                        }
                    }
                    if (!z9) {
                        d10.add(0, r6.h0.D(bVar2));
                    }
                    d10.sort(new d0.b(23));
                    if (d10.size() > 40) {
                        d10 = new ArrayList(d10.subList(0, 40));
                    }
                    r6.h0.B0(context, d10);
                }
            }
        }
    }
}

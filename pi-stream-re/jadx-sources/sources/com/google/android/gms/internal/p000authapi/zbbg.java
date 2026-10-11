package com.google.android.gms.internal.p000authapi;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.o;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;
import java.util.Set;
import p7.a0;
import w4.c;
import w4.d;
import w4.f;
import w4.g;
import w4.m;
import w4.r;
import w7.b;

/* loaded from: classes.dex */
public final class zbbg extends l {
    private static final h zba;
    private static final a zbb;
    private static final i zbc;
    private final String zbd;

    static {
        h hVar = new h();
        zba = hVar;
        zbbb zbbbVar = new zbbb();
        zbb = zbbbVar;
        zbc = new i("Auth.Api.Identity.SignIn.API", zbbbVar, hVar);
    }

    public zbbg(Activity activity, r rVar) {
        super(activity, zbc, (e) rVar, k.f2487c);
        this.zbd = zbbj.zba();
    }

    public final Task<g> beginSignIn(f fVar) {
        b.s(fVar);
        new c1.r(5).f1885a = false;
        w4.b bVar = fVar.f10964b;
        b.s(bVar);
        w4.e eVar = fVar.f10963a;
        b.s(eVar);
        d dVar = fVar.f10968f;
        b.s(dVar);
        c cVar = fVar.f10969x;
        b.s(cVar);
        final f fVar2 = new f(eVar, bVar, this.zbd, fVar.f10966d, fVar.f10967e, dVar, cVar);
        v vVar = new v();
        vVar.f2473e = new b5.c[]{zbbi.zba};
        vVar.f2472d = new s() { // from class: com.google.android.gms.internal.auth-api.zbax
            @Override // com.google.android.gms.common.api.internal.s
            public final void accept(Object obj, Object obj2) {
                zbbg zbbgVar = zbbg.this;
                f fVar3 = fVar2;
                zbbc zbbcVar = new zbbc(zbbgVar, (TaskCompletionSource) obj2);
                zbam zbamVar = (zbam) ((zbbh) obj).getService();
                b.s(fVar3);
                zbamVar.zbc(zbbcVar, fVar3);
            }
        };
        vVar.f2471c = false;
        vVar.f2470b = 1553;
        return doRead(vVar.a());
    }

    public final String getPhoneNumberFromIntent(Intent intent) {
        Status status = Status.f2358y;
        if (intent != null) {
            Status status2 = (Status) a0.p(intent, "status", Status.CREATOR);
            if (status2 != null) {
                if (status2.d()) {
                    String stringExtra = intent.getStringExtra("phone_number_hint_result");
                    if (stringExtra != null) {
                        return stringExtra;
                    }
                    throw new j(status);
                }
                throw new j(status2);
            }
            throw new j(Status.A);
        }
        throw new j(status);
    }

    public final Task<PendingIntent> getPhoneNumberHintIntent(final w4.h hVar) {
        b.s(hVar);
        v vVar = new v();
        vVar.f2473e = new b5.c[]{zbbi.zbh};
        vVar.f2472d = new s() { // from class: com.google.android.gms.internal.auth-api.zbba
            @Override // com.google.android.gms.common.api.internal.s
            public final void accept(Object obj, Object obj2) {
                zbbg.this.zba(hVar, (zbbh) obj, (TaskCompletionSource) obj2);
            }
        };
        vVar.f2470b = 1653;
        return doRead(vVar.a());
    }

    public final m getSignInCredentialFromIntent(Intent intent) {
        Status status = Status.f2358y;
        if (intent != null) {
            Status status2 = (Status) a0.p(intent, "status", Status.CREATOR);
            if (status2 != null) {
                if (status2.d()) {
                    m mVar = (m) a0.p(intent, "sign_in_credential", m.CREATOR);
                    if (mVar != null) {
                        return mVar;
                    }
                    throw new j(status);
                }
                throw new j(status2);
            }
            throw new j(Status.A);
        }
        throw new j(status);
    }

    public final Task<PendingIntent> getSignInIntent(w4.i iVar) {
        b.s(iVar);
        String str = iVar.f10972a;
        b.s(str);
        final w4.i iVar2 = new w4.i(str, iVar.f10973b, this.zbd, iVar.f10975d, iVar.f10976e, iVar.f10977f);
        v vVar = new v();
        vVar.f2473e = new b5.c[]{zbbi.zbf};
        vVar.f2472d = new s() { // from class: com.google.android.gms.internal.auth-api.zbay
            @Override // com.google.android.gms.common.api.internal.s
            public final void accept(Object obj, Object obj2) {
                zbbg zbbgVar = zbbg.this;
                w4.i iVar3 = iVar2;
                zbbe zbbeVar = new zbbe(zbbgVar, (TaskCompletionSource) obj2);
                zbam zbamVar = (zbam) ((zbbh) obj).getService();
                b.s(iVar3);
                zbamVar.zbe(zbbeVar, iVar3);
            }
        };
        vVar.f2470b = 1555;
        return doRead(vVar.a());
    }

    public final Task<Void> signOut() {
        getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Set set = o.f2490a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            com.google.android.gms.common.api.internal.h.a();
            v vVar = new v();
            vVar.f2473e = new b5.c[]{zbbi.zbb};
            vVar.f2472d = new s() { // from class: com.google.android.gms.internal.auth-api.zbaz
                @Override // com.google.android.gms.common.api.internal.s
                public final void accept(Object obj, Object obj2) {
                    zbbg.this.zbb((zbbh) obj, (TaskCompletionSource) obj2);
                }
            };
            vVar.f2471c = false;
            vVar.f2470b = 1554;
            return doWrite(vVar.a());
        }
        ((o) it.next()).getClass();
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void zba(w4.h hVar, zbbh zbbhVar, TaskCompletionSource taskCompletionSource) {
        ((zbam) zbbhVar.getService()).zbd(new zbbf(this, taskCompletionSource), hVar, this.zbd);
    }

    public final /* synthetic */ void zbb(zbbh zbbhVar, TaskCompletionSource taskCompletionSource) {
        ((zbam) zbbhVar.getService()).zbf(new zbbd(this, taskCompletionSource), this.zbd);
    }

    public zbbg(Context context, r rVar) {
        super(context, zbc, rVar, k.f2487c);
        this.zbd = zbbj.zba();
    }
}

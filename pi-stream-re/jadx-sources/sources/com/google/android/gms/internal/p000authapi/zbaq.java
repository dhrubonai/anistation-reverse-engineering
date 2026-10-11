package com.google.android.gms.internal.p000authapi;

import android.accounts.Account;
import android.content.Intent;
import b5.c;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.l;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
import p7.a0;
import w4.p;
import w7.b;

/* loaded from: classes.dex */
public final class zbaq extends l {
    private static final h zba;
    private static final a zbb;
    private static final i zbc;

    static {
        h hVar = new h();
        zba = hVar;
        zbao zbaoVar = new zbao();
        zbb = zbaoVar;
        zbc = new i("Auth.Api.Identity.Authorization.API", zbaoVar, hVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zbaq(android.app.Activity r3, w4.p r4) {
        /*
            r2 = this;
            com.google.android.gms.common.api.i r0 = com.google.android.gms.internal.p000authapi.zbaq.zbc
            java.lang.String r4 = r4.f10996a
            if (r4 == 0) goto L9
            w7.b.o(r4)
        L9:
            java.lang.String r4 = com.google.android.gms.internal.p000authapi.zbbj.zba()
            w7.b.o(r4)
            w4.p r1 = new w4.p
            r1.<init>(r4)
            com.google.android.gms.common.api.k r4 = com.google.android.gms.common.api.k.f2487c
            r2.<init>(r3, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000authapi.zbaq.<init>(android.app.Activity, w4.p):void");
    }

    public final Task<w4.a> authorize(AuthorizationRequest authorizationRequest) {
        boolean z9;
        String str;
        Account account;
        boolean z10;
        String str2;
        boolean z11;
        boolean z12;
        boolean z13;
        b.s(authorizationRequest);
        List list = authorizationRequest.f2309a;
        if (list != null && !list.isEmpty()) {
            z9 = true;
        } else {
            z9 = false;
        }
        b.i("requestedScopes cannot be null or empty", z9);
        String str3 = null;
        String str4 = authorizationRequest.f2314f;
        if (str4 != null) {
            b.o(str4);
            str = str4;
        } else {
            str = null;
        }
        Account account2 = authorizationRequest.f2313e;
        if (account2 != null) {
            account = account2;
        } else {
            account = null;
        }
        boolean z14 = authorizationRequest.f2312d;
        String str5 = authorizationRequest.f2310b;
        if (z14 && str5 != null) {
            str3 = str5;
            z10 = true;
        } else {
            z10 = false;
        }
        if (authorizationRequest.f2311c && str5 != null) {
            if (str3 != null && !str3.equals(str5)) {
                z13 = false;
            } else {
                z13 = true;
            }
            b.i("two different server client ids provided", z13);
            z12 = authorizationRequest.f2316y;
            str2 = str5;
            z11 = true;
        } else {
            str2 = str3;
            z11 = false;
            z12 = false;
        }
        final AuthorizationRequest authorizationRequest2 = new AuthorizationRequest(list, str2, z11, z10, account, str, ((p) getApiOptions()).f10996a, z12);
        v vVar = new v();
        vVar.f2473e = new c[]{zbbi.zbc};
        vVar.f2472d = new s() { // from class: com.google.android.gms.internal.auth-api.zban
            @Override // com.google.android.gms.common.api.internal.s
            public final void accept(Object obj, Object obj2) {
                zbaq zbaqVar = zbaq.this;
                AuthorizationRequest authorizationRequest3 = authorizationRequest2;
                zbap zbapVar = new zbap(zbaqVar, (TaskCompletionSource) obj2);
                zbaa zbaaVar = (zbaa) ((zbw) obj).getService();
                b.s(authorizationRequest3);
                zbaaVar.zbc(zbapVar, authorizationRequest3);
            }
        };
        vVar.f2471c = false;
        vVar.f2470b = 1534;
        return doRead(vVar.a());
    }

    public final w4.a getAuthorizationResultFromIntent(Intent intent) {
        Status status = Status.f2358y;
        if (intent != null) {
            Status status2 = (Status) a0.p(intent, "status", Status.CREATOR);
            if (status2 != null) {
                if (status2.d()) {
                    w4.a aVar = (w4.a) a0.p(intent, "authorization_result", w4.a.CREATOR);
                    if (aVar != null) {
                        return aVar;
                    }
                    throw new j(status);
                }
                throw new j(status2);
            }
            throw new j(Status.A);
        }
        throw new j(status);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zbaq(android.content.Context r3, w4.p r4) {
        /*
            r2 = this;
            com.google.android.gms.common.api.i r0 = com.google.android.gms.internal.p000authapi.zbaq.zbc
            java.lang.String r4 = r4.f10996a
            if (r4 == 0) goto L9
            w7.b.o(r4)
        L9:
            java.lang.String r4 = com.google.android.gms.internal.p000authapi.zbbj.zba()
            w7.b.o(r4)
            w4.p r1 = new w4.p
            r1.<init>(r4)
            com.google.android.gms.common.api.k r4 = com.google.android.gms.common.api.k.f2487c
            r2.<init>(r3, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000authapi.zbaq.<init>(android.content.Context, w4.p):void");
    }
}

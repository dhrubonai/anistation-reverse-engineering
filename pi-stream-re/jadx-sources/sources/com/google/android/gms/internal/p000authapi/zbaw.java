package com.google.android.gms.internal.p000authapi;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import b5.c;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.List;
import p7.a0;
import w4.j;
import w4.q;
import w7.b;

/* loaded from: classes.dex */
public final class zbaw extends l {
    private static final h zba;
    private static final a zbb;
    private static final i zbc;
    private final String zbd;

    static {
        h hVar = new h();
        zba = hVar;
        zbat zbatVar = new zbat();
        zbb = zbatVar;
        zbc = new i("Auth.Api.Identity.CredentialSaving.API", zbatVar, hVar);
    }

    public zbaw(Activity activity, q qVar) {
        super(activity, zbc, (e) qVar, k.f2487c);
        this.zbd = zbbj.zba();
    }

    public final Status getStatusFromIntent(Intent intent) {
        Status status = Status.f2358y;
        if (intent == null) {
            return status;
        }
        Status status2 = (Status) a0.p(intent, "status", Status.CREATOR);
        if (status2 == null) {
            return status;
        }
        return status2;
    }

    public final Task<j> saveAccountLinkingToken(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        boolean z9;
        boolean z10;
        b.s(saveAccountLinkingTokenRequest);
        new ArrayList();
        List list = saveAccountLinkingTokenRequest.f2320d;
        String str = saveAccountLinkingTokenRequest.f2319c;
        PendingIntent pendingIntent = saveAccountLinkingTokenRequest.f2317a;
        String str2 = saveAccountLinkingTokenRequest.f2318b;
        int i10 = saveAccountLinkingTokenRequest.f2322f;
        TextUtils.isEmpty(saveAccountLinkingTokenRequest.f2321e);
        String str3 = this.zbd;
        if (pendingIntent != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        b.i("Consent PendingIntent cannot be null", z9);
        b.i("Invalid tokenType", "auth_code".equals(str2));
        b.i("serviceId cannot be null or empty", !TextUtils.isEmpty(str));
        if (list != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        b.i("scopes cannot be null", z10);
        final SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest2 = new SaveAccountLinkingTokenRequest(pendingIntent, str2, str, list, str3, i10);
        v vVar = new v();
        vVar.f2473e = new c[]{zbbi.zbg};
        vVar.f2472d = new s() { // from class: com.google.android.gms.internal.auth-api.zbar
            @Override // com.google.android.gms.common.api.internal.s
            public final void accept(Object obj, Object obj2) {
                zbaw zbawVar = zbaw.this;
                SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest3 = saveAccountLinkingTokenRequest2;
                zbau zbauVar = new zbau(zbawVar, (TaskCompletionSource) obj2);
                zbad zbadVar = (zbad) ((zbx) obj).getService();
                b.s(saveAccountLinkingTokenRequest3);
                zbadVar.zbc(zbauVar, saveAccountLinkingTokenRequest3);
            }
        };
        vVar.f2471c = false;
        vVar.f2470b = 1535;
        return doRead(vVar.a());
    }

    public final Task<w4.l> savePassword(w4.k kVar) {
        b.s(kVar);
        final w4.k kVar2 = new w4.k(kVar.f10979a, this.zbd, kVar.f10981c);
        v vVar = new v();
        vVar.f2473e = new c[]{zbbi.zbe};
        vVar.f2472d = new s() { // from class: com.google.android.gms.internal.auth-api.zbas
            @Override // com.google.android.gms.common.api.internal.s
            public final void accept(Object obj, Object obj2) {
                zbaw zbawVar = zbaw.this;
                w4.k kVar3 = kVar2;
                zbav zbavVar = new zbav(zbawVar, (TaskCompletionSource) obj2);
                zbad zbadVar = (zbad) ((zbx) obj).getService();
                b.s(kVar3);
                zbadVar.zbd(zbavVar, kVar3);
            }
        };
        vVar.f2471c = false;
        vVar.f2470b = 1536;
        return doRead(vVar.a());
    }

    public zbaw(Context context, q qVar) {
        super(context, zbc, qVar, k.f2487c);
        this.zbd = zbbj.zba();
    }
}

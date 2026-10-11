package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import b5.c;
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
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import r4.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzab extends l implements zzg {
    private static final h zza;
    private static final a zzb;
    private static final i zzc;
    private static final e5.a zzd;
    private final Context zze;

    static {
        h hVar = new h();
        zza = hVar;
        zzv zzvVar = new zzv();
        zzb = zzvVar;
        zzc = new i("GoogleAuthService.API", zzvVar, hVar);
        zzd = new e5.a("Auth", "GoogleAuthServiceClient");
    }

    public zzab(Context context) {
        super(context, zzc, e.f2365i, k.f2487c);
        this.zze = context;
    }

    public static void zzf(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        boolean trySetException;
        if (status.d()) {
            trySetException = taskCompletionSource.trySetResult(obj);
        } else {
            trySetException = taskCompletionSource.trySetException(new j(status));
        }
        if (!trySetException) {
            zzd.f("The task is already complete.", new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zza(final zzbw zzbwVar) {
        v vVar = new v();
        vVar.f2473e = new c[]{z7.c.f12116j};
        vVar.f2472d = new s() { // from class: com.google.android.gms.internal.auth.zzt
            @Override // com.google.android.gms.common.api.internal.s
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzp) ((zzi) obj).getService()).zzd(new zzx(zzabVar, (TaskCompletionSource) obj2), zzbwVar);
            }
        };
        vVar.f2470b = 1513;
        return doWrite(vVar.a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzb(final b bVar) {
        if (bVar != null) {
            v vVar = new v();
            vVar.f2473e = new c[]{z7.c.f12115i};
            vVar.f2472d = new s() { // from class: com.google.android.gms.internal.auth.zzu
                @Override // com.google.android.gms.common.api.internal.s
                public final void accept(Object obj, Object obj2) {
                    zzab zzabVar = zzab.this;
                    b bVar2 = bVar;
                    ((zzp) ((zzi) obj).getService()).zze(new zzz(zzabVar, (TaskCompletionSource) obj2), bVar2);
                }
            };
            vVar.f2470b = 1515;
            return doWrite(vVar.a());
        }
        throw new NullPointerException("request cannot be null.");
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzc(final Account account, final String str, final Bundle bundle) {
        if (account != null) {
            w7.b.n("Scope cannot be null!", str);
            v vVar = new v();
            vVar.f2473e = new c[]{z7.c.f12116j};
            vVar.f2472d = new s() { // from class: com.google.android.gms.internal.auth.zzs
                @Override // com.google.android.gms.common.api.internal.s
                public final void accept(Object obj, Object obj2) {
                    zzab zzabVar = zzab.this;
                    ((zzp) ((zzi) obj).getService()).zzf(new zzw(zzabVar, (TaskCompletionSource) obj2), account, str, bundle);
                }
            };
            vVar.f2470b = 1512;
            return doWrite(vVar.a());
        }
        throw new NullPointerException("Account name cannot be null!");
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzd(final Account account) {
        if (account != null) {
            v vVar = new v();
            vVar.f2473e = new c[]{z7.c.f12115i};
            vVar.f2472d = new s() { // from class: com.google.android.gms.internal.auth.zzr
                @Override // com.google.android.gms.common.api.internal.s
                public final void accept(Object obj, Object obj2) {
                    zzab zzabVar = zzab.this;
                    ((zzp) ((zzi) obj).getService()).zzg(new zzaa(zzabVar, (TaskCompletionSource) obj2), account);
                }
            };
            vVar.f2470b = 1517;
            return doWrite(vVar.a());
        }
        throw new NullPointerException("account cannot be null.");
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zze(final String str) {
        if (str != null) {
            v vVar = new v();
            vVar.f2473e = new c[]{z7.c.f12115i};
            vVar.f2472d = new s() { // from class: com.google.android.gms.internal.auth.zzq
                @Override // com.google.android.gms.common.api.internal.s
                public final void accept(Object obj, Object obj2) {
                    zzab zzabVar = zzab.this;
                    ((zzp) ((zzi) obj).getService()).zzh(new zzy(zzabVar, (TaskCompletionSource) obj2), str);
                }
            };
            vVar.f2470b = 1514;
            return doWrite(vVar.a());
        }
        throw new NullPointerException("Client package name cannot be null!");
    }
}

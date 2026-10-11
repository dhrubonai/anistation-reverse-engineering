package com.google.android.recaptcha.internal;

import androidx.lifecycle.q0;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p7.d1;
import p7.i0;
import p7.s1;
import p7.v0;
import p7.y;
import q6.g;
import r6.h0;
import t7.f;
import t7.s;
import u7.d;
import z6.i;

/* loaded from: classes.dex */
public final class zzt {
    public static final zzr zza = new zzr(null);
    private final y zzb;
    private final y zzc;
    private final y zzd;

    public zzt() {
        s1 s1Var = new s1(null);
        d dVar = i0.f8691a;
        this.zzb = new f(s1Var.t(s.f10087a));
        final AtomicInteger atomicInteger = new AtomicInteger();
        i v0Var = new v0(Executors.newScheduledThreadPool(1, new ThreadFactory() { // from class: p7.v1

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f8750a = 1;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f8751b = "reCaptcha";

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                int i10 = this.f8750a;
                String str = this.f8751b;
                if (i10 != 1) {
                    str = str + '-' + atomicInteger.incrementAndGet();
                }
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(true);
                return thread;
            }
        }));
        q0 q0Var = q0.f1134x;
        f fVar = new f(v0Var.r(q0Var) == null ? g.L(v0Var, new d1(null)) : v0Var);
        h0.k0(fVar, new zzs(null));
        this.zzc = fVar;
        i iVar = i0.f8692b;
        this.zzd = new f(iVar.r(q0Var) == null ? g.L(iVar, new d1(null)) : iVar);
    }

    public final y zza() {
        return this.zzd;
    }

    public final y zzb() {
        return this.zzb;
    }

    public final y zzc() {
        return this.zzc;
    }
}

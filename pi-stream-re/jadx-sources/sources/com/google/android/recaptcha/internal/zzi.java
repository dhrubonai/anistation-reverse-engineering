package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.TaskCompletionSource;
import h7.l;
import i7.h;
import java.util.concurrent.CancellationException;
import p7.d0;
import p7.k1;
import p7.t;
import p7.x0;
import w6.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzi extends h implements l {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ d0 zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzi(TaskCompletionSource taskCompletionSource, d0 d0Var) {
        super(1);
        this.zza = taskCompletionSource;
        this.zzb = d0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Throwable] */
    @Override // h7.l
    public final Object invoke(Object obj) {
        t tVar;
        Exception exc;
        Throwable th = (Throwable) obj;
        if (th instanceof CancellationException) {
            this.zza.setException((Exception) th);
        } else {
            Object B = ((k1) this.zzb).B();
            if (!(B instanceof x0)) {
                Exception exc2 = null;
                if (B instanceof t) {
                    tVar = (t) B;
                } else {
                    tVar = null;
                }
                if (tVar != null) {
                    exc = tVar.f8743a;
                } else {
                    exc = null;
                }
                if (exc == null) {
                    this.zza.setResult(this.zzb.f());
                } else {
                    TaskCompletionSource taskCompletionSource = this.zza;
                    if (exc instanceof Exception) {
                        exc2 = exc;
                    }
                    if (exc2 == null) {
                        exc2 = new RuntimeExecutionException(exc);
                    }
                    taskCompletionSource.setException(exc2);
                }
            } else {
                throw new IllegalStateException("This job has not completed yet".toString());
            }
        }
        return f.f11019a;
    }
}

package com.google.android.gms.common.api.internal;

import android.app.AlertDialog;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class z implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2484a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2485b;

    public z(z zVar, TaskCompletionSource taskCompletionSource) {
        this.f2485b = zVar;
        this.f2484a = taskCompletionSource;
    }

    public final void a(Status status, boolean z9) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.f2484a)) {
            hashMap = new HashMap((Map) this.f2484a);
        }
        synchronized (((Map) this.f2485b)) {
            hashMap2 = new HashMap((Map) this.f2485b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z9 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z9 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new com.google.android.gms.common.api.j(status));
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        ((Map) ((z) this.f2485b).f2485b).remove((TaskCompletionSource) this.f2484a);
    }

    public z(t0 t0Var, AlertDialog alertDialog) {
        this.f2485b = t0Var;
        this.f2484a = alertDialog;
    }

    public z() {
        this.f2484a = Collections.synchronizedMap(new WeakHashMap());
        this.f2485b = Collections.synchronizedMap(new WeakHashMap());
    }
}

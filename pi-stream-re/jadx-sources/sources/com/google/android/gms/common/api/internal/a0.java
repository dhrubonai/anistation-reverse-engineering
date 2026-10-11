package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.base.zaq;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a0 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f2373a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f2374b;

    /* renamed from: c, reason: collision with root package name */
    public final zaq f2375c;

    /* renamed from: d, reason: collision with root package name */
    public final b5.d f2376d;

    /* renamed from: e, reason: collision with root package name */
    public final n.f f2377e;

    /* renamed from: f, reason: collision with root package name */
    public final h f2378f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(l lVar, h hVar) {
        super(lVar);
        b5.d dVar = b5.d.f1517d;
        this.f2374b = new AtomicReference(null);
        this.f2375c = new zaq(Looper.getMainLooper());
        this.f2376d = dVar;
        this.f2377e = new n.f(0);
        this.f2378f = hVar;
        this.mLifecycleFragment.a("ConnectionlessLifecycleHelper", this);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void onCancel(DialogInterface dialogInterface) {
        int i10;
        b5.a aVar = new b5.a(13, null);
        AtomicReference atomicReference = this.f2374b;
        c1 c1Var = (c1) atomicReference.get();
        if (c1Var == null) {
            i10 = -1;
        } else {
            i10 = c1Var.f2391a;
        }
        atomicReference.set(null);
        this.f2378f.h(aVar, i10);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onActivityResult(int i10, int i11, Intent intent) {
        AtomicReference atomicReference = this.f2374b;
        c1 c1Var = (c1) atomicReference.get();
        h hVar = this.f2378f;
        if (i10 != 1) {
            if (i10 == 2) {
                int b10 = this.f2376d.b(getActivity());
                if (b10 == 0) {
                    atomicReference.set(null);
                    zaq zaqVar = hVar.E;
                    zaqVar.sendMessage(zaqVar.obtainMessage(3));
                    return;
                } else if (c1Var != null) {
                    if (c1Var.f2392b.f1507b == 18 && b10 == 18) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else if (i11 == -1) {
            atomicReference.set(null);
            zaq zaqVar2 = hVar.E;
            zaqVar2.sendMessage(zaqVar2.obtainMessage(3));
            return;
        } else if (i11 == 0) {
            if (c1Var != null) {
                int i12 = 13;
                if (intent != null) {
                    i12 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                b5.a aVar = new b5.a(1, i12, null, c1Var.f2392b.toString());
                atomicReference.set(null);
                hVar.h(aVar, c1Var.f2391a);
                return;
            }
            return;
        }
        if (c1Var != null) {
            atomicReference.set(null);
            hVar.h(c1Var.f2392b, c1Var.f2391a);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onCreate(Bundle bundle) {
        c1 c1Var;
        super.onCreate(bundle);
        if (bundle != null) {
            AtomicReference atomicReference = this.f2374b;
            if (bundle.getBoolean("resolving_error", false)) {
                c1Var = new c1(new b5.a(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            } else {
                c1Var = null;
            }
            atomicReference.set(c1Var);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onResume() {
        super.onResume();
        if (!this.f2377e.isEmpty()) {
            this.f2378f.b(this);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        c1 c1Var = (c1) this.f2374b.get();
        if (c1Var != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", c1Var.f2391a);
            b5.a aVar = c1Var.f2392b;
            bundle.putInt("failed_status", aVar.f1507b);
            bundle.putParcelable("failed_resolution", aVar.f1508c);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        this.f2373a = true;
        if (!this.f2377e.isEmpty()) {
            this.f2378f.b(this);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        this.f2373a = false;
        h hVar = this.f2378f;
        hVar.getClass();
        synchronized (h.I) {
            if (hVar.B == this) {
                hVar.B = null;
                hVar.C.clear();
            }
        }
    }
}

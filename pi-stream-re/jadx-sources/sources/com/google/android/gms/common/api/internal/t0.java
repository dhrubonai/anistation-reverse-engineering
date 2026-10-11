package com.google.android.gms.common.api.internal;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.internal.base.zaq;
import java.util.Set;

/* loaded from: classes.dex */
public final class t0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2465a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2466b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2467c;

    public /* synthetic */ t0(int i10, Object obj, Object obj2) {
        this.f2465a = i10;
        this.f2467c = obj;
        this.f2466b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        Set set;
        boolean z10;
        com.google.android.gms.common.internal.m mVar;
        boolean z11 = false;
        com.google.android.gms.common.internal.m mVar2 = null;
        switch (this.f2465a) {
            case 1:
                if (((a0) this.f2467c).f2373a) {
                    b5.a aVar = ((c1) this.f2466b).f2392b;
                    if (aVar.f1507b != 0 && aVar.f1508c != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        a0 a0Var = (a0) this.f2467c;
                        l lVar = a0Var.mLifecycleFragment;
                        Activity activity = a0Var.getActivity();
                        PendingIntent pendingIntent = aVar.f1508c;
                        w7.b.s(pendingIntent);
                        int i10 = ((c1) this.f2466b).f2391a;
                        int i11 = GoogleApiActivity.f2352b;
                        Intent intent = new Intent(activity, (Class<?>) GoogleApiActivity.class);
                        intent.putExtra("pending_intent", pendingIntent);
                        intent.putExtra("failing_client_id", i10);
                        intent.putExtra("notify_manager", false);
                        lVar.startActivityForResult(intent, 1);
                        return;
                    }
                    a0 a0Var2 = (a0) this.f2467c;
                    if (a0Var2.f2376d.a(a0Var2.getActivity(), null, aVar.f1507b) != null) {
                        a0 a0Var3 = (a0) this.f2467c;
                        b5.d dVar = a0Var3.f2376d;
                        Activity activity2 = a0Var3.getActivity();
                        a0 a0Var4 = (a0) this.f2467c;
                        dVar.h(activity2, a0Var4.mLifecycleFragment, aVar.f1507b, a0Var4);
                        return;
                    }
                    if (aVar.f1507b == 18) {
                        a0 a0Var5 = (a0) this.f2467c;
                        b5.d dVar2 = a0Var5.f2376d;
                        Activity activity3 = a0Var5.getActivity();
                        a0 a0Var6 = (a0) this.f2467c;
                        dVar2.getClass();
                        ProgressBar progressBar = new ProgressBar(activity3, null, R.attr.progressBarStyleLarge);
                        progressBar.setIndeterminate(true);
                        progressBar.setVisibility(0);
                        AlertDialog.Builder builder = new AlertDialog.Builder(activity3);
                        builder.setView(progressBar);
                        builder.setMessage(com.google.android.gms.common.internal.w.b(activity3, 18));
                        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
                        AlertDialog create = builder.create();
                        b5.d.f(activity3, create, "GooglePlayServicesUpdatingDialog", a0Var6);
                        a0 a0Var7 = (a0) this.f2467c;
                        b5.d dVar3 = a0Var7.f2376d;
                        Context applicationContext = a0Var7.getActivity().getApplicationContext();
                        z zVar = new z(this, create);
                        dVar3.getClass();
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                        intentFilter.addDataScheme("package");
                        k0 k0Var = new k0(zVar);
                        applicationContext.registerReceiver(k0Var, intentFilter);
                        k0Var.f2439a = applicationContext;
                        if (!b5.g.a(applicationContext)) {
                            a0 a0Var8 = (a0) this.f2467c;
                            a0Var8.f2374b.set(null);
                            zaq zaqVar = a0Var8.f2378f.E;
                            zaqVar.sendMessage(zaqVar.obtainMessage(3));
                            AlertDialog alertDialog = create;
                            if (alertDialog.isShowing()) {
                                alertDialog.dismiss();
                            }
                            synchronized (k0Var) {
                                Context context = k0Var.f2439a;
                                if (context != null) {
                                    context.unregisterReceiver(k0Var);
                                }
                                k0Var.f2439a = null;
                            }
                            return;
                        }
                        return;
                    }
                    a0 a0Var9 = (a0) this.f2467c;
                    int i12 = ((c1) this.f2466b).f2391a;
                    a0Var9.f2374b.set(null);
                    a0Var9.f2378f.h(aVar, i12);
                    return;
                }
                return;
            case 2:
                Object obj = this.f2467c;
                i0 i0Var = (i0) obj;
                g0 g0Var = (g0) ((h) i0Var.f2436f).A.get((a) i0Var.f2433c);
                if (g0Var != null) {
                    b5.a aVar2 = (b5.a) this.f2466b;
                    if (aVar2.f1507b == 0) {
                        z11 = true;
                    }
                    if (z11) {
                        i0Var.f2431a = true;
                        if (((com.google.android.gms.common.api.g) i0Var.f2432b).requiresSignIn()) {
                            if (i0Var.f2431a && (mVar = (com.google.android.gms.common.internal.m) i0Var.f2434d) != null) {
                                ((com.google.android.gms.common.api.g) i0Var.f2432b).getRemoteService(mVar, (Set) i0Var.f2435e);
                                return;
                            }
                            return;
                        }
                        try {
                            Object obj2 = ((i0) obj).f2432b;
                            ((com.google.android.gms.common.api.g) obj2).getRemoteService(null, ((com.google.android.gms.common.api.g) obj2).getScopesForConnectionlessNonSignIn());
                            return;
                        } catch (SecurityException e10) {
                            Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
                            ((com.google.android.gms.common.api.g) i0Var.f2432b).disconnect("Failed to get service from broker.");
                            g0Var.p(new b5.a(10), null);
                            return;
                        }
                    }
                    g0Var.p(aVar2, null);
                    return;
                }
                return;
            default:
                r0 r0Var = (r0) this.f2467c;
                r5.h hVar = (r5.h) this.f2466b;
                s4.g gVar = r0.f2456h;
                b5.a aVar3 = hVar.f9425b;
                if (aVar3.f1507b == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    com.google.android.gms.common.internal.c0 c0Var = hVar.f9426c;
                    w7.b.s(c0Var);
                    b5.a aVar4 = c0Var.f2504c;
                    if (aVar4.f1507b == 0) {
                        z11 = true;
                    }
                    if (!z11) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(aVar4)), new Exception());
                        r0Var.f2463g.e(aVar4);
                        r0Var.f2462f.disconnect();
                        return;
                    }
                    i0 i0Var2 = r0Var.f2463g;
                    IBinder iBinder = c0Var.f2503b;
                    if (iBinder != null) {
                        int i13 = com.google.android.gms.common.internal.a.f2494a;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        if (queryLocalInterface instanceof com.google.android.gms.common.internal.m) {
                            mVar2 = (com.google.android.gms.common.internal.m) queryLocalInterface;
                        } else {
                            mVar2 = new com.google.android.gms.common.internal.s0(iBinder);
                        }
                    }
                    i0Var2.getClass();
                    if (mVar2 != null && (set = r0Var.f2460d) != null) {
                        i0Var2.f2434d = mVar2;
                        i0Var2.f2435e = set;
                        if (i0Var2.f2431a) {
                            ((com.google.android.gms.common.api.g) i0Var2.f2432b).getRemoteService(mVar2, set);
                        }
                    } else {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        i0Var2.e(new b5.a(4));
                    }
                } else {
                    r0Var.f2463g.e(aVar3);
                }
                r0Var.f2462f.disconnect();
                return;
        }
    }
}

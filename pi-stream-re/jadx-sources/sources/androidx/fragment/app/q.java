package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public class q extends y implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public boolean A0;

    /* renamed from: m0, reason: collision with root package name */
    public Handler f950m0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f959v0;

    /* renamed from: x0, reason: collision with root package name */
    public Dialog f961x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f962y0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f963z0;

    /* renamed from: n0, reason: collision with root package name */
    public final e f951n0 = new e(this, 1);

    /* renamed from: o0, reason: collision with root package name */
    public final m f952o0 = new m(this);

    /* renamed from: p0, reason: collision with root package name */
    public final n f953p0 = new n(this);

    /* renamed from: q0, reason: collision with root package name */
    public int f954q0 = 0;

    /* renamed from: r0, reason: collision with root package name */
    public int f955r0 = 0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f956s0 = true;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f957t0 = true;

    /* renamed from: u0, reason: collision with root package name */
    public int f958u0 = -1;

    /* renamed from: w0, reason: collision with root package name */
    public final o f960w0 = new o(this);
    public boolean B0 = false;

    @Override // androidx.fragment.app.y
    public final void A() {
        this.T = true;
        Dialog dialog = this.f961x0;
        if (dialog != null) {
            this.f962y0 = true;
            dialog.setOnDismissListener(null);
            this.f961x0.dismiss();
            if (!this.f963z0) {
                onDismiss(this.f961x0);
            }
            this.f961x0 = null;
            this.B0 = false;
        }
    }

    @Override // androidx.fragment.app.y
    public final void B() {
        this.T = true;
        if (!this.A0 && !this.f963z0) {
            this.f963z0 = true;
        }
        this.f1040f0.i(this.f960w0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046 A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:10:0x001a, B:12:0x0026, B:18:0x003e, B:20:0x0046, B:21:0x004d, B:23:0x0030, B:25:0x0036, B:26:0x003b, B:27:0x0065), top: B:9:0x001a }] */
    @Override // androidx.fragment.app.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.LayoutInflater C(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.LayoutInflater r8 = super.C(r8)
            boolean r0 = r7.f957t0
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L98
            boolean r3 = r7.f959v0
            if (r3 == 0) goto L11
            goto L98
        L11:
            if (r0 != 0) goto L14
            goto L6f
        L14:
            boolean r0 = r7.B0
            if (r0 != 0) goto L6f
            r0 = 0
            r3 = 1
            r7.f959v0 = r3     // Catch: java.lang.Throwable -> L6b
            android.app.Dialog r4 = r7.V()     // Catch: java.lang.Throwable -> L6b
            r7.f961x0 = r4     // Catch: java.lang.Throwable -> L6b
            boolean r5 = r7.f957t0     // Catch: java.lang.Throwable -> L6b
            if (r5 == 0) goto L65
            int r5 = r7.f954q0     // Catch: java.lang.Throwable -> L6b
            if (r5 == r3) goto L3b
            if (r5 == r2) goto L3b
            r6 = 3
            if (r5 == r6) goto L30
            goto L3e
        L30:
            android.view.Window r5 = r4.getWindow()     // Catch: java.lang.Throwable -> L6b
            if (r5 == 0) goto L3b
            r6 = 24
            r5.addFlags(r6)     // Catch: java.lang.Throwable -> L6b
        L3b:
            r4.requestWindowFeature(r3)     // Catch: java.lang.Throwable -> L6b
        L3e:
            android.content.Context r4 = r7.k()     // Catch: java.lang.Throwable -> L6b
            boolean r5 = r4 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L6b
            if (r5 == 0) goto L4d
            android.app.Dialog r5 = r7.f961x0     // Catch: java.lang.Throwable -> L6b
            android.app.Activity r4 = (android.app.Activity) r4     // Catch: java.lang.Throwable -> L6b
            r5.setOwnerActivity(r4)     // Catch: java.lang.Throwable -> L6b
        L4d:
            android.app.Dialog r4 = r7.f961x0     // Catch: java.lang.Throwable -> L6b
            boolean r5 = r7.f956s0     // Catch: java.lang.Throwable -> L6b
            r4.setCancelable(r5)     // Catch: java.lang.Throwable -> L6b
            android.app.Dialog r4 = r7.f961x0     // Catch: java.lang.Throwable -> L6b
            androidx.fragment.app.m r5 = r7.f952o0     // Catch: java.lang.Throwable -> L6b
            r4.setOnCancelListener(r5)     // Catch: java.lang.Throwable -> L6b
            android.app.Dialog r4 = r7.f961x0     // Catch: java.lang.Throwable -> L6b
            androidx.fragment.app.n r5 = r7.f953p0     // Catch: java.lang.Throwable -> L6b
            r4.setOnDismissListener(r5)     // Catch: java.lang.Throwable -> L6b
            r7.B0 = r3     // Catch: java.lang.Throwable -> L6b
            goto L68
        L65:
            r3 = 0
            r7.f961x0 = r3     // Catch: java.lang.Throwable -> L6b
        L68:
            r7.f959v0 = r0
            goto L6f
        L6b:
            r8 = move-exception
            r7.f959v0 = r0
            throw r8
        L6f:
            boolean r0 = androidx.fragment.app.s0.H(r2)
            if (r0 == 0) goto L8b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "get layout inflater for DialogFragment "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r2 = " from dialog context"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L8b:
            android.app.Dialog r0 = r7.f961x0
            if (r0 == 0) goto L97
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r8 = r8.cloneInContext(r0)
        L97:
            return r8
        L98:
            boolean r0 = androidx.fragment.app.s0.H(r2)
            if (r0 == 0) goto Ld3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "getting layout inflater for DialogFragment "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            boolean r2 = r7.f957t0
            if (r2 != 0) goto Lc2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "mShowsDialog = false: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.d(r1, r0)
            goto Ld3
        Lc2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "mCreatingDialog = true: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.d(r1, r0)
        Ld3:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.q.C(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // androidx.fragment.app.y
    public void F(Bundle bundle) {
        Dialog dialog = this.f961x0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i10 = this.f954q0;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f955r0;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z9 = this.f956s0;
        if (!z9) {
            bundle.putBoolean("android:cancelable", z9);
        }
        boolean z10 = this.f957t0;
        if (!z10) {
            bundle.putBoolean("android:showsDialog", z10);
        }
        int i12 = this.f958u0;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // androidx.fragment.app.y
    public void G() {
        this.T = true;
        Dialog dialog = this.f961x0;
        if (dialog != null) {
            this.f962y0 = false;
            dialog.show();
            View decorView = this.f961x0.getWindow().getDecorView();
            j5.a.e0(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.y
    public void H() {
        this.T = true;
        Dialog dialog = this.f961x0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.y
    public final void J(Bundle bundle) {
        Bundle bundle2;
        this.T = true;
        if (this.f961x0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f961x0.onRestoreInstanceState(bundle2);
        }
    }

    @Override // androidx.fragment.app.y
    public final void L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.L(layoutInflater, viewGroup, bundle);
        if (this.V == null && this.f961x0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f961x0.onRestoreInstanceState(bundle2);
        }
    }

    public final void U(boolean z9, boolean z10) {
        if (this.f963z0) {
            return;
        }
        this.f963z0 = true;
        this.A0 = false;
        Dialog dialog = this.f961x0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f961x0.dismiss();
            if (!z10) {
                if (Looper.myLooper() == this.f950m0.getLooper()) {
                    onDismiss(this.f961x0);
                } else {
                    this.f950m0.post(this.f951n0);
                }
            }
        }
        this.f962y0 = true;
        if (this.f958u0 >= 0) {
            s0 m5 = m();
            int i10 = this.f958u0;
            if (i10 >= 0) {
                m5.v(new r0(m5, i10), z9);
                this.f958u0 = -1;
                return;
            }
            throw new IllegalArgumentException(a3.g.n("Bad id: ", i10));
        }
        a aVar = new a(m());
        aVar.o = true;
        aVar.i(this);
        if (z9) {
            aVar.d(true);
        } else {
            aVar.d(false);
        }
    }

    public Dialog V() {
        if (s0.H(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new androidx.activity.l(O(), this.f955r0);
    }

    public final Dialog W() {
        Dialog dialog = this.f961x0;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    @Override // androidx.fragment.app.y
    public final com.bumptech.glide.c f() {
        return new p(this, new s(this));
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f962y0) {
            if (s0.H(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            U(true, true);
        }
    }

    @Override // androidx.fragment.app.y
    public final void t() {
        this.T = true;
    }

    @Override // androidx.fragment.app.y
    public final void w(Context context) {
        Object obj;
        super.w(context);
        androidx.lifecycle.c0 c0Var = this.f1040f0;
        c0Var.getClass();
        androidx.lifecycle.c0.a("observeForever");
        o oVar = this.f960w0;
        androidx.lifecycle.y yVar = new androidx.lifecycle.y(c0Var, oVar);
        l.g gVar = c0Var.f1080b;
        l.c b10 = gVar.b(oVar);
        if (b10 != null) {
            obj = b10.f6565b;
        } else {
            l.c cVar = new l.c(oVar, yVar);
            gVar.f6576d++;
            l.c cVar2 = gVar.f6574b;
            if (cVar2 == null) {
                gVar.f6573a = cVar;
                gVar.f6574b = cVar;
            } else {
                cVar2.f6566c = cVar;
                cVar.f6567d = cVar2;
                gVar.f6574b = cVar;
            }
            obj = null;
        }
        androidx.lifecycle.a0 a0Var = (androidx.lifecycle.a0) obj;
        if (!(a0Var instanceof androidx.lifecycle.z)) {
            if (a0Var == null) {
                yVar.a(true);
            }
            if (!this.A0) {
                this.f963z0 = false;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    @Override // androidx.fragment.app.y
    public void x(Bundle bundle) {
        boolean z9;
        super.x(bundle);
        this.f950m0 = new Handler();
        if (this.N == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f957t0 = z9;
        if (bundle != null) {
            this.f954q0 = bundle.getInt("android:style", 0);
            this.f955r0 = bundle.getInt("android:theme", 0);
            this.f956s0 = bundle.getBoolean("android:cancelable", true);
            this.f957t0 = bundle.getBoolean("android:showsDialog", this.f957t0);
            this.f958u0 = bundle.getInt("android:backStackId", -1);
        }
    }
}

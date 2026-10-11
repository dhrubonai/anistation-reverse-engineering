package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.u;
import androidx.lifecycle.w;
import r6.h0;

/* loaded from: classes.dex */
public class l extends Dialog implements u, s {

    /* renamed from: a, reason: collision with root package name */
    public w f269a;

    /* renamed from: b, reason: collision with root package name */
    public final r f270b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, int i10) {
        super(context, i10);
        h0.u(context, "context");
        this.f270b = new r(new b(this, 1));
    }

    public static void d(l lVar) {
        h0.u(lVar, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h0.u(view, "view");
        e();
        super.addContentView(view, layoutParams);
    }

    public final void e() {
        Window window = getWindow();
        h0.q(window);
        j5.a.e0(window.getDecorView(), this);
        Window window2 = getWindow();
        h0.q(window2);
        View decorView = window2.getDecorView();
        h0.s(decorView, "window!!.decorView");
        j5.a.d0(decorView, this);
    }

    @Override // androidx.lifecycle.u
    public final androidx.lifecycle.p getLifecycle() {
        w wVar = this.f269a;
        if (wVar == null) {
            w wVar2 = new w(this);
            this.f269a = wVar2;
            return wVar2;
        }
        return wVar;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f270b.a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            r rVar = this.f270b;
            rVar.f288e = onBackInvokedDispatcher;
            rVar.b();
        }
        w wVar = this.f269a;
        if (wVar == null) {
            wVar = new w(this);
            this.f269a = wVar;
        }
        wVar.e(androidx.lifecycle.n.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        w wVar = this.f269a;
        if (wVar == null) {
            wVar = new w(this);
            this.f269a = wVar;
        }
        wVar.e(androidx.lifecycle.n.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        w wVar = this.f269a;
        if (wVar == null) {
            wVar = new w(this);
            this.f269a = wVar;
        }
        wVar.e(androidx.lifecycle.n.ON_DESTROY);
        this.f269a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        e();
        super.setContentView(i10);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        h0.u(view, "view");
        e();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h0.u(view, "view");
        e();
        super.setContentView(view, layoutParams);
    }
}

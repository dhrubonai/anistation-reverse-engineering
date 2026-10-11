package defpackage;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.anistation.android.R;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class cs0 extends Dialog implements og3, xd4, n74, ga5 {
    public final d46 A;
    public rg3 x;
    public final fa5 y;
    public final d46 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs0(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, 0);
        final byte b = 0;
        this.y = new fa5(new rq3(this, new nj4(this, (byte) 12)));
        this.z = new d46(new sb2(this) { // from class: bs0
            public final /* synthetic */ cs0 y;

            {
                this.y = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [u74, java.lang.Object] */
            @Override // defpackage.sb2
            public final Object invoke() {
                byte b2 = b;
                cs0 cs0Var = this.y;
                switch (b2) {
                    case 0:
                        ?? obj = new Object();
                        cs0Var.getNavigationEventDispatcher().b(obj);
                        return obj;
                    default:
                        return new wd4(new p0(cs0Var, (byte) 10));
                }
            }
        });
        final byte b2 = 1;
        this.A = new d46(new sb2(this) { // from class: bs0
            public final /* synthetic */ cs0 y;

            {
                this.y = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [u74, java.lang.Object] */
            @Override // defpackage.sb2
            public final Object invoke() {
                byte b22 = b2;
                cs0 cs0Var = this.y;
                switch (b22) {
                    case 0:
                        ?? obj = new Object();
                        cs0Var.getNavigationEventDispatcher().b(obj);
                        return obj;
                    default:
                        return new wd4(new p0(cs0Var, (byte) 10));
                }
            }
        });
    }

    public static final void c(cs0 cs0Var) {
        super.onBackPressed();
    }

    public final rg3 a() {
        rg3 rg3Var = this.x;
        if (rg3Var == null) {
            rg3 rg3Var2 = new rg3(this, true);
            this.x = rg3Var2;
            return rg3Var2;
        }
        return rg3Var;
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // defpackage.og3
    public final fg3 getLifecycle() {
        return a();
    }

    @Override // defpackage.n74
    public final m74 getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().b().c;
    }

    @Override // defpackage.xd4
    public final wd4 getOnBackPressedDispatcher() {
        return (wd4) this.A.getValue();
    }

    @Override // defpackage.ga5
    public final ea5 getSavedStateRegistry() {
        return this.y.b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((sg1) this.z.getValue()).a();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            wd4 onBackPressedDispatcher = getOnBackPressedDispatcher();
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            onBackPressedDispatcher.c(onBackInvokedDispatcher);
        }
        this.y.a(bundle);
        a().e(dg3.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        this.y.b(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        a().e(dg3.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        a().e(dg3.ON_DESTROY);
        this.x = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        view.getClass();
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(int i) {
        b();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        b();
        super.setContentView(view, layoutParams);
    }
}

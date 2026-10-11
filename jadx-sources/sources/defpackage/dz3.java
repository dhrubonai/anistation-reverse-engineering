package defpackage;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.anistation.android.R;
import java.util.UUID;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dz3 extends cs0 {
    public sb2 B;
    public sz3 C;
    public long D;
    public final View E;
    public final az3 F;

    public dz3(sb2 sb2Var, sz3 sz3Var, long j, View view, ia3 ia3Var, ud1 ud1Var, UUID uuid, wj wjVar, v11 v11Var) {
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme), 0);
        w57 w57Var;
        boolean Y;
        boolean Y2;
        this.B = sb2Var;
        this.C = sz3Var;
        this.D = j;
        this.E = view;
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
            window.setBackgroundDrawableResource(android.R.color.transparent);
            yu5.k(window, false);
            az3 az3Var = new az3(getContext(), window);
            az3Var.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
            az3Var.setClipChildren(false);
            az3Var.setElevation(ud1Var.g0(8.0f));
            az3Var.setOutlineProvider(new gg1((byte) 1));
            this.F = az3Var;
            setContentView(az3Var);
            az3Var.setTag(R.id.view_tree_lifecycle_owner, rz5.c(view));
            az3Var.setTag(R.id.view_tree_view_model_store_owner, ss5.d(view));
            az3Var.setTag(R.id.view_tree_saved_state_registry_owner, qs5.f(view));
            d(this.B, this.C, this.D, ia3Var);
            fq3 fq3Var = new fq3(window.getDecorView());
            int i = Build.VERSION.SDK_INT;
            if (i >= 35) {
                w57Var = new w57(window, fq3Var, (byte) 1);
            } else if (i >= 30) {
                w57Var = new w57(window, fq3Var, (byte) 1);
            } else {
                w57Var = new w57(window, fq3Var, (byte) 0);
            }
            Boolean bool = this.C.c;
            if (bool != null) {
                Y = bool.booleanValue();
            } else {
                Y = db.Y(this.D);
            }
            w57Var.f(Y);
            Boolean bool2 = this.C.d;
            if (bool2 != null) {
                Y2 = bool2.booleanValue();
            } else {
                Y2 = db.Y(this.D);
            }
            w57Var.e(Y2);
            getOnBackPressedDispatcher().a(this, new cz3(this.C.a, v11Var, wjVar, new vt0(this, (byte) 23)));
            return;
        }
        ze0.m("Dialog has no window");
        throw null;
    }

    public final void d(sb2 sb2Var, sz3 sz3Var, long j, ia3 ia3Var) {
        WindowManager.LayoutParams layoutParams;
        boolean z;
        int i;
        int i2;
        this.B = sb2Var;
        this.C = sz3Var;
        this.D = j;
        sz3Var.getClass();
        ViewGroup.LayoutParams layoutParams2 = this.E.getRootView().getLayoutParams();
        if (layoutParams2 instanceof WindowManager.LayoutParams) {
            layoutParams = (WindowManager.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        int i3 = 1;
        if (layoutParams != null && (layoutParams.flags & 8192) != 0) {
            z = true;
        } else {
            z = false;
        }
        Window window = getWindow();
        window.getClass();
        if (z) {
            i = 8192;
        } else {
            i = -8193;
        }
        window.setFlags(i, 8192);
        int ordinal = ia3Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                ze0.l();
                return;
            }
        } else {
            i3 = 0;
        }
        this.F.setLayoutDirection(i3);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                i2 = 48;
            } else {
                i2 = 16;
            }
            window3.setSoftInputMode(i2);
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent) {
            this.B.invoke();
        }
        return onTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}

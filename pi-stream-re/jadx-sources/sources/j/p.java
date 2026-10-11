package j;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class p implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, b0 {

    /* renamed from: a, reason: collision with root package name */
    public final o f5569a;

    /* renamed from: b, reason: collision with root package name */
    public f.j f5570b;

    /* renamed from: c, reason: collision with root package name */
    public k f5571c;

    public p(o oVar) {
        this.f5569a = oVar;
    }

    @Override // j.b0
    public final void a(o oVar, boolean z9) {
        f.j jVar;
        if ((z9 || oVar == this.f5569a) && (jVar = this.f5570b) != null) {
            jVar.dismiss();
        }
    }

    @Override // j.b0
    public final boolean m(o oVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        k kVar = this.f5571c;
        if (kVar.f5538f == null) {
            kVar.f5538f = new j(kVar);
        }
        this.f5569a.q(kVar.f5538f.getItem(i10), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f5571c.a(this.f5569a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        o oVar = this.f5569a;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f5570b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f5570b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                oVar.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return oVar.performShortcut(i10, keyEvent, 0);
    }
}

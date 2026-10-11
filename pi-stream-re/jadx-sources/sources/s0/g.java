package s0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import w.r;

/* loaded from: classes.dex */
public final class g implements KeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final KeyListener f9739a;

    /* renamed from: b, reason: collision with root package name */
    public final j6.e f9740b;

    public g(KeyListener keyListener) {
        j6.e eVar = new j6.e(15);
        this.f9739a = keyListener;
        this.f9740b = eVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f9739a.clearMetaKeyState(view, editable, i10);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f9739a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        boolean a10;
        boolean z9;
        this.f9740b.getClass();
        Object obj = q0.l.f8922i;
        if (i10 != 67) {
            if (i10 != 112) {
                a10 = false;
            } else {
                a10 = r.a(editable, keyEvent, true);
            }
        } else {
            a10 = r.a(editable, keyEvent, false);
        }
        if (a10) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9 && !this.f9739a.onKeyDown(view, editable, i10, keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f9739a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f9739a.onKeyUp(view, editable, i10, keyEvent);
    }
}

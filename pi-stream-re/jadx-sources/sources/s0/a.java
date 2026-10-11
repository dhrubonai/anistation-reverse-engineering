package s0;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class a extends j6.e {

    /* renamed from: b, reason: collision with root package name */
    public final EditText f9725b;

    /* renamed from: c, reason: collision with root package name */
    public final k f9726c;

    public a(EditText editText) {
        super(13);
        this.f9725b = editText;
        k kVar = new k(editText);
        this.f9726c = kVar;
        editText.addTextChangedListener(kVar);
        if (c.f9731b == null) {
            synchronized (c.f9730a) {
                if (c.f9731b == null) {
                    c.f9731b = new c();
                }
            }
        }
        editText.setEditableFactory(c.f9731b);
    }

    @Override // j6.e
    public final KeyListener p(KeyListener keyListener) {
        if (keyListener instanceof g) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        return new g(keyListener);
    }

    @Override // j6.e
    public final InputConnection u(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection instanceof d) {
            return inputConnection;
        }
        return new d(this.f9725b, inputConnection, editorInfo);
    }

    @Override // j6.e
    public final void z(boolean z9) {
        k kVar = this.f9726c;
        if (kVar.f9749d != z9) {
            if (kVar.f9748c != null) {
                q0.l a10 = q0.l.a();
                j jVar = kVar.f9748c;
                a10.getClass();
                com.bumptech.glide.d.k(jVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a10.f8924a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a10.f8925b.remove(jVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            kVar.f9749d = z9;
            if (z9) {
                k.a(kVar.f9746a, q0.l.a().b());
            }
        }
    }
}

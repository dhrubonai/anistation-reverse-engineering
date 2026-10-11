package defpackage;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bt1 extends hs1 implements Runnable {
    public final WeakReference x;

    public bt1(rp rpVar) {
        this.x = new WeakReference(rpVar);
    }

    @Override // defpackage.hs1
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.x.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ct1.a((EditText) this.x.get(), 1);
    }
}

package q0;

/* loaded from: classes.dex */
public final class q implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        try {
            int i10 = c0.n.f1613a;
            c0.m.a("EmojiCompat.EmojiCompatInitializer.run");
            if (l.f8923j != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                l.a().c();
            }
            c0.m.b();
        } catch (Throwable th) {
            int i11 = c0.n.f1613a;
            c0.m.b();
            throw th;
        }
    }
}

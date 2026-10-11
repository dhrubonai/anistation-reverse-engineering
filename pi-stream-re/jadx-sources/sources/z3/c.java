package z3;

import java.util.ArrayDeque;
import p4.m;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f12040a;

    public c(int i10) {
        if (i10 != 1) {
            this.f12040a = new ArrayDeque();
        } else {
            char[] cArr = m.f8575a;
            this.f12040a = new ArrayDeque(0);
        }
    }

    public final b a() {
        b bVar;
        synchronized (this.f12040a) {
            bVar = (b) this.f12040a.poll();
        }
        if (bVar == null) {
            return new b();
        }
        return bVar;
    }

    public final void b(b bVar) {
        synchronized (this.f12040a) {
            if (this.f12040a.size() < 10) {
                this.f12040a.offer(bVar);
            }
        }
    }

    public final synchronized void c(u3.d dVar) {
        dVar.f10221b = null;
        dVar.f10222c = null;
        this.f12040a.offer(dVar);
    }
}

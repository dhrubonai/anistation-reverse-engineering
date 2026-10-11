package t7;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p7.h0;
import p7.s0;
import p7.u1;

/* loaded from: classes.dex */
public final class i extends h0 implements b7.d, z6.e {

    /* renamed from: y, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10061y = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: d, reason: collision with root package name */
    public final p7.w f10062d;

    /* renamed from: e, reason: collision with root package name */
    public final z6.e f10063e;

    /* renamed from: f, reason: collision with root package name */
    public Object f10064f;

    /* renamed from: x, reason: collision with root package name */
    public final Object f10065x;

    public i(p7.w wVar, z6.e eVar) {
        super(-1);
        this.f10062d = wVar;
        this.f10063e = eVar;
        this.f10064f = j.f10066a;
        Object x9 = getContext().x(0, z.f10094b);
        r6.h0.q(x9);
        this.f10065x = x9;
    }

    @Override // p7.h0
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof p7.u) {
            ((p7.u) obj).f8747b.invoke(cancellationException);
        }
    }

    @Override // p7.h0
    public final z6.e f() {
        return this;
    }

    @Override // b7.d
    public final b7.d getCallerFrame() {
        z6.e eVar = this.f10063e;
        if (eVar instanceof b7.d) {
            return (b7.d) eVar;
        }
        return null;
    }

    @Override // z6.e
    public final z6.i getContext() {
        return this.f10063e.getContext();
    }

    @Override // p7.h0
    public final Object k() {
        Object obj = this.f10064f;
        this.f10064f = j.f10066a;
        return obj;
    }

    @Override // z6.e
    public final void resumeWith(Object obj) {
        Object tVar;
        boolean z9;
        z6.e eVar = this.f10063e;
        z6.i context = eVar.getContext();
        Throwable a10 = w6.d.a(obj);
        if (a10 == null) {
            tVar = obj;
        } else {
            tVar = new p7.t(a10, false);
        }
        p7.w wVar = this.f10062d;
        if (wVar.H()) {
            this.f10064f = tVar;
            this.f8686c = 0;
            wVar.G(context, this);
            return;
        }
        s0 a11 = u1.a();
        if (a11.f8739c >= 4294967296L) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            this.f10064f = tVar;
            this.f8686c = 0;
            x6.h hVar = a11.f8741e;
            if (hVar == null) {
                hVar = new x6.h();
                a11.f8741e = hVar;
            }
            hVar.b(this);
            return;
        }
        a11.K(true);
        try {
            z6.i context2 = getContext();
            Object b10 = z.b(context2, this.f10065x);
            try {
                eVar.resumeWith(obj);
                do {
                } while (a11.L());
            } finally {
                z.a(context2, b10);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f10062d + ", " + p7.a0.c0(this.f10063e) + ']';
    }
}

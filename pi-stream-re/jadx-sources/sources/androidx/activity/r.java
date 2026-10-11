package androidx.activity;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.k0;
import androidx.fragment.app.s0;
import androidx.fragment.app.z;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f284a;

    /* renamed from: c, reason: collision with root package name */
    public final z f286c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f287d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f288e;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f285b = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    public boolean f289f = false;

    public r(Runnable runnable) {
        this.f284a = runnable;
        if (com.bumptech.glide.d.G()) {
            int i10 = 2;
            this.f286c = new z(this, i10);
            this.f287d = o.a(new b(this, i10));
        }
    }

    public final void a() {
        Iterator descendingIterator = this.f285b.descendingIterator();
        while (descendingIterator.hasNext()) {
            k0 k0Var = (k0) descendingIterator.next();
            if (k0Var.f919a) {
                s0 s0Var = k0Var.f922d;
                s0Var.x(true);
                if (s0Var.f975h.f919a) {
                    s0Var.N();
                    return;
                } else {
                    s0Var.f974g.a();
                    return;
                }
            }
        }
        Runnable runnable = this.f284a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void b() {
        boolean z9;
        Iterator descendingIterator = this.f285b.descendingIterator();
        while (true) {
            if (descendingIterator.hasNext()) {
                if (((k0) descendingIterator.next()).f919a) {
                    z9 = true;
                    break;
                }
            } else {
                z9 = false;
                break;
            }
        }
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f288e;
        if (onBackInvokedDispatcher != null) {
            OnBackInvokedCallback onBackInvokedCallback = this.f287d;
            if (z9 && !this.f289f) {
                o.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f289f = true;
            } else if (!z9 && this.f289f) {
                o.c(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f289f = false;
            }
        }
    }
}

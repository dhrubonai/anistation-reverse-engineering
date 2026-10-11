package w6;

import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import java.io.Serializable;
import r6.h0;

/* loaded from: classes.dex */
public final class e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public h7.a f11016a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f11017b = q0.f1135y;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11018c = this;

    public e(r0 r0Var) {
        this.f11016a = r0Var;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f11017b;
        q0 q0Var = q0.f1135y;
        if (obj2 != q0Var) {
            return obj2;
        }
        synchronized (this.f11018c) {
            obj = this.f11017b;
            if (obj == q0Var) {
                h7.a aVar = this.f11016a;
                h0.q(aVar);
                obj = aVar.a();
                this.f11017b = obj;
                this.f11016a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        boolean z9;
        if (this.f11017b != q0.f1135y) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}

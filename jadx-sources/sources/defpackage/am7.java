package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class am7 extends BasePendingResult {
    public ub7 l;
    public final boolean m;
    public final /* synthetic */ s25 n;

    public am7(s25 s25Var, boolean z) {
        Objects.requireNonNull(s25Var);
        this.n = s25Var;
        this.m = z;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ a55 b(Status status) {
        return new hl7(this, status);
    }

    public abstract void i();

    public final wk7 j() {
        ub7 ub7Var = this.l;
        if (ub7Var == null) {
            ub7 ub7Var2 = new ub7(this, (byte) 2);
            this.l = ub7Var2;
            return ub7Var2;
        }
        return ub7Var;
    }

    public final void k() {
        if (!this.m) {
            s25 s25Var = this.n;
            Iterator it = s25Var.g.iterator();
            if (!it.hasNext()) {
                Iterator it2 = s25Var.h.iterator();
                while (it2.hasNext()) {
                    ((r25) it2.next()).getClass();
                }
            } else {
                throw qx1.f(it);
            }
        }
        try {
            synchronized (this.n.a) {
                i();
            }
        } catch (lk7 unused) {
            e(new hl7(this, new Status(2100, null, null, null)));
        }
    }
}

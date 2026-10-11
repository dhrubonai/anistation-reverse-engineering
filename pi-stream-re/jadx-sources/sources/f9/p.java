package f9;

import androidx.lifecycle.q0;
import java.io.IOException;
import java.util.List;
import r6.h0;

/* loaded from: classes.dex */
public final class p extends b9.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f4067e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4068f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f4069g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str, t tVar, int i10, List list, boolean z9) {
        super(str, true);
        this.f4067e = tVar;
        this.f4068f = i10;
        this.f4069g = list;
    }

    @Override // b9.a
    public final long a() {
        q0 q0Var = this.f4067e.C;
        List list = this.f4069g;
        q0Var.getClass();
        h0.u(list, "responseHeaders");
        try {
            this.f4067e.P.x(this.f4068f, b.CANCEL);
            synchronized (this.f4067e) {
                this.f4067e.R.remove(Integer.valueOf(this.f4068f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}

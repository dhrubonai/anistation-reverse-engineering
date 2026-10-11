package f9;

import androidx.lifecycle.q0;
import java.io.IOException;
import r6.h0;

/* loaded from: classes.dex */
public final class o extends b9.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f4063e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4064f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k9.g f4065g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4066h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, t tVar, int i10, k9.g gVar, int i11, boolean z9) {
        super(str, true);
        this.f4063e = tVar;
        this.f4064f = i10;
        this.f4065g = gVar;
        this.f4066h = i11;
    }

    @Override // b9.a
    public final long a() {
        try {
            q0 q0Var = this.f4063e.C;
            k9.g gVar = this.f4065g;
            int i10 = this.f4066h;
            q0Var.getClass();
            h0.u(gVar, "source");
            gVar.b(i10);
            this.f4063e.P.x(this.f4064f, b.CANCEL);
            synchronized (this.f4063e) {
                this.f4063e.R.remove(Integer.valueOf(this.f4064f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}

package f9;

import androidx.lifecycle.q0;
import java.io.IOException;
import java.util.List;
import r6.h0;

/* loaded from: classes.dex */
public final class q extends b9.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4070e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t f4071f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4072g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f4073h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(String str, t tVar, int i10, Object obj, int i11) {
        super(str, true);
        this.f4070e = i11;
        this.f4071f = tVar;
        this.f4072g = i10;
        this.f4073h = obj;
    }

    private void b() {
        q0 q0Var = this.f4071f.C;
        List list = (List) this.f4073h;
        q0Var.getClass();
        h0.u(list, "requestHeaders");
        try {
            this.f4071f.P.x(this.f4072g, b.CANCEL);
            synchronized (this.f4071f) {
                this.f4071f.R.remove(Integer.valueOf(this.f4072g));
            }
        } catch (IOException unused) {
        }
    }

    @Override // b9.a
    public final long a() {
        switch (this.f4070e) {
            case 0:
                q0 q0Var = this.f4071f.C;
                b bVar = (b) this.f4073h;
                q0Var.getClass();
                h0.u(bVar, "errorCode");
                synchronized (this.f4071f) {
                    this.f4071f.R.remove(Integer.valueOf(this.f4072g));
                }
                return -1L;
            case 1:
                t tVar = this.f4071f;
                try {
                    int i10 = this.f4072g;
                    b bVar2 = (b) this.f4073h;
                    tVar.getClass();
                    h0.u(bVar2, "statusCode");
                    tVar.P.x(i10, bVar2);
                } catch (IOException e10) {
                    tVar.f(e10);
                }
                return -1L;
            default:
                b();
                return -1L;
        }
    }
}

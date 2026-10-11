package g0;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class e1 extends b7.g implements h7.p {

    /* renamed from: b, reason: collision with root package name */
    public ViewGroup f4190b;

    /* renamed from: c, reason: collision with root package name */
    public View f4191c;

    /* renamed from: d, reason: collision with root package name */
    public int f4192d;

    /* renamed from: e, reason: collision with root package name */
    public int f4193e;

    /* renamed from: f, reason: collision with root package name */
    public int f4194f;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f4195x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f4196y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(ViewGroup viewGroup, z6.e eVar) {
        super(eVar);
        this.f4196y = viewGroup;
    }

    @Override // b7.a
    public final z6.e create(Object obj, z6.e eVar) {
        e1 e1Var = new e1(this.f4196y, eVar);
        e1Var.f4195x = obj;
        return e1Var;
    }

    @Override // h7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e1) create((n7.d) obj, (z6.e) obj2)).invokeSuspend(w6.f.f11019a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0093 -> B:6:0x0095). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009c -> B:7:0x00a0). Please report as a decompilation issue!!! */
    @Override // b7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            a7.a r0 = a7.a.f156a
            int r1 = r12.f4194f
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 == r3) goto L24
            if (r1 != r2) goto L1c
            int r1 = r12.f4193e
            int r4 = r12.f4192d
            android.view.ViewGroup r5 = r12.f4190b
            java.lang.Object r6 = r12.f4195x
            n7.d r6 = (n7.d) r6
            r6.h0.V0(r13)
            r13 = r12
            goto L95
        L1c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L24:
            int r1 = r12.f4193e
            int r4 = r12.f4192d
            android.view.View r5 = r12.f4191c
            android.view.ViewGroup r6 = r12.f4190b
            java.lang.Object r7 = r12.f4195x
            n7.d r7 = (n7.d) r7
            r6.h0.V0(r13)
            r13 = r12
            goto L6a
        L35:
            r6.h0.V0(r13)
            java.lang.Object r13 = r12.f4195x
            n7.d r13 = (n7.d) r13
            android.view.ViewGroup r1 = r12.f4196y
            int r4 = r1.getChildCount()
            r5 = 0
            r6 = r12
        L44:
            if (r5 >= r4) goto La5
            android.view.View r7 = r1.getChildAt(r5)
            java.lang.String r8 = "getChildAt(index)"
            r6.h0.s(r7, r8)
            r6.f4195x = r13
            r6.f4190b = r1
            r6.f4191c = r7
            r6.f4192d = r5
            r6.f4193e = r4
            r6.f4194f = r3
            r13.b(r7, r6)
            a7.a r8 = a7.a.f156a
            if (r8 != r0) goto L63
            return r0
        L63:
            r10 = r7
            r7 = r13
            r13 = r6
            r6 = r1
            r1 = r4
            r4 = r5
            r5 = r10
        L6a:
            boolean r8 = r5 instanceof android.view.ViewGroup
            if (r8 == 0) goto L9c
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            java.lang.String r8 = "<this>"
            r6.h0.u(r5, r8)
            g0.e1 r8 = new g0.e1
            r9 = 0
            r8.<init>(r5, r9)
            g0.d1 r5 = new g0.d1
            r5.<init>(r8, r2)
            r13.f4195x = r7
            r13.f4190b = r6
            r13.f4191c = r9
            r13.f4192d = r4
            r13.f4193e = r1
            r13.f4194f = r2
            java.lang.Object r5 = r7.f(r5, r13)
            if (r5 != r0) goto L93
            return r0
        L93:
            r5 = r6
            r6 = r7
        L95:
            r10 = r6
            r6 = r13
            r13 = r10
            r11 = r5
            r5 = r1
            r1 = r11
            goto La0
        L9c:
            r5 = r1
            r1 = r6
            r6 = r13
            r13 = r7
        La0:
            int r4 = r4 + r3
            r10 = r5
            r5 = r4
            r4 = r10
            goto L44
        La5:
            w6.f r13 = w6.f.f11019a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.e1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

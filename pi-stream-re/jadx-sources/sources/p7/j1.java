package p7;

/* loaded from: classes.dex */
public final class j1 extends b7.g implements h7.p {

    /* renamed from: b, reason: collision with root package name */
    public n1 f8703b;

    /* renamed from: c, reason: collision with root package name */
    public t7.n f8704c;

    /* renamed from: d, reason: collision with root package name */
    public int f8705d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f8706e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k1 f8707f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(z6.e eVar, k1 k1Var) {
        super(eVar);
        this.f8707f = k1Var;
    }

    @Override // b7.a
    public final z6.e create(Object obj, z6.e eVar) {
        j1 j1Var = new j1(eVar, this.f8707f);
        j1Var.f8706e = obj;
        return j1Var;
    }

    @Override // h7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((j1) create((n7.d) obj, (z6.e) obj2)).invokeSuspend(w6.f.f11019a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0062  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0064 -> B:6:0x007b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0078 -> B:6:0x007b). Please report as a decompilation issue!!! */
    @Override // b7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            a7.a r0 = a7.a.f156a
            int r1 = r7.f8705d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L25
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            t7.n r1 = r7.f8704c
            p7.n1 r3 = r7.f8703b
            java.lang.Object r4 = r7.f8706e
            n7.d r4 = (n7.d) r4
            r6.h0.V0(r8)
            r8 = r7
            goto L7b
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L21:
            r6.h0.V0(r8)
            goto L80
        L25:
            r6.h0.V0(r8)
            java.lang.Object r8 = r7.f8706e
            n7.d r8 = (n7.d) r8
            p7.k1 r1 = r7.f8707f
            java.lang.Object r1 = r1.B()
            boolean r4 = r1 instanceof p7.o
            if (r4 == 0) goto L40
            p7.o r1 = (p7.o) r1
            p7.p r1 = r1.f8725e
            r7.f8705d = r3
            r8.b(r1, r7)
            return r0
        L40:
            boolean r3 = r1 instanceof p7.x0
            if (r3 == 0) goto L80
            p7.x0 r1 = (p7.x0) r1
            p7.n1 r1 = r1.d()
            if (r1 == 0) goto L80
            java.lang.Object r3 = r1.g()
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            r6.h0.r(r3, r4)
            t7.n r3 = (t7.n) r3
            r4 = r8
            r8 = r7
            r6 = r3
            r3 = r1
            r1 = r6
        L5c:
            boolean r5 = r6.h0.g(r1, r3)
            if (r5 != 0) goto L80
            boolean r5 = r1 instanceof p7.o
            if (r5 == 0) goto L7b
            r5 = r1
            p7.o r5 = (p7.o) r5
            r8.f8706e = r4
            r8.f8703b = r3
            r8.f8704c = r1
            r8.f8705d = r2
            p7.p r5 = r5.f8725e
            r4.b(r5, r8)
            a7.a r5 = a7.a.f156a
            if (r5 != r0) goto L7b
            return r0
        L7b:
            t7.n r1 = r1.h()
            goto L5c
        L80:
            w6.f r8 = w6.f.f11019a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.j1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

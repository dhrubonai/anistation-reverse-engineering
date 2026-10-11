package a7;

import h7.p;
import q6.g;
import r6.h0;
import z6.e;
import z6.i;

/* loaded from: classes.dex */
public final class c extends b7.c {

    /* renamed from: a, reason: collision with root package name */
    public int f161a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f162b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f163c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, i iVar, p pVar, Object obj) {
        super(eVar, iVar);
        this.f162b = pVar;
        this.f163c = obj;
        h0.r(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // b7.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f161a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f161a = 2;
                h0.V0(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
        this.f161a = 1;
        h0.V0(obj);
        p pVar = this.f162b;
        h0.r(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        g.e(pVar);
        return pVar.invoke(this.f163c, this);
    }
}

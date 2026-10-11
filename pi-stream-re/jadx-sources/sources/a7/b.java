package a7;

import b7.f;
import h7.p;
import q6.g;
import r6.h0;
import z6.e;

/* loaded from: classes.dex */
public final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    public int f158a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f159b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f160c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Object obj, e eVar, p pVar) {
        super(eVar);
        this.f159b = pVar;
        this.f160c = obj;
        h0.r(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // b7.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f158a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f158a = 2;
                h0.V0(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
        this.f158a = 1;
        h0.V0(obj);
        p pVar = this.f159b;
        h0.r(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        g.e(pVar);
        return pVar.invoke(this.f160c, this);
    }
}

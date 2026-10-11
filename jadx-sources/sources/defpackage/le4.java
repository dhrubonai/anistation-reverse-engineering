package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class le4 extends uc2 implements jc2 {
    public static final le4 x = new uc2(3, me4.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        me4 me4Var = (me4) obj;
        ng5 ng5Var = (ng5) obj2;
        long j = me4Var.a;
        pn6 pn6Var = pn6.a;
        if (j <= 0) {
            ng5Var.B = pn6Var;
            return pn6Var;
        }
        f32 f32Var = new f32(ng5Var, me4Var, (byte) 21);
        ng5Var.getClass();
        l11 l11Var = ng5Var.x;
        ng5Var.z = x97.C(l11Var).a(j, f32Var, l11Var);
        return pn6Var;
    }
}

package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final /* synthetic */ class r43 extends uc2 implements jc2 {
    public static final r43 x = new uc2(3, t43.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        t43 t43Var = (t43) obj;
        ng5 ng5Var = (ng5) obj2;
        int i = t43.z;
        while (true) {
            Object K = t43Var.K();
            if (!(K instanceof ox2)) {
                if (!(K instanceof dr0)) {
                    K = u43.a(K);
                }
                ng5Var.B = K;
            } else if (t43Var.b0(K) >= 0) {
                ng5Var.z = h98.A(t43Var, true, new p43(t43Var, ng5Var));
                break;
            }
        }
        return pn6.a;
    }
}

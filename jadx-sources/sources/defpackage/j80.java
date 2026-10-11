package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class j80 extends t36 implements ic2 {
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ do5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j80(do5 do5Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = do5Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        do5 do5Var = this.z;
        switch (b) {
            case 0:
                return new j80(do5Var, vz0Var, (byte) 0);
            case 1:
                return new j80(do5Var, vz0Var, (byte) 1);
            case 2:
                return new j80(do5Var, vz0Var, (byte) 2);
            case 3:
                return new j80(do5Var, vz0Var, (byte) 3);
            case 4:
                return new j80(do5Var, vz0Var, (byte) 4);
            case 5:
                return new j80(do5Var, vz0Var, (byte) 5);
            case 6:
                return new j80(do5Var, vz0Var, (byte) 6);
            case 7:
                return new j80(do5Var, vz0Var, (byte) 7);
            case 8:
                return new j80(do5Var, vz0Var, (byte) 8);
            case 9:
                return new j80(do5Var, vz0Var, (byte) 9);
            case 10:
                return new j80(do5Var, vz0Var, (byte) 10);
            case 11:
                return new j80(do5Var, vz0Var, (byte) 11);
            case 12:
                return new j80(do5Var, vz0Var, (byte) 12);
            default:
                return new j80(do5Var, vz0Var, (byte) 13);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        v11 v11Var = (v11) obj;
        vz0 vz0Var = (vz0) obj2;
        switch (b) {
            case 0:
                return ((j80) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 1:
                return ((j80) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 2:
                return ((j80) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 3:
                return ((j80) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 4:
                return ((j80) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 5:
                return ((j80) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 6:
                return ((j80) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 7:
                return ((j80) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 8:
                return ((j80) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 9:
                return ((j80) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 10:
                return ((j80) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 11:
                return ((j80) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 12:
                return ((j80) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((j80) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        do5 do5Var = this.z;
        w11 w11Var = w11.x;
        switch (b) {
            case 0:
                boolean z = this.y;
                if (z) {
                    if (z) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                this.y = true;
                if (do5Var.b(this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 1:
                boolean z2 = this.y;
                if (z2) {
                    if (z2) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                this.y = true;
                if (do5Var.g(this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 2:
                boolean z3 = this.y;
                if (z3) {
                    if (z3) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                this.y = true;
                if (do5Var.b(this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 3:
                boolean z4 = this.y;
                if (z4) {
                    if (z4) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                this.y = true;
                if (do5Var.f(this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 4:
                boolean z5 = this.y;
                if (z5) {
                    if (z5) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                this.y = true;
                if (do5Var.d(this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 5:
                boolean z6 = this.y;
                if (z6) {
                    if (z6) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                this.y = true;
                if (do5Var.d(this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 6:
                boolean z7 = this.y;
                if (z7) {
                    if (z7) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                this.y = true;
                if (do5Var.f(this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 7:
                boolean z8 = this.y;
                if (z8) {
                    if (z8) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                this.y = true;
                if (do5Var.d(this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 8:
                boolean z9 = this.y;
                if (z9) {
                    if (z9) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                this.y = true;
                if (do5Var.g(this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 9:
                boolean z10 = this.y;
                if (z10) {
                    if (z10) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                this.y = true;
                if (do5Var.d(this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 10:
                boolean z11 = this.y;
                if (z11) {
                    if (z11) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                this.y = true;
                if (do5Var.b(this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 11:
                boolean z12 = this.y;
                if (z12) {
                    if (z12) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                this.y = true;
                if (do5Var.g(this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 12:
                boolean z13 = this.y;
                if (z13) {
                    if (z13) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                this.y = true;
                if (do5Var.b(this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            default:
                boolean z14 = this.y;
                if (z14) {
                    if (z14) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                this.y = true;
                if (do5Var.f(this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
        }
    }
}

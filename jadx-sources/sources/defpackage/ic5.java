package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ic5 extends n6 implements ub2 {
    public final /* synthetic */ byte x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic5(v27 v27Var) {
        super(1, v27Var, v27.class, "loadEpisode", "loadEpisode(ILjava/lang/Long;)V", 0);
        this.x = (byte) 3;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                ((z44) this.receiver).b((kc5) obj);
                return pn6Var;
            case 1:
                Object c = ((yl4) this.receiver).c((vz0) obj);
                if (c == w11.x) {
                    return c;
                }
                return pn6Var;
            case 2:
                ((fa6) this.receiver).g1(((sv2) obj).a);
                return pn6Var;
            default:
                v27.u((v27) this.receiver, ((Number) obj).intValue());
                return pn6Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ic5(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.x = b;
    }
}

package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fr4 extends p2 {
    public final e73 a;
    public final rb3 b = bx7.B(jf3.y, new nj4(this, 1));

    public fr4(e73 e73Var) {
        this.a = e73Var;
    }

    @Override // defpackage.p2
    public final e73 a() {
        return this.a;
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return (aj5) this.b.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.a + ')';
    }
}
